# Guía de marca · Joaquín Beltrán

Versión 1.0 · 4 de noviembre de 2026 · Elegida por Joaquín en cinco rondas (ver [DECISIONES.md](DECISIONES.md)).

Esta guía sirve para que todos los proyectos personales de Joaquín se reconozcan como suyos aunque no sean
iguales: misma paleta, misma letra, mismo sello (la franja) y misma forma de hablar. Cada proyecto puede tener
su propia estructura; lo que no cambia es lo de esta guía.

- Muestra viva: [`muestra/index.html`](muestra/index.html)
- Tokens: [`tokens/`](tokens/) (CSS, Tailwind v3 y v4, Compose)
- Prompt para aplicarla con Claude: [`PROMPT-MARCA.md`](PROMPT-MARCA.md)

## Índice

1. [La idea en una frase](#1-la-idea-en-una-frase)
2. [Principios](#2-principios)
3. [Color](#3-color)
4. [Tipografía](#4-tipografía)
5. [Espacio y retícula](#5-espacio-y-retícula)
6. [Esquinas y sombras](#6-esquinas-y-sombras)
7. [La franja (el sello)](#7-la-franja-el-sello)
8. [Logos y monograma](#8-logos-y-monograma)
9. [Fotografía](#9-fotografía)
10. [Iconos](#10-iconos)
11. [Componentes](#11-componentes)
12. [Movimiento](#12-movimiento)
13. [Tono de voz](#13-tono-de-voz)
14. [Qué no hacemos](#14-qué-no-hacemos)
15. [Cómo aplicarla a un proyecto nuevo](#15-cómo-aplicarla-a-un-proyecto-nuevo)
16. [Llevarla a cada tecnología](#16-llevarla-a-cada-tecnología)

## 1. La idea en una frase

**Laboratorio frío**: todo en grises fríos, como un objeto fotografiado en un estudio, y una sola franja coral
que lo cruza y lo tiñe. Letra muy gruesa en minúsculas. Nada sobra.

Lo que tiene que pensar quien lo vea: *qué nivel técnico*, *qué elegante* y *esto no es una plantilla*.

## 2. Principios

1. **Gris primero, coral después.** La pantalla es casi siempre fría y neutra. El coral aparece poco y en grande:
   en la franja, en un bloque o en un botón de acento. Nunca como relleno de detalles pequeños.
2. **Un objeto, una franja.** Cada pantalla importante tiene un único momento protagonista. El resto, tranquilo.
3. **Letra gruesa, texto corto.** Los títulos son enormes y dicen poco. El texto normal es claro y breve.
4. **La superficie separa, no la sombra.** Sin bordes ni sombras: las tarjetas se distinguen por su color de fondo.
5. **Redondo para tocar.** Todo lo que se pulsa es una cápsula (botones, etiquetas, campos).
6. **Funciona en claro y en oscuro.** Las dos versiones son de primera; ninguna es un apaño de la otra.

## 3. Color

Mezcla de dos paletas que eligió Joaquín: la del astronauta (grises azulados fríos) y la de la flor (coral y cobalto).

### Paleta base

| Nombre | Hex | Para qué |
|---|---|---|
| niebla | `#E7EEF2` | Fondo en modo claro. Texto en modo oscuro. |
| hielo | `#CCDBE2` | Superficie secundaria, zonas de apoyo. |
| acero | `#738A9A` | Logos en gris, detalles grandes. **No para texto pequeño** sobre claro. |
| pizarra | `#435565` | Texto secundario en modo claro. |
| salvia | `#697773` | Neutro de apoyo: gráficos, estados neutros. |
| tinta | `#161D24` | Texto principal, botón principal en claro, lo que va dentro de la franja. |
| noche | `#121820` | Fondo en modo oscuro. |
| **coral** | `#F97279` | **El color de la marca.** Franja, bloques y botón de acento. |
| cobalto | `#2A72A3` | Enlaces y foco. Para texto sobre claro se usa `#23648F`. |

### Roles (lo que usan los componentes)

| Rol | Claro | Oscuro |
|---|---|---|
| `bg` fondo | niebla `#E7EEF2` | noche `#121820` |
| `surface` tarjetas | `#F4F8FA` | `#1A222C` |
| `surface-2` | hielo `#CCDBE2` | `#243040` |
| `fg` texto | tinta `#161D24` | niebla `#E7EEF2` |
| `fg-muted` texto secundario | pizarra `#435565` | `#9DB0BD` |
| `fg-subtle` decorativo | acero `#738A9A` | acero `#738A9A` |
| `line` separadores | tinta al 12 % | niebla al 12 % |
| `accent` | coral `#F97279` | coral `#F97279` |
| `on-accent` texto sobre coral | tinta | tinta |
| `link` | `#23648F` | `#7FB4DA` |
| `btn` botón principal | tinta | niebla |
| `on-btn` | niebla | tinta |

### Contraste comprobado (WCAG)

| Combinación | Ratio | Uso permitido |
|---|---|---|
| tinta sobre niebla | 14,5 | todo |
| pizarra sobre niebla | 6,6 | texto secundario |
| enlace `#23648F` sobre niebla | 5,4 | enlaces |
| tinta sobre coral | 6,2 | texto dentro de la franja y del botón de acento |
| acero sobre niebla | 3,1 | solo texto grande (≥ 24 px) y logos |
| coral sobre niebla | 2,3 | **nunca texto**; solo bloques y franja |
| niebla sobre noche | 15,2 | todo |
| `#9DB0BD` sobre noche | 8,0 | texto secundario en oscuro |
| coral sobre noche | 6,6 | en oscuro sí puede ir como texto grande |
| `#7FB4DA` sobre noche | 8,0 | enlaces en oscuro |

### Proporción

En una pantalla típica: ~85 % neutros (niebla, superficies, hielo), ~10 % tinta (texto, botones), ~5 % coral.
Si el coral pasa de un 10 %, sobra coral.

### Color por proyecto

El coral es **igual en todos los proyectos**: es lo que los une. Un proyecto puede necesitar colores propios
para su funcionamiento (estados de una gráfica, categorías); en ese caso usa primero salvia, cobalto y hielo,
y si no llega, colores nuevos fríos y apagados. Nunca otro color cálido que compita con el coral.

## 4. Tipografía

| Uso | Letra | Peso | Notas |
|---|---|---|---|
| Títulos, cifras, nombres de proyecto | **Bricolage Grotesque** | 800 | En minúsculas, interletra −0,045 em, interlínea muy apretada |
| Texto, botones, formularios | **Geist** | 400 / 500 / 600 | Interlínea 1,6 |

Las dos son gratuitas en Google Fonts. No se usa letra monoespaciada como decoración (solo para código real).

### Escala

| Token | Tamaño | Interlínea | Para |
|---|---|---|---|
| `hero` | clamp(72 px, 10,5 vw, 164 px) | 0,86 | Nombre o titular de portada |
| `h1` | clamp(56 px, 7,5 vw, 112 px) | 0,88 | Título de página |
| `h2` | clamp(44 px, 6 vw, 84 px) | 0,90 | Secciones |
| `h3` | 34 px | 0,95 | Nombres de proyecto, tarjetas |
| `h4` | 24 px | 1,00 | Subtítulos (interletra −0,03 em) |
| `lead` | 18 px | 1,6 | Entradilla |
| `body` | 16 px | 1,6 | Texto normal |
| `small` | 14 px | 1,5 | Texto de tarjeta, ayudas |
| `caption` | 12 px | 1,4 | Créditos, etiquetas |

Reglas:

- Títulos **siempre en minúsculas** y **sin punto final**.
- Nada de palabras sueltas en otro color o en cursiva dentro de un título.
- Líneas de texto de 60–75 caracteres como mucho (`max-width: 65ch`).
- Cifras importantes (saldos, métricas) con Bricolage 800, como si fueran títulos.

## 5. Espacio y retícula

Todo en múltiplos de 4 px.

| Token | px | Uso típico |
|---|---|---|
| `space-1` | 4 | Separación mínima |
| `space-2` | 8 | Entre icono y texto |
| `space-3` | 12 | Entre botones |
| `space-4` | 16 | Hueco entre tarjetas |
| `space-5` | 24 | Relleno de tarjeta, margen lateral |
| `space-6` | 32 | Entre bloques de una sección |
| `space-7` | 48 | Relleno de bloques grandes |
| `space-8` | 64 | |
| `space-9` | 96 | Entre secciones en móvil |
| `space-10` | 128 | Entre secciones en escritorio |

- Contenedor máximo: **1240 px**, márgenes laterales de **24 px**.
- Retícula de 12 columnas con 24 px de hueco. En móvil, una columna.
- Alineación a la izquierda. Nada centrado salvo los logos dentro de su caja.
- Mucho aire entre secciones (96–128 px): el vacío es parte del estilo.

## 6. Esquinas y sombras

| Token | Valor | Para |
|---|---|---|
| `radius-sm` | 12 px | Miniaturas, muestras de color |
| `radius-md` | 16 px | Elementos pequeños dentro de una tarjeta |
| `radius-lg` | 28 px | Tarjetas, fotos, bloques |
| `radius-full` | 999 px | **Botones, etiquetas, campos de texto, botón redondo** |

**Sombras: ninguna.** La profundidad sale del color de la superficie (`surface` sobre `bg`). La única «sombra»
permitida es el anillo de foco para teclado (`--focus-ring`). Tampoco se usan bordes para separar tarjetas.

## 7. La franja (el sello)

Es lo que hace reconocible un proyecto de Joaquín. Va **una vez** en las piezas importantes: la portada, el logo,
la foto principal, una tarjeta destacada.

### Geometría

- Entra desde el **borde derecho** de su caja.
- Ocupa **3/5 del ancho** (60 %).
- Va a un **46 %** de alto desde arriba y mide el **30 %** de la altura de la caja.
- El extremo izquierdo, el que no llega al borde, **se deshace en rayas**: rayas verticales de 7 px con huecos de
  7 px en una zona del 22 % del ancho de la franja, que se desvanecen hacia la izquierda.
- Color: coral `#F97279`. Siempre.

```
┌──────────────────────────────────────┐
│                                      │
│                                      │
│              ▏▎▍▌▋████████████████████│  ← 46 % desde arriba
│              ▏▎▍▌▋████████████████████│     30 % de alto
│                                      │
└──────────────────────────────────────┘
               ← 22 % →← 60 % del ancho →
```

### Cómo tiñe

- **Sobre fotos**: la foto va en blanco y negro y la franja se mezcla en modo *multiply*. Lo que cruza se vuelve
  coral sin taparse: se sigue viendo la textura.
- **Sobre logos y texto**: el logo va en gris (acero) y la parte que queda dentro de la franja se pinta en tinta.
  Se hace con una copia del logo recortada a la forma de la franja; no depende de mezclas, así que funciona igual
  en claro y en oscuro.
- **Sola, como bloque**: puede ir sobre una superficie vacía como elemento gráfico (por ejemplo, detrás de un
  titular), siempre con la misma geometría.

### Movimiento

Es lo único que se mueve solo: al cargar la página entra desde la derecha una vez (900 ms, `ease-out`). Si el
usuario tiene activado «reducir movimiento», aparece ya colocada.

Código listo: clases `.jb-franja` en [`tokens/componentes.css`](tokens/componentes.css), `FotoConFranja` y
`LogoConFranja` en [`tokens/compose/Franja.kt`](tokens/compose/Franja.kt) y la plantilla
[`plantillas/logo-franja.svg`](plantillas/logo-franja.svg).

## 8. Logos y monograma

**Regla para todos los logos de sus proyectos**: logo en **un solo color gris (acero)**, cruzado por la franja.
Dentro de la franja, el logo pasa a **tinta**. Fuera de su caja con franja (por ejemplo, un favicon de 16 px), el
logo va en tinta o niebla, sin franja.

- Plantilla: [`plantillas/logo-franja.svg`](plantillas/logo-franja.svg). Cambia el contenido del grupo `#marca`
  por el logo (un trazado en un solo color) y no toques el resto.
- La caja del logo tiene proporción 5:2 (600 × 240). La franja se calcula sobre esa caja, no sobre el dibujo.
- Logos de cada proyecto: **pendiente**, los pasará Joaquín.
- Monograma personal: **provisional**, «jb» en Bricolage Grotesque 800, en minúsculas. Se cambiará cuando
  Joaquín tenga el suyo.
- Firma en pies de página: `joaquín beltrán — hecho a mano`.

## 9. Fotografía

- Temática: **tecnología y objetos**: dispositivos, herramientas, manos usando algo. Nada de astronautas ni de
  temas de espacio.
- Siempre en **blanco y negro** (`grayscale(1) contrast(1.05) brightness(1.08)`).
- **Tonos medios o claros**: el coral no tiñe el negro. Un objeto negro sobre fondo blanco solo tiñe el fondo;
  mejor objetos plateados, blancos o grises.
- Encuadre de producto: un objeto protagonista, fondo limpio o desenfocado.
- Fuentes gratuitas: Unsplash (licencia Unsplash). Pon el crédito del autor en pequeño sobre la foto o en el pie.
- Fotos de muestra usadas en esta guía: auriculares de Inka Kapturewska
  ([Unsplash](https://unsplash.com/es/fotos/una-persona-sosteniendo-un-par-de-auriculares-en-la-mano-zJkNGKYLRU0)).

## 10. Iconos

- Juego: **Lucide** (lucide.dev), de contorno, trazo **1,75**, extremos redondeados.
- Tamaños: 16 px junto a texto pequeño, 20 px en botones, 24 px sueltos.
- Color: el del texto que acompañan (`currentColor`). Nunca coral salvo dentro de un botón de acento.
- Solo iconos que ayuden a entender o a pulsar. Nada de iconos decorativos ni de formas geométricas sueltas.
- En Android: los mismos iconos exportados a *vector drawable* desde lucide.dev, o Material Symbols Rounded de
  contorno si falta alguno.

## 11. Componentes

Todos están en la muestra viva y en [`tokens/componentes.css`](tokens/componentes.css).

| Pieza | Cómo es |
|---|---|
| Botón principal | Cápsula, fondo tinta (niebla en oscuro), texto 15 px Geist 500, alto 48 px |
| Botón de acento | Cápsula coral con texto tinta. Uno por pantalla como mucho |
| Botón de contorno | Cápsula transparente con borde interior de 1,5 px |
| Botón redondo | Círculo de 64 px con un icono de flecha |
| Enlace | Cobalto, subrayado separado 4 px |
| Etiqueta (chip) | Cápsula pequeña, fondo `bg`, texto 12 px pizarra |
| Tarjeta | `surface`, esquinas 28 px, relleno 24 px, sin borde ni sombra; sube 4 px al pasar el ratón si es un enlace |
| Campo de texto | Cápsula de 48 px, borde interior 1,5 px de `line`; al enfocar, borde `fg` |
| Cifra destacada | Bricolage 800 a 40 px, con su etiqueta encima en 13 px pizarra |
| Bloque manifiesto | Dos mitades: tinta con titular grande y coral con texto y botón |

## 12. Movimiento

| Token | Valor | Para |
|---|---|---|
| `dur-fast` | 150 ms | Cambios de color |
| `dur-base` | 220 ms | Botones y tarjetas |
| `dur-slow` | 400 ms | Paneles que se abren |
| `dur-entrance` | 900 ms | La entrada de la franja |
| `ease-out` | `cubic-bezier(.2, .8, .2, 1)` | Casi todo |
| `ease-in-out` | `cubic-bezier(.65, 0, .35, 1)` | Cosas que van y vuelven |

Reglas:

- **Un solo momento automático**: la franja entrando al cargar. Nada más se mueve sin que el usuario haga algo.
- Respuesta a acciones: los enlaces-tarjeta suben 4 px, los botones suben 2 px al pasar el ratón y se encogen al
  97 % al pulsar.
- Nada de entradas «aparece y sube» en cada sección.
- Siempre respetar `prefers-reduced-motion` (los tokens ya ponen las duraciones a 0).

## 13. Tono de voz

Joaquín habla como un desarrollador que sabe lo que hace y no necesita adornarlo.

- **Tú**, frases cortas, verbos en activa. Español de España.
- Títulos en minúsculas, sin punto y sin signos de exclamación.
- Directo y concreto: qué hace la cosa, no lo buena que es.
- Botones con verbo: «Ver proyecto», «Probar la app», «Escríbeme». Nada de «Enviar» o «Haz clic aquí».
- Errores: qué ha pasado y qué hacer. «No se ha guardado. Revisa la conexión y vuelve a probar».
- Vacíos: una invitación. «Aún no hay movimientos. Añade el primero».

| Sí | No |
|---|---|
| nada de plantillas | ¡Soluciones innovadoras a medida! |
| De la base de datos al último píxel. | Apasionado por crear experiencias digitales únicas. |
| Un podcast de noticias que se escribe, se graba y se monta solo. | Revolucionando la forma de consumir noticias con IA. |
| Ver proyecto | Haz clic aquí para descubrir más |

## 14. Qué no hacemos

Lo que haría que pareciera de otro (o una plantilla):

- **Lo de la referencia** (su marca usa esto, así que lo evitamos): fondo casi negro por defecto, naranja como acento,
  etiquetas pequeñas en mayúsculas con letra de máquina, secciones numeradas 01/02/03, cuadrícula de líneas finas,
  esfera de partículas.
- **Lo genérico** (Joaquín lo rechazó por «muy Claude»): punto de color al final de los títulos, franjas de color
  encima de cada tarjeta, figuras geométricas 3D decorativas (gemas, roscos, cubos, esferas), degradados de
  decoración, sombras grises bajo cada tarjeta.
- Coral en texto pequeño sobre fondo claro, o coral por todas partes.
- Emojis como iconos.
- Fotos a color o con objetos negros que la franja no puede teñir.
- Referencias a Pokémon en la marca (es un gusto personal, no parte de la identidad).

## 15. Cómo aplicarla a un proyecto nuevo

Checklist corta. Si se cumplen todas, el proyecto es «de Joaquín».

- [ ] Copiar `tokens/` al proyecto (por ejemplo `src/styles/marca/`) e importar `tokens.css` (y `componentes.css`
      si no usa Tailwind).
- [ ] Si usa Tailwind: preset v3 (`tailwind.preset.js`) o import v4 (`tailwind-v4.css`).
- [ ] Si es Android: copiar `tokens/compose/` y envolver la app en `MarcaTheme { … }`.
- [ ] Cargar Bricolage Grotesque (800) y Geist (400/500/600).
- [ ] Fondo niebla en claro y noche en oscuro; probar los dos modos.
- [ ] Títulos en Bricolage 800, minúsculas, sin punto final.
- [ ] Botones y campos en cápsula; tarjetas a 28 px sin sombra.
- [ ] **La franja una vez** en la pieza principal (portada, logo o foto), con su entrada animada.
- [ ] Logo del proyecto en gris con la franja (plantilla SVG).
- [ ] Iconos Lucide de contorno, trazo 1,75.
- [ ] Textos revisados con el tono de voz (sección 13).
- [ ] Repasar «Qué no hacemos» (sección 14).
- [ ] Pie con la firma `joaquín beltrán — hecho a mano`.
- [ ] Pegar el bloque de [`PROMPT-MARCA.md`](PROMPT-MARCA.md) en el `CLAUDE.md` del proyecto.

## 16. Llevarla a cada tecnología

| Tecnología | Qué usar |
|---|---|
| HTML / CSS | `tokens/tokens.css` + `tokens/componentes.css` (clases `jb-*`) |
| Next.js / React con Tailwind v4 | `@import` de `tokens.css` y `tailwind-v4.css` en `globals.css`; utilidades `bg-bg`, `text-fg`, `bg-accent`, `font-display`, `text-hero`… |
| Next.js / React con Tailwind v3 | `presets: [require("./marca/tailwind.preset.js")]` + importar `tokens.css` |
| Angular | Importar `tokens.css` y `componentes.css` en `styles.css` (o `styles.scss`); si usa Angular Material, mapear `primary` a tinta y `accent` a coral |
| Kotlin + Jetpack Compose | `tokens/compose/MarcaTheme.kt` y `Franja.kt` |

### Nota para Compose

- En Material 3, `primary` es el color de los botones principales. Aquí el botón principal es **tinta** (niebla en
  oscuro), así que `primary = tinta` y el coral va en **`secondary`** (botón de acento, franja). Cobalto va en
  `tertiary` (enlaces).
- Las letras se cargan con *Downloadable Fonts* (`androidx.compose.ui:ui-text-google-fonts`); hace falta el
  archivo de certificados `font_certs.xml` del ejemplo oficial de Android.
- Formas: botones y chips con `RoundedCornerShape(percent = 50)` (`extraLarge`), tarjetas con 28 dp (`large`).
- Espacios en dp con la misma escala (4, 8, 12, 16, 24, 32, 48, 64).
- La franja: `FotoConFranja(painter, …)` para fotos (usa `BlendMode.Multiply` en una capa *offscreen*) y
  `LogoConFranja { color -> … }` para logos.
- Estos dos archivos son un punto de partida escrito a mano: **no se han compilado**. Revísalos al meterlos en
  Efectivo.
