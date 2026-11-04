# Guía de marca · Joaquín Beltrán

Versión 2.3.1 · 4 de noviembre de 2026 · Elegida por Joaquín en doce rondas (ver [DECISIONES.md](DECISIONES.md)).

Esta guía sirve para que todos los proyectos personales de Joaquín se reconozcan como suyos aunque no sean
iguales: misma paleta, misma letra, mismo fondo de nebulosa, mismo cristal con luz, mismo sello (la franja) y
misma forma de hablar. Cada proyecto tiene su propia estructura; lo que no cambia es lo de esta guía.

- Muestra viva: [`muestra/index.html`](muestra/index.html) (cómo abrirla en el [README](README.md))
- Tokens y piezas: [`tokens/`](tokens/) (CSS, nebulosa, Tailwind v3 y v4, Compose)
- Prompt para aplicarla con Claude: [`PROMPT-MARCA.md`](PROMPT-MARCA.md)

## Índice

1. [La idea en una frase](#1-la-idea-en-una-frase)
2. [Principios](#2-principios)
3. [Color](#3-color)
4. [Tipografía](#4-tipografía)
5. [Espacio y retícula](#5-espacio-y-retícula)
6. [Esquinas](#6-esquinas)
7. [Cristal y luz](#7-cristal-y-luz)
8. [Fondo: la nebulosa](#8-fondo-la-nebulosa)
9. [La franja (el sello)](#9-la-franja-el-sello)
10. [Secciones numeradas](#10-secciones-numeradas)
11. [Logos y monograma](#11-logos-y-monograma)
12. [Fotografía](#12-fotografía)
13. [Iconos](#13-iconos)
14. [Componentes](#14-componentes)
15. [Estados](#15-estados)
16. [Gráficas](#16-gráficas)
17. [Piezas de app](#17-piezas-de-app)
18. [Iconos, imagen para compartir y banner](#18-iconos-imagen-para-compartir-y-banner)
19. [Movimiento](#19-movimiento)
20. [Tono de voz](#20-tono-de-voz)
21. [Qué no hacemos](#21-qué-no-hacemos)
22. [Cómo aplicarla a un proyecto nuevo](#22-cómo-aplicarla-a-un-proyecto-nuevo)
23. [Llevarla a cada tecnología](#23-llevarla-a-cada-tecnología)
24. [Instalar y actualizar](#24-instalar-y-actualizar)

## 1. La idea en una frase

**Laboratorio con luz**: grises fríos, una nebulosa que fluye por los lados, paneles de cristal con un borde
de luz, un coral que brilla como un neón y una franja coral que cruza las fotos y los logos. Letra muy gruesa en
minúsculas.

Lo que tiene que pensar quien lo vea: *qué nivel técnico*, *qué elegante* y *esto es de otro planeta*.

## 2. Principios

1. **Gris y luz.** La base es fría y neutra. El color llega como luz: la nebulosa, el brillo coral y la franja.
2. **Un momento fuerte por pantalla.** La nebulosa, la foto con franja o una cifra grande. El resto, tranquilo.
3. **Letra gruesa, texto corto.** Títulos enormes en minúsculas; texto claro y breve.
4. **Cristal, no sombra.** La profundidad la dan el cristal y el brillo coral. Nunca una sombra gris bajo una
   tarjeta plana.
5. **Redondo para tocar.** Botones, etiquetas, campos y números de sección son cápsulas.
6. **Claro y oscuro, los dos de primera.** Landings y portadas en oscuro por defecto; apps, como diga el sistema
   si ya tienen los dos modos. Una app que solo tiene oscuro no gana modo claro sin que Joaquín lo pida.

## 3. Color

Mezcla de dos paletas que eligió Joaquín: la del astronauta (grises azulados fríos) y la de la flor (coral y
cobalto).

### Paleta base

| Nombre | Hex | Para qué |
|---|---|---|
| niebla | `#E7EEF2` | Fondo en claro. Texto en oscuro. |
| hielo | `#CCDBE2` | Superficie secundaria en claro. |
| acero | `#738A9A` | Logos en gris, nebulosa, detalles grandes. No para texto pequeño sobre claro. |
| pizarra | `#435565` | Texto secundario en claro. |
| salvia | `#697773` | Neutro de apoyo: gráficos, estados. |
| tinta | `#161D24` | Texto en claro, texto sobre coral, dentro de la franja. |
| abismo | `#0A0E13` | Fondo en oscuro (base de la nebulosa). |
| noche | `#121820` | Fondo oscuro alternativo para apps sin nebulosa. |
| **coral** | `#F97279` | **El color de la marca.** Botón principal, brillo, números, franja. |
| coral texto | `#B83A44` | El «neón» cuando va como texto en modo claro. |
| cobalto | `#2A72A3` | Nebulosa, borde de luz, barras. Enlaces: `#23648F` en claro, `#7FB4DA` en oscuro. |

### Roles (lo que usan los componentes)

| Rol (`--jb-…`) | Claro | Oscuro |
|---|---|---|
| `bg` fondo | niebla | abismo |
| `surface` | `#F4F8FA` | `#161D26` |
| `surface-2` | hielo | `#212B38` |
| `fg` texto | tinta | niebla |
| `fg-muted` texto secundario | pizarra | `#9DB0BD` |
| `line` separadores | tinta al 12 % | niebla al 12 % |
| `btn` / `on-btn` botón principal | coral / tinta | coral / tinta |
| `neon-text` cifras en neón | `#B83A44` | coral |
| `link` | `#23648F` | `#7FB4DA` |
| `glass-bg` cristal | blanco 78 → 55 % | blanco 8 → 3 % sobre abismo al 62 % |
| `nebula-base` | niebla | abismo |

### Contraste comprobado (WCAG)

| Combinación | Ratio | Uso permitido |
|---|---|---|
| tinta sobre niebla | 14,5 | todo |
| niebla sobre abismo | 16,5 | todo |
| tinta sobre coral | 6,2 | texto de botón principal, franja |
| `#B83A44` sobre niebla | 4,8 | cifras y texto neón en claro |
| coral sobre abismo | 7,1 | cifras y texto neón en oscuro |
| pizarra sobre niebla | 6,6 | texto secundario en claro |
| `#9DB0BD` sobre abismo | 8,6 | texto secundario en oscuro |
| `#23648F` sobre niebla | 5,4 | enlaces en claro |
| coral sobre niebla | 2,3 | **nunca texto**: solo bloques, luz y franja |

### Proporción

Unos 80 % neutros (fondo, cristal), 12 % texto, 8 % coral y cobalto (nebulosa, brillo, franja). Si el coral
pasa del 10 % de la pantalla, sobra.

### Color por proyecto

El coral es igual en todos los proyectos: es lo que los une. Si un proyecto necesita colores propios para
funcionar (series de una gráfica, estados), usa primero salvia, cobalto y hielo; si no llega, colores fríos y
apagados. Nunca otro color cálido que compita con el coral.

## 4. Tipografía

| Uso | Letra | Peso | Notas |
|---|---|---|---|
| Títulos, cifras, nombres de proyecto | **Bricolage Grotesque** | 800 | Minúsculas, interletra −0,045 em, interlínea apretada |
| Texto, botones, formularios, números de sección | **Geist** | 400 / 500 / 600 | Interlínea 1,6 |

Las dos son gratuitas en Google Fonts. No se usa letra monoespaciada de adorno (solo para código).

### Escala

| Token | Tamaño | Interlínea | Para |
|---|---|---|---|
| `hero` | clamp(72 px, 10,5 vw, 164 px) | 0,86 | Nombre o titular de portada |
| `h1` | clamp(56 px, 7,5 vw, 112 px) | 0,88 | Título de página |
| `h2` | clamp(44 px, 6 vw, 84 px) | 0,90 | Secciones |
| `h3` | 34 px | 0,95 | Nombres de proyecto |
| `h4` | 24 px | 1,00 | Subtítulos (interletra −0,03 em) |
| `stat` | 56 px | 1,00 | Cifras grandes (Bricolage 800, cifras tabulares) |
| `lead` | 18 px | 1,6 | Entradilla |
| `body` | 16 px | 1,6 | Texto normal |
| `small` | 14 px | 1,5 | Texto de tarjeta, ayudas |
| `caption` | 12 px | 1,4 | Créditos, etiquetas |

Reglas: títulos en minúsculas y sin punto final; nada de palabras sueltas en otro color dentro de un título;
líneas de 60–75 caracteres como mucho.

## 5. Espacio y retícula

Múltiplos de 4 px: `space-1` 4 · `space-2` 8 · `space-3` 12 · `space-4` 16 · `space-5` 24 · `space-6` 32 ·
`space-7` 48 · `space-8` 64 · `space-9` 96 · `space-10` 128.

- Contenedor máximo **1240 px**, márgenes laterales **24 px**, retícula de 12 columnas con 24 px de hueco.
- Alineación a la izquierda. Mucho aire entre secciones (96–128 px).

## 6. Esquinas

| Token | Valor | Para |
|---|---|---|
| `radius-sm` | 12 px | Miniaturas |
| `radius-md` | 16 px | Elementos dentro de un panel |
| `radius-lg` | 28 px | Paneles de cristal, fotos, bloques |
| `radius-full` | 999 px | Botones, etiquetas, campos, números de sección |

## 7. Cristal y luz

Es el estilo que Joaquín toma de FightLab PRO, con la paleta de la marca.

- **Cristal** (`.jb-glass`): fondo translúcido (`--jb-glass-bg`), desenfoque de 18 px con saturación 140 %,
  esquinas de 28 px y un **borde de luz** de 1 px en degradado de coral a cobalto (`--jb-glass-edge`). En oscuro
  el cristal lleva un tinte de abismo al 62 % para que el texto se lea aunque pase la nebulosa por detrás.
- **Brillo** (`--jb-glow`): halo coral alrededor del botón principal, los números de sección, las cifras
  destacadas y las barras de progreso. Solo ahí.
- **Neón en texto** (`.jb-neon`): cifras en coral con halo. En claro usa `#B83A44` para pasar el contraste.
- **Sombras**: solo la suave del propio cristal (`--jb-glass-shadow`). Nunca sombras grises bajo tarjetas planas.

## 8. Fondo: la nebulosa

Nebulosa fluida en WebGL (como en FightLab), con cobalto, acero y un poco de coral, concentrada en los
laterales. Encima, una rejilla de puntos de 24 px y una viñeta que despeja el centro.

- Dónde: landings, portadas, pantallas de bienvenida. En apps densas (tablas, formularios largos), fondo liso
  `bg`.
- Regla: **el texto nunca va directamente sobre la nebulosa**: va en el centro (viñeta) o dentro de cristal.
- Claro: la nebulosa queda como acuarela sobre niebla. Oscuro: luz sobre abismo.
- Código: [`tokens/nebulosa.js`](tokens/nebulosa.js) (`montarNebulosa(canvas, { movimiento })`) y la clase
  `.jb-fondo` para puntos y viñeta. Sin WebGL, se pinta un degradado de respaldo.
- En Android no hay nebulosa animada: `FondoNebulosa` en Compose pinta una versión quieta con degradados.

## 9. La franja (el sello)

Va **una vez** en las piezas importantes: la foto principal, el logo, una tarjeta destacada.

### Geometría

- Entra desde el **borde derecho** de su caja y ocupa **3/5 del ancho** (60 %).
- Va a un **46 %** de alto desde arriba y mide el **30 %** de la altura de la caja.
- El extremo izquierdo acaba en seco con un **corte de neón**: una línea vertical coral de 4 px con las puntas
  redondeadas, que sobresale un 14 % por arriba y por abajo, y brilla (halo de 10 y 28 px). La franja suelta un
  brillo suave hacia la izquierda.
- Color: coral `#F97279`, siempre.

```
┌──────────────────────────────────────┐
│                     ┃                │
│                     ┃████████████████│  ← 46 % desde arriba
│                     ┃████████████████│     30 % de alto
│                     ┃                │
└──────────────────────────────────────┘
                      ↑ corte de neón (4 px, sobresale 14 %)
                       ← 60 % del ancho →
```

### Cómo tiñe

- **Fotos**: en blanco y negro; la franja se mezcla en *multiply* y tiñe sin tapar.
- **Logos y texto**: el logo en gris (acero) y la parte dentro de la franja en tinta, con una copia recortada.
  Funciona igual en claro y en oscuro.
- **Sola**: como bloque gráfico sobre cristal, con la misma geometría.

Código: `.jb-franja` en [`tokens/componentes.css`](tokens/componentes.css), `FotoConFranja` y `LogoConFranja`
en [`tokens/compose/Franja.kt`](tokens/compose/Franja.kt) y la plantilla
[`plantillas/logo-franja.svg`](plantillas/logo-franja.svg).

## 10. Secciones numeradas

- Cada sección de una landing o guía lleva su número en una **cápsula coral con brillo** (`.jb-num`): 64 × 40 px,
  Geist 600 a 16 px, cifras tabulares, **dos cifras** (01, 02…).
- Va a la izquierda del título, alineada con su primera línea.
- Solo numera lo que es una secuencia de verdad (las secciones de una página), no tarjetas sueltas.

## 11. Logos y monograma

- **Todos los logos de sus proyectos**: en **un solo gris (acero)**, cruzados por la franja; dentro, en tinta.
- Plantilla: [`plantillas/logo-franja.svg`](plantillas/logo-franja.svg). Se cambia el grupo `#marca` por el logo
  (un trazado de un color) y no se toca el resto. Caja 5:2 (600 × 240).
- Tamaños pequeños (favicon de 16 px): el logo en tinta o niebla, sin franja.
- Logos de cada proyecto: **pendientes**, los pasará Joaquín.
- Monograma: **provisional**, «jb» en Bricolage 800 sobre una tesela coral con brillo.
- Firma en pies de página: `joaquín beltrán — hecho a mano`.

## 12. Fotografía

- **Tecnología y objetos**: dispositivos, herramientas, manos usando algo. Nada de astronautas.
- **Fondo liso siempre que se pueda** (gris o blanco de estudio), como una foto de producto.
- Siempre en **blanco y negro** (`grayscale(1) contrast(1.05) brightness(1.08)`).
- **Tonos medios o claros**: el coral no tiñe el negro. Mejor objetos plateados, blancos o grises.
- Dentro de un panel de cristal o a sangre.
- Fuente: Unsplash (licencia Unsplash), con el crédito del autor en pequeño. Foto de muestra: auriculares de
  Ervo Rocks ([Unsplash](https://unsplash.com/es/fotos/auriculares-inalambricos-rosa-y-blanco-Zam8TvEgN5o)).

## 13. Iconos

- **Lucide** (lucide.dev), de contorno, trazo **1,75**, extremos redondeados; 16, 20 o 24 px.
- Color del texto (`currentColor`). Coral solo dentro del botón principal.
- Solo iconos que ayuden a entender o a pulsar.
- Android: los mismos exportados a *vector drawable*, o Material Symbols Rounded si falta alguno.

## 14. Componentes

Todos están en la muestra viva y en [`tokens/componentes.css`](tokens/componentes.css).

| Pieza | Clase | Cómo es |
|---|---|---|
| Botón principal | `.jb-btn` | Cápsula coral, texto tinta, brillo coral; al pasar sube 2 px y brilla más. Uno por pantalla |
| Botón secundario | `.jb-btn--ghost` | Cápsula de cristal con borde fino; al pasar, brillo suave |
| Botón de contorno | `.jb-btn--outline` | Cápsula transparente con borde de 1,5 px |
| Botón redondo | `.jb-btn--round` | Círculo de 64 px con un icono |
| Panel | `.jb-glass` | Cristal, 28 px, borde de luz; si es enlace, sube 4 px |
| Número de sección | `.jb-num` | Cápsula coral con brillo, dos cifras |
| Etiqueta | `.jb-chip` / `.jb-chip--glow` | Cápsula de cristal; la `--glow` lleva un punto coral encendido |
| Cifra | `.jb-stat` + `.jb-neon` | Bricolage 800 a 56 px, en neón si es la cifra protagonista |
| Barra | `.jb-bar > i` | 8 px, degradado cobalto → coral con brillo |
| Campo | `.jb-input` | Cápsula de 48 px; al enfocar, borde coral con brillo |
| Enlace | (sin clase) | Cobalto, subrayado separado 4 px |
| Fondo | `.jb-fondo` + `nebulosa.js` | Nebulosa, puntos y viñeta |
| Franja | `.jb-franja…` | Ver sección 9 |
| Bloque manifiesto | — | Mitad tinta con titular, mitad coral con texto y acción |

## 15. Estados

Para avisos, validaciones y datos con significado (zona segura, riesgo). **Icono en neón y texto**, dentro de una
cápsula de cristal. Sin bloques de color ni borde de color a un lado. El color nunca va solo.

| Estado | Icono | Relleno | Texto en claro | Texto en oscuro |
|---|---|---|---|---|
| Éxito | círculo con ✓ | `#1E9E6A` | `#0B7550` (4,9:1) | `#3FCB8E` (9,4:1) |
| Aviso | triángulo con ! | `#E2A21B` | `#8A5A00` (5,1:1) | `#F2BC4A` (11,1:1) |
| Error | **cara con ojos x.x** y boca ondulada | `#C8323F` | `#B42B37` (5,4:1) | `#FF5A6A` (6,4:1) |
| Nuevo / información | **cara con ojos de estrella** y sonrisa | cobalto | `#23648F` (5,4:1) | `#7FB4DA` (8,7:1) |

- Los iconos están en [`plantillas/iconos/`](plantillas/iconos/) (`estado-exito.svg`, `estado-aviso.svg`,
  `estado-error.svg`, `estado-info.svg`), con trazo 1,75 como el resto de iconos.
- El icono brilla con su propio color (`drop-shadow` de 6 px) y la palabra clave en negrita lleva un halo suave.
- Tokens: `--jb-exito`, `--jb-exito-texto`, `--jb-on-exito`… (igual para `aviso`, `error`, `info`).
- Piezas: `.jb-alerta` (`--exito`, `--aviso`, `--error`, `--info`), etiquetas `.jb-chip--exito/--aviso/--error/--info`, y el error
  de un campo con `.jb-campo .error` y `aria-invalid="true"`.
- Sobre un relleno de estado: tinta encima de éxito y aviso; blanco encima de error.
- Los colores de estado no se usan para series de gráficas ni para decorar.

## 16. Gráficas

Validado con el método de la skill de visualización (prueba de daltonismo, luminosidad y contraste) en claro
(sobre `#F4F8FA`) y en oscuro (sobre `#161D26`).

### Series (orden fijo)

| Orden | Color | Claro | Oscuro |
|---|---|---|---|
| 1 | cobalto | `#2A72A3` | `#3F8AC4` |
| 2 | coral | `#F97279` | `#EA5F69` |
| 3 | violeta | `#7465D8` | `#8578E2` |
| 4 | verde azulado | `#0A9C86` | `#149A85` |
| 5 | ocre | `#C9962B` | `#B98A2C` |

- El color sigue a la serie, nunca a su posición: si un filtro quita series, las demás no cambian de color.
- Más de cinco series: agrupar en «Otros» o hacer gráficas pequeñas por separado. Nunca un sexto color.
- Dispersión y mapas (todas las parejas a la vista): como mucho dos series, cobalto y coral.
- En claro, coral y ocre no llegan a 3:1 sobre la superficie: esas gráficas llevan etiquetas directas o la
  tabla alternativa.
- Magnitud (mapas de calor): escala de cobalto `--jb-seq-100` … `--jb-seq-700`.
- Por debajo / por encima de un valor: divergente cobalto ↔ coral con el centro en `--jb-div-mid`.

### Cómo se dibujan

- **Cifra grande encima** (`.jb-stat`) con una etiqueta de estado al lado (+12 % sobre tu media). La gráfica
  explica la cifra, no al revés.
- **Una sola serie**: barras en cobalto con degradado hacia abajo y **lo importante en coral con neón** (la
  semana actual, el valor récord). Una línea discontinua marca la media.
- **Líneas**: la serie principal en cobalto con brillo y un área degradada debajo; la de referencia
  (objetivo) en coral discontinua. Punto brillante en el último valor y etiquetas directas al final.
- **Indicadores**: anillo de 240° con la zona buena marcada suave en verde y el valor en coral con neón.
- **Varias series**: barras apiladas con 2 px de separación entre segmentos, en el orden fijo de series.
- Esquinas de 6 px arriba en las barras; líneas de 2–2,5 px; puntos de 8 px o más.
- Rejilla y ejes muy suaves (`--jb-grid`, `--jb-axis`). Un solo eje vertical, nunca dos escalas.
- Al pasar el ratón: la marca señalada se queda y el resto baja de opacidad; detalle con el valor. En líneas,
  barra vertical y valores de las dos series.
- Opción «ver como tabla» para lectores de pantalla y para quien lo prefiera.
- Los textos de la gráfica van en los colores de texto; solo la marca destacada usa el neón.

## 17. Piezas de app

| Pieza | Clase | Cómo es |
|---|---|---|
| Navegación de escritorio | `.jb-nav` | Cápsula de cristal con enlaces en cápsula; la página actual (`aria-current="page"`) en tinta o niebla |
| Barra inferior móvil | `.jb-tabbar` | Hasta 5 destinos con icono y texto; el actual en neón con un halo suave en el icono |
| Ventana emergente | `.jb-modal` sobre `<dialog>` | Cristal sobre el fondo, esquinas de 28 px, fondo de detrás oscurecido y desenfocado; sube 12 px al abrir |
| Aviso flotante | `.jb-toast` | Cápsula en tinta (niebla en oscuro) con icono coral; dentro de un contenedor `aria-live="polite"`; se va solo a los 4 s |
| Alerta | `.jb-alerta` | Ver sección 15 |
| Tabla | `.jb-tabla` | Filas separadas por una línea, cifras alineadas a la derecha (`.num`), fila resaltada al pasar |
| Formulario | `.jb-campo` + `.jb-input` | Etiqueta visible encima, ayuda debajo, error debajo del campo con icono |
| Desplegable | `.jb-input.jb-select` | Cápsula como el campo, con flecha propia |
| Casilla | `.jb-check` | Casilla nativa en coral |
| Carga | `.jb-skeleton` | Bloques que respiran; quietos si se reduce el movimiento |
| Vacío | `.jb-vacio` | Título corto, una frase y un botón para actuar |

En Compose se usan los componentes de Material 3 (`NavigationBar`, `AlertDialog`, `Snackbar`, `OutlinedTextField`…)
con el tema de la marca; no hace falta reimplementarlos.

## 18. Iconos, imagen para compartir y banner

Plantillas en [`plantillas/`](plantillas/) y tamaños en [`plantillas/ICONOS.md`](plantillas/ICONOS.md).

- **Icono de app** (`icono-app.svg`): fondo abismo con luz de nebulosa, símbolo en acero con la franja y la parte
  de dentro en tinta. Sin corte de neón: a ese tamaño no se aprecia. Zona segura de Android: el círculo central de 332 px (66/108).
- **Iconos pequeños** (48 px o menos, favicon): solo el símbolo, sin franja.
- **Imagen para compartir** (`og-1200x630.svg`): nebulosa, franja, monograma, título del proyecto y una frase.
- **Banner de README** (`banner-readme.svg`): igual, en 1280 × 320.
- `theme-color` del navegador: `#0A0E13` en oscuro y `#E7EEF2` en claro.

## 19. Movimiento

| Qué | Cómo | Duración |
|---|---|---|
| Nebulosa | Flujo continuo y lento | siempre en landings |
| Franja | Entra desde la derecha al cargar, una vez | 900 ms · `ease-out` |
| Botón principal | Sube 2 px y brilla más; al pulsar, 97 % | 220 ms |
| Panel enlace | Sube 4 px | 220 ms |
| Cambios de color | Fundido | 150 ms |
| Paneles que se abren | Deslizan | 400 ms |

- `ease-out` = `cubic-bezier(.2, .8, .2, 1)`; `ease-in-out` = `cubic-bezier(.65, 0, .35, 1)`.
- Nada de «aparece y sube» en cada sección.
- **Reducir movimiento**: si el sistema lo pide, la nebulosa se pinta quieta y la franja aparece colocada.
  `montarNebulosa(canvas, { movimiento: "si" })` permite forzarla (por ejemplo, con un interruptor visible).

## 20. Tono de voz

Joaquín habla como un desarrollador que sabe lo que hace y no necesita adornarlo.

- **Tú**, frases cortas, verbos en activa. Español de España.
- Títulos en minúsculas, sin punto y sin exclamaciones.
- Directo y concreto: qué hace la cosa, no lo buena que es.
- Botones con verbo: «Ver proyecto», «Probar la app», «Escríbeme».
- Errores: qué ha pasado y qué hacer. «No se ha guardado. Revisa la conexión y vuelve a probar».
- Vacíos: una invitación. «Aún no hay movimientos. Añade el primero».

| Sí | No |
|---|---|
| nada de plantillas | ¡Soluciones innovadoras a medida! |
| De la base de datos al último píxel. | Apasionado por crear experiencias digitales únicas. |
| Un podcast de noticias que se escribe, se graba y se monta solo. | Revolucionando la forma de consumir noticias con IA. |
| Ver proyecto | Haz clic aquí para descubrir más |

## 21. Qué no hacemos

**Nunca:**

- Sombras grises bajo tarjetas planas.
- Un punto de color al final de los títulos.
- Franjas de color encima de cada tarjeta.
- Figuras geométricas 3D de adorno (gemas, roscos, cubos) ni metal líquido.
- Coral en texto pequeño sobre fondo claro.
- Brillo en todo: solo botón principal, números, cifras y barras.
- Texto directamente sobre la nebulosa.
- Fotos a color o con objetos negros que la franja no tiñe.
- Emojis como iconos. Pokémon en la marca.

**Cómo nos distinguimos de la referencia** (los dos usamos fondo oscuro y números de sección):

| Joaquín | Referencia |
|---|---|
| Coral y cobalto | Naranja |
| Bricolage gruesa en minúsculas | Mayúsculas gigantes |
| Cristal con borde de luz y cápsulas | Cuadrícula de líneas finas y esquinas rectas |
| Nebulosa que fluye | Esfera de partículas |
| Número en cápsula de neón | Número entre paréntesis con letra de máquina |
| Etiquetas en frase normal | Etiquetas pequeñas en mayúsculas |

## 22. Cómo aplicarla a un proyecto nuevo

- [ ] Instalar la marca (`pnpm add github:JoaquinJBG/brand-joaquin#v2.3.1`) e importar `tokens.css` y `componentes.css` (sección 24).
- [ ] Tailwind: preset v3 (`tailwind.preset.cjs`) o import v4 (`tailwind-v4.css`).
- [ ] Android: copiar `tokens/compose/` y envolver la app en `MarcaTheme { … }`.
- [ ] Cargar Bricolage Grotesque (800) y Geist (400/500/600).
- [ ] Landing o portada: `.jb-fondo` con `montarNebulosa`, `body.jb-base.jb-base--nebulosa`, modo oscuro por defecto.
- [ ] Paneles en `.jb-glass`; texto siempre en cristal o en el centro.
- [ ] Un botón principal coral con brillo por pantalla; el resto, `ghost` u `outline`.
- [ ] Secciones numeradas con `.jb-num` (dos cifras).
- [ ] Títulos en Bricolage 800, minúsculas, sin punto final. Cifras con `.jb-stat`.
- [ ] **La franja una vez** en la pieza principal (foto o logo).
- [ ] Logo del proyecto en gris con la franja (plantilla SVG).
- [ ] Iconos Lucide de contorno, trazo 1,75.
- [ ] Estados con `.jb-alerta` y su icono; errores de campo debajo del campo.
- [ ] Gráficas con las series en su orden fijo, leyenda, detalle al pasar y tabla alternativa.
- [ ] Navegación con `.jb-nav` (escritorio) y `.jb-tabbar` (móvil); avisos con `.jb-toast` en `aria-live`.
- [ ] Icono de app, favicon, imagen para compartir y banner del README desde las plantillas.
- [ ] Probar claro y oscuro, y con «reducir movimiento» activado.
- [ ] Textos revisados con el tono de voz (sección 20) y repaso de «Qué no hacemos» (sección 21).
- [ ] Pie con la firma `joaquín beltrán — hecho a mano`.
- [ ] Pegar el bloque de [`PROMPT-MARCA.md`](PROMPT-MARCA.md) en el `CLAUDE.md` del proyecto.

## 23. Llevarla a cada tecnología

Todo se instala como paquete (sección 24); la tabla dice qué pieza usa cada tecnología.

| Tecnología | Qué usar |
|---|---|
| HTML / CSS | `tokens.css` + `componentes.css` (clases `jb-*`) + `nebulosa.js` (módulo ES) |
| Next.js / React + Tailwind v4 | `@import` de `tokens.css`, `componentes.css` y `tailwind-v4.css` en `globals.css`. Utilidades: `bg-bg`, `text-fg`, `bg-btn`, `text-neon`, `shadow-glow`, `text-stat`, `font-display`… |
| Next.js / React + Tailwind v3 | `presets: [require("./marca/tailwind.preset.cjs")]` + importar `tokens.css` y `componentes.css` |
| Angular | Importar `tokens.css` y `componentes.css` en `styles.css`; nebulosa en un componente con `@ViewChild` del canvas. Con Angular Material: `primary` = coral |
| Kotlin + Jetpack Compose | `tokens/compose/`: `MarcaTheme.kt`, `Luz.kt` (brillo, cristal, fondo) y `Franja.kt` |

### La nebulosa en React y Angular

```tsx
// React
useEffect(() => { const n = montarNebulosa(ref.current!); return () => n.destruir(); }, []);
```

```ts
// Angular
ngAfterViewInit() { this.neb = montarNebulosa(this.canvas.nativeElement); }
ngOnDestroy() { this.neb?.destruir(); }
```

### Nota para Compose

- `primary` = **coral** (el botón principal), `onPrimary` = tinta; `secondary` = tinta en claro y niebla en
  oscuro; `tertiary` = cobalto (enlaces).
- Brillo: `Modifier.brilloCoral()` (sombra de color; se ve en Android 9 o superior).
- Cristal: `Cristal(oscuro) { … }` con fondo translúcido y borde de luz.
- Fondo: `FondoNebulosa(oscuro) { … }`, versión quieta con degradados.
- Letras con *Downloadable Fonts* (`androidx.compose.ui:ui-text-google-fonts` y `font_certs.xml`).
- Formas: cápsula = `RoundedCornerShape(percent = 50)`, paneles = 28 dp.
- Los archivos de Compose son un punto de partida escrito a mano: **no se han compilado**. Revísalos al meterlos
  en Efectivo.

Los archivos de Tailwind se prueban compilando con Tailwind 3.4.17 y 4.1.11. En v3 el texto sobre coral es
`text-accent-on`; en v4, `text-on-accent`.

## 24. Instalar y actualizar

La marca es un paquete instalable desde GitHub, con versiones. Cada proyecto fija una versión y la sube cuando
quiere; los cambios están en [CHANGELOG.md](CHANGELOG.md).

```bash
pnpm add github:JoaquinJBG/brand-joaquin#v2.3.1
```

Las letras van aparte (`fuentes.css`) porque un `@import` de Google Fonts dentro de otro CSS acaba en medio del
archivo final y el navegador lo ignora. Fuera de Next.js: `@import "brand-joaquin/fuentes.css";` como **primera
línea** del CSS principal, o un `<link>` a Google Fonts en el `<head>`.

En **Next.js** se usa `next/font/google`, que renombra la letra. Por eso hay que decirle a los tokens el nombre
nuevo, después de importar la marca:

```tsx
// layout.tsx
const display = Bricolage_Grotesque({ subsets: ["latin"], weight: "800", variable: "--fuente-display" });
const body = Geist({ subsets: ["latin"], variable: "--fuente-body" });
// <html className={`${display.variable} ${body.variable}`}>
```

```css
/* globals.css, después de los @import de la marca */
:root {
  --font-display: var(--fuente-display), "Bricolage Grotesque", sans-serif;
  --font-body: var(--fuente-body), "Geist", system-ui, sans-serif;
}
```

Si el proyecto ya tiene un `@theme` con nombres que trae la marca (`--color-bg`, `--color-surface`,
`--font-display`…), se borran los suyos y sus utilidades pasan a las de la marca.

```css
/* globals.css (Tailwind v4) */
@import "brand-joaquin/fuentes.css";
@import "tailwindcss";
@import "brand-joaquin/tokens.css";
@import "brand-joaquin/componentes.css";
@import "brand-joaquin/tailwind-v4.css";
```

Con Tailwind v3, el CSS se importa en el punto de entrada (por ejemplo `import "brand-joaquin/tokens.css"` y
`import "brand-joaquin/componentes.css"` en `layout.tsx`) y los colores van por el preset:

```js
// tailwind.config.js (Tailwind v3)
module.exports = { presets: [require("brand-joaquin/tailwind-preset")], content: ["./src/**/*.{ts,tsx}"] };
```

```ts
import { montarNebulosa } from "brand-joaquin/nebulosa";
```

- Angular: los mismos `@import` en `styles.css`.
- PWA: al cambiar iconos, `theme-color` o estilos, sube la versión de la caché del service worker.
- Para que Claude lo haga todo solo: la skill [`skill/marca-personal`](skill/marca-personal/SKILL.md). Cópiala a
  `~/.claude/skills/marca-personal/` y di en cualquier proyecto «aplica mi branding personal».
- Android (Compose): copiar `tokens/compose/` al módulo de UI y anotar en el proyecto qué versión de la marca es.
- Para actualizar: cambiar `#v2.3.1` por la versión nueva y repasar el CHANGELOG.
- Las plantillas y los logos también vienen en el paquete: `brand-joaquin/plantillas/…`, `brand-joaquin/logos/…`.
