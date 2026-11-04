# Decisiones de marca

Registro de lo que Joaquín ha decidido, con fecha. Lo más reciente, abajo.

## 2026-11-04 · Primera ronda

Lo que dijo con sus palabras:

> «Me gusta mucho el alto impacto, como las webs 3D que se están poniendo de moda. Como esto no es posible
> para todas las webs y apps, me gusta el estilo lujo en la sombra, el negro predominante, el uso de colores
> vivos como el rosa fucsia o el azul cielo brillante… Me gusta mucho Pokémon.»

Respuestas al formulario:

| Pregunta | Respuesta |
|---|---|
| Color fuerte sobre el negro | **Cada proyecto el suyo** |
| Cuánto Pokémon en la marca | **Nada, es solo un gusto** |
| Qué debe pensar quien vea su web | **Qué nivel técnico · Qué elegante · Esto es de otro planeta** |
| ¿La marca va por la idea «Pokédex 3D cyberpunk» del portfolio? | **No lo tengo claro** (pendiente) |

Consecuencias para el diseño:

- El negro manda en todos los proyectos. Claro/oscuro: pendiente (quizá haga falta modo claro en Efectivo).
- El color de acento **no** puede ser lo que le identifica, porque cambia en cada proyecto. Lo reconocible
  tiene que estar en la estructura, la tipografía, el sello y el movimiento.
- Sin referencias a Pokémon en la marca.
- Hace falta un sello que exista en dos formas: 3D para webs grandes y plano para apps y webs pequeñas.

## 2026-11-04 · Segunda ronda (tras ver `exploracion/direcciones-v1.html`)

- Le gustan más **Órbita** y **Obsidiana**, en **fucsia**. Descarta, por ahora, Señal y Holo.
- Comparte su tablero de Pinterest «Diseño web»: https://pin.it/7JV3fueJe
- Su pin favorito, «lab.»: https://es.pinterest.com/pin/662803270213212234/ . Le recuerda a la marca de
  teléfonos **Nothing**, que le encanta.
- Comparte también una captura con más diseños que le gustan (estilo industrial, producto, gris claro +
  naranja, letra gruesa).

Lo que se repite en lo que guarda: fondos gris claro o blanco (7 de 10 pines), **un solo color caliente
como bloque macizo**, letra gruesa o editorial muy grande, fotos de objetos o personas en blanco y negro,
etiquetas técnicas diminutas y texto en vertical.

Choques a resolver con él:

- Dijo «negro predominante», pero casi todo lo que guarda es claro.
- Eligió direcciones suaves y redondas, pero guarda diseños duros e industriales.
- Varias cosas de los pines (números 001, etiquetas diminutas, cuadrícula de líneas, naranja) son justo
  las que identifican a la referencia.

Nombre que sale en su tablero: **Joaquín Beltrán** (se usa como nombre de trabajo hasta que lo confirme).

## 2026-11-04 · Tercera ronda (tras ver `exploracion/direcciones-v2.html`)

- **No le gusta ni E1 ni E2.** Quiere ir por el estilo de sus pines y de la captura que mandó: diseño
  editorial e industrial, producto, letra gruesa.
- Paleta: mezclar dos pines.
  - Astronauta: https://es.pinterest.com/pin/662803270213212347/ → `#435565` `#738A9A` `#636D7D`
    `#CCDBE2` `#697773`
  - Flor: https://es.pinterest.com/pin/701928291965270606/ → `#C6D8E6` `#F97279` `#2A72A3`
- Con esto queda descartado el «negro predominante» del principio y la idea de un color distinto por
  proyecto pasa a ser opcional (los proyectos pueden llevar su color en un detalle).
- Propuesta resultante: `exploracion/direccion-v3.html` («Laboratorio frío»).

## 2026-11-04 · Cuarta ronda (tras ver `exploracion/direccion-v3.html`)

Decidido:

- **Letra gruesa** (Bricolage Grotesque) para títulos.
- **Coral** es el color protagonista.
- **Modo claro y modo oscuro**: le gustan los dos.
- **Botones más redondos** (cápsula).

No le gusta (le parece «muy Claude», genérico):

- El punto final de color en los títulos («proyectos.»).
- La franja de color encima de cada tarjeta de proyecto.
- Las figuras geométricas 3D (gema, rosco, moneda, cubo, esfera con visor). Pasará él los logos de sus
  proyectos más adelante.

