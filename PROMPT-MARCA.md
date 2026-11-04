# Prompt para aplicar la marca

Dos piezas:

1. **Bloque para `CLAUDE.md`**: pégalo en el `CLAUDE.md` de cada proyecto personal para que Claude respete la marca
   siempre que toque la interfaz.
2. **Prompt de aplicación**: pégalo en una sesión de Claude Code cuando quieras llevar la marca a un proyecto
   (nuevo o existente). Cambia lo que va entre `<>`.

Los dos están en inglés porque Claude sigue mejor las instrucciones técnicas así; los textos de la interfaz que
genere seguirán en español.

---

## 1. Bloque para `CLAUDE.md`

```markdown
## Personal brand (Joaquín Beltrán)

This project follows Joaquín's personal brand (v2.3). Source of truth: https://github.com/JoaquinJBG/brand-joaquin (local copy: C:\dev\personal\marca-personal)
(GUIA-MARCA.md for rules, tokens/ for values, muestra/index.html for a live reference).

- Never hard-code brand colors, fonts, radii, glows or durations: use the tokens (CSS variables `--jb-*`,
  Tailwind preset/theme, or `MarcaTheme` in Compose).
- Look: cold greys + light. Landings use the animated nebula background (tokens/nebulosa.js + .jb-fondo),
  glass panels with a coral-to-cobalt light edge (.jb-glass), and a coral neon glow on the primary button,
  section numbers, hero stats and progress bars only. Dark mode by default on landings; apps follow the system.
- Primary button: coral pill (#F97279) with ink text and glow, one per screen. Secondary: ghost glass pill.
- Section numbers: two digits in a coral glowing pill (.jb-num), only for real page sections.
- Headings: Bricolage Grotesque 800, lowercase, tracking -0.045em, no trailing period. Body: Geist.
  Big numbers: .jb-stat; neon text uses --jb-neon-text (#B83A44 in light mode for contrast).
- Text never sits directly on the nebula: center vignette or inside glass.
- The signature is "the band" (la franja): coral, enters from the right edge, 60% wide, at 46% from the top,
  30% tall, inner end is a hard "neon cut": a 4px glowing coral line that overhangs 14% top and bottom. Once per key screen. Photos are black and white
  (tech objects on a plain background, mid tones) with the band in multiply; logos are grey (#738A9A) with the in-band part in ink.
- Motion: nebula flows continuously; the band slides in once (900ms ease-out); everything else only reacts to
  the user. With prefers-reduced-motion the nebula is painted still and the band appears in place.
- Do not: grey drop shadows under flat cards, coloured dots after headings, coloured top stripes on cards,
  decorative 3D shapes or liquid metal, coral as small text on light, glow everywhere, text on bare nebula,
  orange, uppercase micro-labels, monospace decoration, hairline grids, particle spheres, emoji icons.
- Status: neon icon + text inside a glass pill, never coloured blocks or a coloured left edge. Error uses the
  x.x face icon, new/info the star-eyes face (plantillas/iconos/). Error is crimson, never the button coral.
- Charts: big stat on top; single series in cobalt gradient with the key value in coral neon; lines with a soft
  area and glow; ring gauges; multi-series in fixed order (--jb-serie-1..5), max 5, legend + hover + table view,
  one y-axis only.
- App pieces: .jb-nav / .jb-tabbar, .jb-modal on <dialog>, .jb-toast inside aria-live, .jb-tabla, .jb-campo
  (visible label, help and error under the field), .jb-skeleton, .jb-vacio. In Compose use Material 3
  components with MarcaTheme and LocalColoresJb.
- Icons, favicon, share image and README banner come from the brand templates (plantillas/, ICONOS.md).
- UI copy in Spanish (Spain), "tú", short and direct, verbs on buttons, no exclamation marks.
```

---

## 2. Prompt de aplicación

