# marca personal · Joaquín Beltrán

Identidad visual común para mis proyectos personales (FightLab PRO, NoticIA, Efectivo, Team Builder…).
Cada proyecto tiene su propio diseño; lo que los une es esto.

| Archivo | Qué es |
|---|---|
| [GUIA-MARCA.md](GUIA-MARCA.md) | La guía: principios, color, letra, espacio, la franja, logos, fotos, iconos, componentes, movimiento, tono, qué no hacemos y checklist |
| [tokens/](tokens/) | Valores listos para usar: `tokens.css`, `componentes.css`, Tailwind v3 y v4, Compose |
| [PROMPT-MARCA.md](PROMPT-MARCA.md) | Bloque para el `CLAUDE.md` de cada proyecto y prompt para aplicar la marca con Claude |
| [plantillas/logo-franja.svg](plantillas/logo-franja.svg) | Plantilla para los logos grises con franja |
| [muestra/index.html](muestra/index.html) | Página de muestra viva |
| [DECISIONES.md](DECISIONES.md) | Qué se decidió y cuándo |
| [exploracion/](exploracion/) | Las propuestas por las que pasamos hasta llegar aquí |

## Ver la muestra

La muestra carga los tokens con rutas relativas, así que hay que servir la carpeta:

```bash
python -m http.server 4173 --bind 127.0.0.1
```

Y abrir http://127.0.0.1:4173/muestra/
