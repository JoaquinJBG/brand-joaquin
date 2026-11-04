# Logos y monograma

Todos siguen la regla de la marca: **un solo gris (acero `#738A9A`)**, cruzado por **la franja coral**; lo que queda
dentro de la franja va en **tinta `#161D24`**. En tamaños pequeños, solo el símbolo, sin franja. Todo son trazados:
no dependen de tener la letra instalada.

## Qué hay en cada carpeta

| Archivo | Qué es |
|---|---|
| `logo.svg` / `monograma.svg` | El logo en un solo color (acero), recortado a su tamaño. Cambia `fill` si lo necesitas en tinta o niebla. |
| `logo-franja.svg` / `monograma-franja.svg` | Caja 5:2 (600 × 240) con la franja, según `plantillas/logo-franja.svg`. |
| `simbolo.svg` | El símbolo solo, en un color. Para iconos y para `ic_launcher_monochrome` en Android. |
| `favicon.svg` | Símbolo sin franja: tinta en modo claro y niebla en modo oscuro (cambia solo con `prefers-color-scheme`). |
| `icono-app.svg` (monograma) | Icono de app de 512 px según `plantillas/icono-app.svg`: abismo con luz de nebulosa y franja sin rayas. |
| `monograma-16.png`, `-32.png` | Símbolo en niebla sobre abismo, sin franja. |
| `monograma-180.png`, `-192.png`, `-512.png` | Desde `icono-app.svg` (apple-touch-icon, PWA). |

## Lo que eligió Joaquín · 2026-11-04

| Carpeta | Elección | Cómo es |
|---|---|---|
| `monograma/` | **Firma · limpia** | La J de su firma, redibujada con trazo de rotulador constante: barra recta arriba, cuña, zigzag y lazo con curvas limpias. En 16–32 px el trazo engorda para que se lea; a 16 px es justo, mejor usarlo desde 32 px. |
| `fightlab-pro/` | **Solo palabra** | «fightlab» en Bricolage 800 y «pro» en 500. Sin símbolo; el favicon es la «f». |
| `noticia/` | **Onda** | Onda de sonido en barras + «NoticIA». Excepción pedida por él: N, I y A en mayúscula para que se lea el juego con «IA». |
| `efectivo/` | **Monedas** | Pila de tres monedas + «efectivo». El símbolo vale para el widget y el icono adaptativo. |
| `team-builder/` | **Poké Ball de línea** | Poké Ball dibujada con líneas + «team builder». Excepción pedida por él a la regla «sin Pokémon»: solo en este proyecto, que es un creador de equipos Pokémon. |

### Avisos

- **Team Builder**: la Poké Ball es marca registrada de Nintendo / The Pokémon Company. Para un proyecto personal sin
  ánimo de lucro suele tolerarse; si algún día se monetiza, hay que cambiar el símbolo.
- **Descartado por el camino**: monogramas de letras («jb», «jjb», «JJB»), J geométricas (gancho, rayas, paralelas) y
  las versiones geométrica y corta de la firma.

## Rehacerlos

Los trazados salen de Bricolage Grotesque (variable, en `opsz 96 · wght 800 · wdth 100`) convertida a curvas y de
formas dibujadas a mano. Para un logo nuevo: parte de `plantillas/logo-franja.svg`, letra a 104 px con la línea base
en y = 150 e interletra −0,03 em, centrado en x = 300 y como mucho 556 px de ancho; el símbolo, de 76 px de alto
apoyado en la línea base y a 26 px del texto.