```markdown
Apply my personal brand (v2.3) to <PROJECT NAME> (<path>), a <Next.js/React | Angular | Kotlin + Jetpack Compose | other>
app that <one line on what it does>.

## Context
My personal brand lives in https://github.com/JoaquinJBG/brand-joaquin (local copy: C:\dev\personal\marca-personal). Read these first, in this order:
1. GUIA-MARCA.md: every rule (color roles and contrast, type scale, spacing, radii, glass and light, nebula
   background, the band, section numbers, logos, photography, icons, components, motion, tone of voice,
   what we never do, checklist, per-technology notes).
2. tokens/: tokens.css (CSS variables, light and dark), componentes.css (jb-* classes, glass, glow, numbers,
   stats, the band), nebulosa.js (WebGL nebula, no dependencies), tailwind.preset.cjs (v3), tailwind-v4.css (v4),
   compose/MarcaTheme.kt, compose/Luz.kt and compose/Franja.kt (Android).
3. muestra/index.html: the live reference. Serve the folder (python -m http.server 4173) and open /muestra/.
4. plantillas/logo-franja.svg: template for project logos.

The goal is not to make every project look the same. Each project keeps its own layout and features; what must
be recognisable is the palette, the type, the nebula + glass + neon light, the band, the pills and the tone.

## What to do
1. Audit the current UI: list where colors, fonts, radii, shadows and motion are defined, and which screens
   are the "key" ones (landing, home, main dashboard). Show me the list before changing anything big.
2. Bring the tokens in:
   - Web: install the brand with `pnpm add github:JoaquinJBG/brand-joaquin#v2.3.0` and import
     brand-joaquin/fuentes.css first (or next/font/google in Next.js), then brand-joaquin/tokens.css and brand-joaquin/componentes.css once at the root. With Tailwind v4 also import
     brand-joaquin/tailwind-v4.css; with v3 use presets: [require("brand-joaquin/tailwind-preset")]. Mount the nebula with
     montarNebulosa(canvas) inside a .jb-fondo element on landing/hero screens and destroy it on unmount.
   - Android: copy compose/ into the UI module, fix the package, add ui-text-google-fonts and font_certs.xml,
     wrap the app in MarcaTheme, use FondoNebulosa on the welcome screen, Cristal for panels and
     Modifier.brilloCoral() on the primary button. These files were never compiled: build and fix them.
   - Load Bricolage Grotesque (800) and Geist (400/500/600).
3. Replace hard-coded values with tokens. Map the existing semantic colors to the roles (bg, surface,
   surface-2, fg, fg-muted, line, btn, on-btn, neon-text, link). In Material/Angular Material:
   primary = coral (buttons), secondary = ink/niebla, tertiary = cobalt.
4. Restyle components: coral glowing primary pill (one per screen), ghost glass and outline pills, 64px round
   icon button, glass panels with the light edge, pill chips and inputs, section numbers in .jb-num, big numbers
   in .jb-stat (neon for the hero stat), progress bars in .jb-bar, lowercase Bricolage headings without
   trailing periods, Lucide outline icons at 1.75 stroke.
5. Add the band once on each key screen (hero photo or the project logo), with the entrance animation. Use the
   exact geometry from the guide. Photos: grayscale + multiply, tech objects on a plain background whenever possible, mid tones. Logos: grey outside,
   ink inside.
6. Make both light and dark mode work (data-theme on <html> on web; isSystemInDarkTheme on Android), dark by
   default on landings, and check contrast with the table in the guide.
7. Check prefers-reduced-motion: the nebula must still be painted (static) and the band must appear in place.
8. Rewrite UI copy that breaks the tone of voice (section 20 of the guide). Keep meaning; do not invent features.
9. Apply states (section 15), charts (section 16) and app pieces (section 17) wherever the product has them,
   and generate the favicon, app icons, share image and README banner from the templates (section 18).
10. Go through "Qué no hacemos" (section 21) and remove anything on that list.

## Constraints
- Do not change behavior, data or routes. This is a visual and copy change only.
- Keep each project's own layout; do not copy the sample page structure.
- Dense app screens (tables, long forms) use the plain bg, not the nebula.
- Domain colors the product needs (chart series, statuses) use salvia, cobalt and hielo first; never another
  warm color that competes with coral.
- Accessibility: visible keyboard focus (--focus-ring), 44px minimum touch targets, prefers-reduced-motion,
  WCAG AA contrast.

## Done when
- The checklist in GUIA-MARCA.md section 22 passes, item by item (report each one).
- Both themes checked in the running app (screenshots of the key screens, light and dark, desktop and mobile),
  plus one check with reduced motion on.
- No hard-coded brand values left (grep for the hex values and font names outside the token files).
- Build, lint and tests pass.
```
