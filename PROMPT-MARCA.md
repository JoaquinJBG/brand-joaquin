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

This project follows Joaquín's personal brand. Source of truth: C:\dev\personal\marca-personal
(GUIA-MARCA.md for rules, tokens/ for values, muestra/index.html for a live reference).

- Never hard-code brand colors, fonts, radii or durations: use the tokens (CSS variables `--jb-*`,
  Tailwind preset/theme, or `MarcaTheme` in Compose).
- Cold greys first, coral (#F97279) only for the band, big blocks and the single accent button.
  Coral is never small text on a light background.
- Headings: Bricolage Grotesque 800, lowercase, tracking -0.045em, no trailing period. Body: Geist.
- Buttons, chips and inputs are pills. Cards are 28px radius, no border, no shadow.
- The signature is "the band" (la franja): coral, enters from the right edge, 60% wide, at 46% from the top,
  30% tall, inner end dissolves into fading 7px stripes. Used once per key screen. Photos are black and white
  with the band in multiply; logos are grey (#738A9A) with the in-band part in ink (#161D24).
- Only automatic motion: the band slides in once on load (900ms ease-out). Respect prefers-reduced-motion.
- Do not: orange, near-black default background, uppercase micro-labels, monospace decoration, 01/02/03
  numbering, hairline grids, particle spheres, coloured dots after headings, coloured top stripes on cards,
  decorative 3D geometric shapes, drop shadows, emoji icons.
- UI copy in Spanish (Spain), "tú", short and direct, verbs on buttons, no exclamation marks.
```

---

## 2. Prompt de aplicación

```markdown
Apply my personal brand to <PROJECT NAME> (<path>), a <Next.js/React | Angular | Kotlin + Jetpack Compose | other>
app that <one line on what it does>.

## Context
My personal brand lives in C:\dev\personal\marca-personal. Read these first, in this order:
1. GUIA-MARCA.md: every rule (color roles, type scale, spacing, radii, the band, logos, photography,
   icons, components, motion, tone of voice, what we never do, checklist).
2. tokens/: tokens.css (CSS variables, light and dark), componentes.css (jb-* classes and the band),
   tailwind.preset.js (Tailwind v3), tailwind-v4.css (Tailwind v4), compose/MarcaTheme.kt and
   compose/Franja.kt (Android).
3. muestra/index.html: the live reference. Open it in the browser to see how things should look.
4. plantillas/logo-franja.svg: template for project logos.

The goal is not to make every project look the same. Each project keeps its own layout and features; what must
be recognisable is the palette, the type, the band, the pills, the calm cold surfaces and the tone.

## What to do
1. Audit the current UI: list where colors, fonts, radii, shadows and motion are defined, and which screens
   are the "key" ones (landing, home, main dashboard). Show me the list before changing anything big.
2. Bring the tokens in:
   - Web: copy tokens/ to <src/styles/marca/>, import tokens.css once at the root. With Tailwind v4 also
     import tailwind-v4.css; with v3 add the preset. Without Tailwind, import componentes.css and use jb-*
     classes where it makes sense.
   - Android: copy compose/ into the UI module, fix the package, add ui-text-google-fonts and font_certs.xml,
     wrap the app in MarcaTheme. These files were never compiled: build and fix them.
   - Load Bricolage Grotesque (800) and Geist (400/500/600).
3. Replace hard-coded values with tokens. Map the existing semantic colors to the roles (bg, surface,
   surface-2, fg, fg-muted, fg-subtle, line, accent, on-accent, link, btn, on-btn). In Material/Angular
   Material: primary = ink (buttons), secondary/accent = coral, tertiary = cobalt.
4. Restyle components: pill buttons (primary ink, one coral accent button per screen at most, outline,
   64px round icon button), pill chips and inputs, 28px cards on surface with no border or shadow,
   lowercase Bricolage headings without trailing periods, Lucide outline icons at 1.75 stroke.
5. Add the band once on each key screen (hero, main photo or the project logo), with the entrance animation.
   Use the exact geometry from the guide. Photos: grayscale + multiply. Logos: grey outside, ink inside.
6. Make both light and dark mode work (data-theme="dark" on <html> on web; isSystemInDarkTheme on Android)
   and check contrast with the table in the guide.
7. Rewrite UI copy that breaks the tone of voice (section 13 of the guide). Keep meaning; do not invent features.
8. Go through "Qué no hacemos" (section 14) and remove anything on that list.

## Constraints
- Do not change behavior, data or routes. This is a visual and copy change only.
- Keep each project's own layout; do not copy the sample page structure.
- Domain colors the product needs (chart series, statuses) use salvia, cobalt and hielo first; never another
  warm color that competes with coral.
- Accessibility: visible keyboard focus (--focus-ring), 44px minimum touch targets, prefers-reduced-motion,
  WCAG AA contrast.

## Done when
- The checklist in GUIA-MARCA.md section 15 passes, item by item (report each one).
- Both themes checked in the running app (screenshots of the key screens, light and dark, desktop and mobile).
- No hard-coded brand values left (grep for the hex values and font names outside the token files).
- Build, lint and tests pass.
```
