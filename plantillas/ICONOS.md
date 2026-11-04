# Iconos, imagen para compartir y banner

Plantillas en esta carpeta. Todas usan la paleta y la franja de la marca. Cuando existan los logos definitivos
(carpeta `logos/`), se cambia el grupo marcado y nada más.

| Plantilla | Tamaño | Qué cambiar |
|---|---|---|
| [`logo-franja.svg`](logo-franja.svg) | 600 × 240 (5:2) | el grupo `#marca` por el logo del proyecto |
| [`icono-app.svg`](icono-app.svg) | 512 × 512 | el grupo `#simbolo` (y su copia recortada) por el símbolo; borra `#guia-zona-segura` al exportar |
| [`og-1200x630.svg`](og-1200x630.svg) | 1200 × 630 | `#titulo`, `#subtitulo` y el grupo `#marca` |
| [`banner-readme.svg`](banner-readme.svg) | 1280 × 320 | `#titulo` y `#subtitulo` |

## Reglas

- El icono de app lleva el símbolo en acero con la franja; dentro de la franja, en tinta. **Sin rayas**: a
  tamaño de icono se convierten en ruido.
- En iconos de 48 px o menos no hay franja: símbolo en niebla sobre abismo (o en tinta sobre niebla).
- Todo el texto de las plantillas se convierte a trazados antes de exportar a PNG, para no depender de que el
  ordenador tenga la letra instalada.

## Tamaños que hay que exportar

### Web y PWA (FightLab, NoticIA, Team Builder)

| Archivo | Tamaño | De qué plantilla |
|---|---|---|
| `favicon.svg` | vectorial | símbolo en tinta, sin franja |
| `favicon.ico` | 16, 32 y 48 px dentro | símbolo sin franja |
| `apple-touch-icon.png` | 180 × 180 | `icono-app.svg` |
| `icon-192.png` | 192 × 192 | `icono-app.svg` |
| `icon-512.png` | 512 × 512 | `icono-app.svg` |
| `icon-maskable-512.png` | 512 × 512, sin esquinas redondeadas | `icono-app.svg` con el fondo a sangre |
| `og.png` | 1200 × 630 | `og-1200x630.svg` |

Entradas del `manifest.webmanifest`:

```json
{
  "theme_color": "#0A0E13",
  "background_color": "#0A0E13",
  "icons": [
    { "src": "/icon-192.png", "sizes": "192x192", "type": "image/png" },
    { "src": "/icon-512.png", "sizes": "512x512", "type": "image/png" },
    { "src": "/icon-maskable-512.png", "sizes": "512x512", "type": "image/png", "purpose": "maskable" }
  ]
}
```

En el `<head>`: `<meta name="theme-color" content="#0A0E13">` (y `#E7EEF2` con `media="(prefers-color-scheme: light)"`
si la app arranca en claro), `<meta property="og:image" content="/og.png">` y
`<link rel="icon" href="/favicon.svg" type="image/svg+xml">`.

### Android (Efectivo)

Icono adaptativo: capa de fondo y capa de primer plano de 108 × 108 dp. Solo los 66 dp centrales se ven
siempre: el símbolo y la franja tienen que caber en ese círculo (en la plantilla de 512 px, el círculo de 332 px).

| Recurso | Contenido |
|---|---|
| `ic_launcher_background` | abismo `#0A0E13` (o el degradado de nebulosa de la plantilla) |
| `ic_launcher_foreground` | símbolo + franja, desde `icono-app.svg` sin el fondo |
| `ic_launcher_monochrome` | símbolo solo, un color (para los iconos temáticos de Android 13) |
| `ic_launcher.png` de respaldo | 48, 72, 96, 144 y 192 px (mdpi → xxxhdpi) |

Se pueden generar desde Android Studio (*Image Asset*) a partir de los SVG.