Quiere el efecto de la foto de «lab.»: **figura en blanco y negro y una franja de color que solo tiñe la
parte que cruza**. Se resuelve con la foto en escala de grises y una franja coral encima con
`mix-blend-mode: multiply`.

Resultado: `exploracion/direccion-v4.html`. Foto de muestra: astronauta de Adam Miller, licencia Unsplash
(https://unsplash.com/es/fotos/astronauta-con-fondo-blanco-dBaz0xhCkPY).

## 2026-11-04 · Quinta ronda (tras ver `exploracion/direccion-v4.html`)

- **Alcance aclarado**: el portfolio lo hace él en otro sitio. Aquí solo va la marca: tipografía,
  colores, estilo, reglas y un prompt detallado para aplicarla en sus proyectos. La idea «Pokédex 3D»
  queda fuera de la marca.
- **Regla de logos**: todos los logos en gris, con la franja que les da color en la parte que cruza.
- **Fotos**: de tecnología, no de astronautas.
- **La franja**: ocupa 3/5 del ancho, no todo; el extremo que no llega al borde lleva un remate.
- Las fotos con objetos negros no sirven: el coral no tiñe el negro. Hacen falta tonos medios.
  Foto de muestra nueva: auriculares claros de Inka Kapturewska, licencia Unsplash
  (https://unsplash.com/es/fotos/una-persona-sosteniendo-un-par-de-auriculares-en-la-mano-zJkNGKYLRU0).
- Prueba de remates: `exploracion/franja-v5.html` (cápsula, corte o rayas).

## 2026-11-04 · Sexta ronda: cierre de la v1

- **Remate de la franja: C · Rayas** (se deshace en rayas que se desvanecen).
- Con esto queda fijada la versión 1 de la marca: [GUIA-MARCA.md](GUIA-MARCA.md), tokens en `tokens/`,
  [PROMPT-MARCA.md](PROMPT-MARCA.md) y la muestra en `muestra/index.html`.

Decisiones que tomé yo (Claude) para completar el sistema, a revisar por Joaquín:

- Iconos Lucide de contorno, trazo 1,75.
- Escala de espacios en múltiplos de 4 y contenedor de 1240 px.
- Sin sombras; la profundidad sale del color de las superficies.
- Único movimiento automático: la entrada de la franja (900 ms).
- Enlaces en cobalto más oscuro (`#23648F`) en modo claro para llegar al contraste AA; `#7FB4DA` en oscuro.
- El coral es el mismo en todos los proyectos; los colores propios de un proyecto, fríos y apagados.
- Monograma provisional «jb» en texto.

## 2026-11-04 · Séptima ronda (tras ver la guía v1)

- **Secciones numeradas: sí** («queda muy bien»). Se hacen a nuestra manera: número en una cápsula coral,
  no entre paréntesis ni en letra de máquina como la referencia.
- **3D: sí, para las landings.** Referencias que le gustan: bruno-simon.com, lusion.co, niccolomiranda.com,
  richardmattka.com (escenas 3D a pantalla completa, interacción con ratón y scroll, materiales metálicos).
- Prototipo: `exploracion/landing-3d-v6.html` (metal líquido gris que la franja tiñe).
- Su Windows tiene activado «reducir movimiento»: el prototipo trae un botón para ver el movimiento igualmente.

## 2026-11-04 · Octava ronda (tras ver `exploracion/landing-3d-v6.html`)

- **No le gusta el metal líquido 3D.** Quiere el diseño de FightLab PRO, no su color: nebulosa WebGL fluida en
  los laterales, rejilla de puntos, paneles de cristal con borde de luz, botones que brillan, cifras grandes.
- Prototipo con la paleta de la marca: `exploracion/landing-v7.html`.

## 2026-11-04 · Novena ronda: aprueba la v7 · versión 2 de la marca

Lo que dijo: «la nebulosa te ha salido muy bien, ponerle el toque neón a los botones y números me gusta
muchísimo, tanto el modo oscuro como el claro». «Lo de la imagen con la franja sigue también». «Vamos a hacer
el más completo con todas las cosas para subirlo completo a GitHub».

Decidido por Joaquín:

- **Nebulosa** de fondo (estilo FightLab) con la paleta de la marca.
- **Neón** (brillo coral) en botones principales y números.
- **Modo claro y oscuro**, los dos.
- **Foto con franja**: se queda.
- **Secciones numeradas** en cápsula coral.

Decisiones mías para que el sistema sea coherente (a revisar):

- Profundidad = cristal + luz. Se permiten el brillo coral y la sombra suave del cristal; siguen prohibidas las
  sombras grises bajo tarjetas planas.
- Botón principal = coral con brillo (antes tinta). Secundario = cristal con borde.
- Texto en «neón» en modo claro usa `#B83A44` (4,8:1 sobre niebla); el coral puro no llega al contraste.
- Movimiento: la nebulosa fluye siempre en landings; la franja hace su entrada una vez. Con «reducir
  movimiento» la nebulosa se queda quieta (pero se pinta) y la franja aparece colocada. El componente admite
  forzar el movimiento.
- Modo por defecto: oscuro en landings y portadas; en apps, el del sistema.
- La nebulosa animada es solo web (WebGL). En Compose va una versión estática con degradados.

- **Fotos con fondo liso siempre que se pueda** (lo pidió viendo la muestra). Foto nueva: auriculares
  plateados sobre gris de Ervo Rocks, licencia Unsplash.

- **Publicado** en https://github.com/JoaquinJBG/brand-joaquin (público, commits con su Gmail). La referencia
  aparece sin nombre ni enlaces.

## 2026-11-04 · Décima ronda: versión 2.1, lista para los proyectos

Lo que dijo: «vamos allá con todo lo que falta. Debe estar todo completo para empezar a pasárselo a los
proyectos». Propuso abrir una sesión aparte para los logos.

Añadido:

- Colores de estado (éxito, aviso, error, información) y colores de gráficas validados para daltonismo.
- Piezas de app: navegación, barra inferior, ventana emergente, aviso flotante, tabla, formulario, carga, vacío.
- Plantillas de icono de app, imagen para compartir y banner de README, con la guía de tamaños.
- Paquete instalable desde GitHub con versiones (`v2.1.0`) y CHANGELOG.
- Logos y monograma: en una sesión aparte que trabaja en su propia rama y abrirá un PR.

Decisiones mías (a revisar):

- El error es carmesí `#C8323F` (texto `#B42B37` / `#FF5A6A`), distinto del coral del botón.
- Series de gráficas: cobalto, coral, violeta, verde azulado y ocre, en ese orden; máximo 5.
- El paquete es `private` y `UNLICENSED`: se instala desde GitHub pero no se publica en npm ni da permiso para
  reutilizar la marca.
- El preset de Tailwind v3 pasa a `tailwind.preset.cjs` porque el paquete es ESM.

## 2026-11-04 · Undécima ronda: estados y gráficas

- Los estados con borde de color a la izquierda le parecen feos («muy Claude»). Ahora: iconos en neón, sin
  borde; error con cara de ojos x.x y «nuevo» con cara de ojos de estrella; éxito y aviso con su icono, en neón.
- Pidió darle una vuelta a las gráficas: cifra grande, degradado, lo importante en neón, anillo y área.
- Referencias consultadas en Mobbin (Railway, Searchable, Origin, Lovable): el estado ocupa poco sitio.

## 2026-11-04 · Duodécima ronda: remate de la franja

- Probó un final en nebulosa (dos variantes) y no le gustó.
- Entre puntos, degradado, escalones y corte de neón eligió **D · Corte de neón**: el extremo acaba en seco con
  una línea de neón que brilla. Sustituye a las rayas.
- Prueba: `exploracion/franja-remates-v9.html`.

## Pendiente

- Logos y monograma definitivos (sesión aparte); después, pasarlos a las plantillas de icono e imagen.
- Probar la marca en un proyecto real (empezar por FightLab).
- Compilar `tokens/compose/` dentro de Efectivo.; después, pasarlo a la guía, los tokens, el prompt y la muestra.
- Logos de los proyectos y monograma definitivo: los pasará Joaquín. La regla ya está (gris + franja).
- Compilar `tokens/compose/` dentro de Efectivo (está escrito pero no compilado).
- Si quiere, una foto propia o de sus proyectos en lugar de la foto de muestra de Unsplash.
- Pokédex 3D: ¿marca o solo edición especial del portfolio?
- ¿Modo claro?
