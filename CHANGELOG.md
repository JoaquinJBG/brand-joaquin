# Cambios

Versiones de la marca. Los proyectos instalan una versión fija (`#v2.3.0`) y la suben cuando quieren.

## 2.3.0 · 2026-11-04

- **La franja acaba en un corte de neón** en vez de rayas: línea coral de 4 px que brilla y sobresale un 14 %.
  Cambia en `componentes.css` (tokens `--franja-corte` y `--franja-corte-sobra`), en Compose (`FranjaJb.corte`,
  `corteSobra`) y en las plantillas SVG de logo, imagen para compartir y banner.

## 2.2.0 · 2026-11-04

- **Estados en neón**: icono que brilla y texto dentro de una cápsula de cristal, sin bloques ni borde de color.
  Error con una cara de ojos x.x y «nuevo» con una cara de ojos de estrella (`plantillas/iconos/`).
  Nueva variante `.jb-alerta--info` y `.jb-chip--info`.
- **Gráficas rediseñadas**: cifra grande encima, barras con degradado y la semana actual en coral con neón,
  línea con área y brillo, anillo para ratios y barras apiladas para varias series.
- Las etiquetas (`.jb-chip`) ya no parten el texto en varias líneas.

## 2.1.1 · 2026-11-04

- Las letras salen de `tokens.css` a `fuentes.css`: al importar la marca desde Tailwind, el `@import` de Google
  Fonts quedaba en medio del CSS final y el navegador lo ignoraba. En Next.js, mejor `next/font/google`.

## 2.1.0 · 2026-11-04

Lista para llevar a los proyectos.

- **Colores de estado**: éxito, aviso, error e información, con versión de texto que pasa el contraste en claro y
  en oscuro. El error es carmesí, distinto del coral del botón principal.
- **Gráficas**: cinco series en orden fijo (cobalto, coral, violeta, verde azulado, ocre) validadas para
  daltonismo en los dos modos, escala secuencial de cobalto y divergente cobalto ↔ coral.
- **Piezas de app**: alertas, navegación de escritorio, barra inferior móvil, ventana emergente, avisos
  flotantes, tabla, formulario con ayuda y errores, carga y estado vacío.
- **Plantillas**: imagen para compartir (1200 × 630), banner de README, icono de app y guía de tamaños de
  iconos para web, PWA y Android.
- **Instalable**: `package.json` con exports para CSS, nebulosa y Tailwind. El preset de Tailwind v3 pasa a
  llamarse `tailwind.preset.cjs`.
- Compose: colores de estado y de series en `ColoresJb` (`LocalColoresJb`), y `error` en el tema de Material.

## 2.0.0 · 2026-11-04

- Estilo de FightLab con la paleta de la marca: nebulosa WebGL, cristal con borde de luz, neón coral en el
  botón principal, números de sección y cifras.
- El botón principal pasa a coral. Secciones numeradas en cápsula coral.
- Fotos de tecnología sobre fondo liso, en blanco y negro, con la franja.

## 1.0.0 · 2026-11-04

- Primera versión: paleta fría con coral y cobalto, Bricolage Grotesque y Geist, la franja con rayas, logos
  grises con franja, tokens CSS, Tailwind y Compose.
