# marca personal · Joaquín Beltrán

Repositorio: https://github.com/JoaquinJBG/brand-joaquin

Identidad visual común para mis proyectos personales (FightLab PRO, NoticIA, Efectivo, Team Builder…).
Cada proyecto tiene su propio diseño; lo que los une es esto: grises fríos, una nebulosa que fluye, cristal con
borde de luz, un coral que brilla como un neón y una franja coral que cruza fotos y logos.

| Archivo | Qué es |
|---|---|
| [GUIA-MARCA.md](GUIA-MARCA.md) | La guía completa (v2): principios, color y contraste, letra, espacio, esquinas, cristal y luz, nebulosa, franja, secciones numeradas, logos, fotos, iconos, componentes, movimiento, tono, qué no hacemos, checklist y notas por tecnología |
| [tokens/](tokens/) | `tokens.css` (variables, claro y oscuro), `componentes.css` (clases `jb-*`), `nebulosa.js` (fondo WebGL), Tailwind v3 y v4, y `compose/` para Android |
| [PROMPT-MARCA.md](PROMPT-MARCA.md) | Bloque para el `CLAUDE.md` de cada proyecto y prompt para aplicar la marca con Claude |
| [plantillas/](plantillas/) | Plantillas de logo con franja, icono de app, imagen para compartir y banner de README, con la guía de tamaños |
| [muestra/index.html](muestra/index.html) | Página de muestra viva con todas las piezas |
| [DECISIONES.md](DECISIONES.md) | Qué se decidió y cuándo |
| [exploracion/](exploracion/) | Las propuestas por las que pasamos hasta llegar aquí |

## Ver la muestra

La muestra carga los tokens y la nebulosa con rutas relativas, así que hay que servir la carpeta:

```bash
python -m http.server 4173 --bind 127.0.0.1
```

Y abrir http://127.0.0.1:4173/muestra/

Si tu sistema tiene activado «reducir movimiento», la nebulosa sale quieta: pulsa «Movimiento» arriba a la
derecha para verla fluir.

## Usarla en un proyecto

```bash
pnpm add github:JoaquinJBG/brand-joaquin#v2.3.0
```

Cómo importarla en Tailwind v4, v3, Angular y Compose: apartado 24 de la guía. Cambios por versión en
[CHANGELOG.md](CHANGELOG.md).

Sigue la checklist del apartado 22 de la guía, o pega el prompt de [PROMPT-MARCA.md](PROMPT-MARCA.md) en una
sesión de Claude Code dentro del proyecto.

## Créditos

- Letras: Bricolage Grotesque y Geist (Google Fonts, licencia OFL).
- Foto de muestra: Ervo Rocks en Unsplash (licencia Unsplash).
- Nebulosa inspirada en el fondo de FightLab PRO.
