// Uso: <div class="jb-fondo"><canvas></canvas></div> y montarNebulosa(canvas, { movimiento }).
// movimiento: "auto" respeta prefers-reduced-motion; "si" y "no" lo fuerzan.

const FRAG = `precision highp float;
uniform vec2 uRes; uniform float uTime; uniform float uLight;
float hash(vec2 p){return fract(sin(dot(p,vec2(127.1,311.7)))*43758.5453);}
float noise(vec2 p){vec2 i=floor(p),f=fract(p);f=f*f*(3.-2.*f);
  return mix(mix(hash(i),hash(i+vec2(1,0)),f.x),mix(hash(i+vec2(0,1)),hash(i+vec2(1,1)),f.x),f.y);}
float fbm(vec2 p){float v=0.,a=.5;for(int i=0;i<5;i++){v+=a*noise(p);p*=2.03;a*=.5;}return v;}
void main(){
  vec2 uv=gl_FragCoord.xy/uRes; vec2 p=uv; p.x*=uRes.x/uRes.y; float t=uTime*.06;
  vec2 q=vec2(fbm(p*1.6+vec2(0.,t)),fbm(p*1.6+vec2(5.2,1.3)+vec2(t,0.)));
  vec2 r=vec2(fbm(p*1.6+3.*q+vec2(1.7,9.2)+t*.7),fbm(p*1.6+3.*q+vec2(8.3,2.8)-t*.6));
  float f=clamp(fbm(p*1.6+3.2*r)*1.25,0.,1.);
  vec3 cobalto=vec3(.165,.447,.639), acero=vec3(.451,.541,.604), coral=vec3(.976,.447,.475);
  vec3 col=mix(cobalto,acero,smoothstep(.30,.62,f)); col=mix(col,coral,smoothstep(.72,.98,f)*.85);
  float sides=pow(abs(uv.x-.5)*2.,1.35);
  float vert=smoothstep(.05,.5,uv.y)*(1.-smoothstep(.6,1.05,uv.y));
  float k=pow(f,2.)*(.02+1.15*pow(sides,1.8))*(.45+.55*vert);
  vec3 dark=vec3(.039,.055,.075)+col*k*1.25;
  vec3 light=mix(vec3(.906,.933,.949),col,min(k*.75,.6));
  gl_FragColor=vec4(mix(dark,light,uLight),1.);
}`;
const VERT = "attribute vec2 p;void main(){gl_Position=vec4(p,0.,1.);}";
// la nebulosa es difusa: media resolución basta y va ligera en móvil
const ESCALA = 0.5;

function temaClaro() {
  const t = document.documentElement.dataset.theme;
  if (t === "light") return true;
  if (t === "dark") return false;
  return !matchMedia("(prefers-color-scheme: dark)").matches;
}

export function montarNebulosa(canvas, { movimiento = "auto" } = {}) {
  const gl = canvas.getContext("webgl", { antialias: false, alpha: false });
  const compilar = (tipo, src) => {
    const s = gl.createShader(tipo);
    gl.shaderSource(s, src);
    gl.compileShader(s);
    return gl.getShaderParameter(s, gl.COMPILE_STATUS) ? s : null;
  };
  const vs = gl && compilar(gl.VERTEX_SHADER, VERT);
  const fs = gl && compilar(gl.FRAGMENT_SHADER, FRAG);
  if (!vs || !fs) {
    canvas.parentElement?.classList.add("jb-fondo--sin-webgl");
    canvas.remove();
    return { destruir() {}, setMovimiento() {} };
  }

  const prog = gl.createProgram();
  gl.attachShader(prog, vs);
  gl.attachShader(prog, fs);
  gl.linkProgram(prog);
  gl.useProgram(prog);
  gl.bindBuffer(gl.ARRAY_BUFFER, gl.createBuffer());
  gl.bufferData(gl.ARRAY_BUFFER, new Float32Array([-1, -1, 1, -1, -1, 1, 1, 1]), gl.STATIC_DRAW);
  const loc = gl.getAttribLocation(prog, "p");
  gl.enableVertexAttribArray(loc);
  gl.vertexAttribPointer(loc, 2, gl.FLOAT, false, 0, 0);
  const uRes = gl.getUniformLocation(prog, "uRes");
  const uTime = gl.getUniformLocation(prog, "uTime");
  const uLight = gl.getUniformLocation(prog, "uLight");

  const reducir = matchMedia("(prefers-reduced-motion: reduce)");
  let modo = movimiento;
  const anima = () => {
    if (modo === "si") return true;
    if (modo === "no") return false;
    return !reducir.matches;
  };
  let tiempo = 8, ultimo = performance.now(), raf = 0;

  const pintar = (ahora = performance.now()) => {
    if (anima()) tiempo += (ahora - ultimo) / 1000;
    ultimo = ahora;
    gl.uniform2f(uRes, canvas.width, canvas.height);
    gl.uniform1f(uTime, tiempo);
    gl.uniform1f(uLight, temaClaro() ? 1 : 0);
    gl.drawArrays(gl.TRIANGLE_STRIP, 0, 4);
    raf = anima() ? requestAnimationFrame(pintar) : 0;
  };
  const relanzar = () => { cancelAnimationFrame(raf); ultimo = performance.now(); pintar(); };
  const medir = () => {
    const r = canvas.getBoundingClientRect();
    canvas.width = Math.max(1, Math.round(r.width * ESCALA));
    canvas.height = Math.max(1, Math.round(r.height * ESCALA));
    gl.viewport(0, 0, canvas.width, canvas.height);
    relanzar();
  };

  const ro = new ResizeObserver(medir);
  ro.observe(canvas);
  const mo = new MutationObserver(relanzar);
  mo.observe(document.documentElement, { attributes: true, attributeFilter: ["data-theme"] });
  const esquema = matchMedia("(prefers-color-scheme: dark)");
  esquema.addEventListener("change", relanzar);
  reducir.addEventListener("change", relanzar);
  medir();

  return {
    destruir() {
      cancelAnimationFrame(raf);
      ro.disconnect();
      mo.disconnect();
      esquema.removeEventListener("change", relanzar);
      reducir.removeEventListener("change", relanzar);
    },
    setMovimiento(nuevo) { modo = nuevo; relanzar(); },
  };
}
