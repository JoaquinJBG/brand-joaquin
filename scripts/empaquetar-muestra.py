"""Genera dist/marca-joaquin-beltran.html: la muestra en un solo archivo que se abre con doble clic.

Uso: python scripts/empaquetar-muestra.py
"""
import base64
import re
from pathlib import Path

raiz = Path(__file__).resolve().parent.parent


def leer(ruta):
    return (raiz / ruta).read_text(encoding="utf-8")


def svg_en_linea(ruta):
    datos = base64.b64encode((raiz / ruta).read_bytes()).decode()
    return f"data:image/svg+xml;base64,{datos}"


def incrustar_css(html, nombre):
    patron = rf'<link rel="stylesheet" href="\.\./tokens/{nombre}\.css[^"]*">'
    return re.sub(patron, lambda _: "<style>" + leer(f"tokens/{nombre}.css") + "</style>", html)


html = leer("muestra/index.html")
for nombre in ("fuentes", "tokens", "componentes"):
    html = incrustar_css(html, nombre)

nebulosa = leer("tokens/nebulosa.js").replace("export function montarNebulosa", "function montarNebulosa")
html = re.sub(r'import \{ montarNebulosa \} from "\.\./tokens/nebulosa\.js[^"]*";', lambda _: nebulosa, html)

html = re.sub(r'src="\.\./(logos|plantillas)/([^"?$]+\.svg)(\?[^"]*)?"',
              lambda m: f'src="{svg_en_linea(m.group(1) + "/" + m.group(2))}"', html)

# La rejilla de logos monta las rutas en JS, así que necesita un mapa con los SVG ya incrustados.
logos = sorted(p.parent.name for p in (raiz / "logos").glob("*/logo-franja.svg"))
mapa = "{" + ",".join(f'"{c}":"{svg_en_linea(f"logos/{c}/logo-franja.svg")}"' for c in logos) + "}"
html = html.replace("const logos = [", f"const LOGOS_SVG = {mapa};\nconst logos = [", 1)
html = re.sub(r'src="\.\./logos/\$\{c\}/logo-franja\.svg[^"]*"', 'src="${LOGOS_SVG[c]}"', html)

pendientes = re.findall(r'(?:href|src|from)="\.\./[^"]+"', html)
if pendientes:
    raise SystemExit(f"Quedan rutas relativas sin incrustar: {pendientes}")

salida = raiz / "dist" / "marca-joaquin-beltran.html"
salida.parent.mkdir(exist_ok=True)
salida.write_text(html, encoding="utf-8")
print(f"{salida} · {salida.stat().st_size // 1024} KB")
