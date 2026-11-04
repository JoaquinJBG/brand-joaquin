// Tailwind v3: presets: [require("./marca/tailwind.preset.cjs")], e importa tokens.css (los colores de rol son sus variables).
/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: ["selector", '[data-theme="dark"]'],
  theme: {
    extend: {
      colors: {
        jb: {
          niebla: "#E7EEF2",
          hielo: "#CCDBE2",
          acero: "#738A9A",
          pizarra: "#435565",
          salvia: "#697773",
          tinta: "#161D24",
          noche: "#121820",
          abismo: "#0A0E13",
          coral: "#F97279",
          cobalto: "#2A72A3",
        },
        bg: "var(--jb-bg)",
        surface: { DEFAULT: "var(--jb-surface)", 2: "var(--jb-surface-2)" },
        fg: { DEFAULT: "var(--jb-fg)", muted: "var(--jb-fg-muted)", subtle: "var(--jb-fg-subtle)" },
        line: "var(--jb-line)",
        accent: { DEFAULT: "var(--jb-accent)", on: "var(--jb-on-accent)" },
        link: "var(--jb-link)",
        btn: { DEFAULT: "var(--jb-btn)", on: "var(--jb-on-btn)" },
        neon: "var(--jb-neon-text)",
        exito: { DEFAULT: "var(--jb-exito)", texto: "var(--jb-exito-texto)" },
        aviso: { DEFAULT: "var(--jb-aviso)", texto: "var(--jb-aviso-texto)" },
        error: { DEFAULT: "var(--jb-error)", texto: "var(--jb-error-texto)" },
        info: { DEFAULT: "var(--jb-info)", texto: "var(--jb-info-texto)" },
        serie: { 1: "var(--jb-serie-1)", 2: "var(--jb-serie-2)", 3: "var(--jb-serie-3)", 4: "var(--jb-serie-4)", 5: "var(--jb-serie-5)" },
        seq: { 100: "#D7E7F3", 200: "#ADCDE6", 300: "#7FB0D6", 400: "#4C8FC2", 500: "#2A72A3", 600: "#1F5880", 700: "#143E5C" },
      },
      fontFamily: {
        display: ["Bricolage Grotesque", "Arial Black", "sans-serif"],
        sans: ["Geist", "system-ui", "-apple-system", "Segoe UI", "sans-serif"],
      },
      fontSize: {
        hero: ["clamp(72px, 10.5vw, 164px)", { lineHeight: "0.86", letterSpacing: "-0.045em", fontWeight: "800" }],
        h1: ["clamp(56px, 7.5vw, 112px)", { lineHeight: "0.88", letterSpacing: "-0.045em", fontWeight: "800" }],
        h2: ["clamp(44px, 6vw, 84px)", { lineHeight: "0.9", letterSpacing: "-0.045em", fontWeight: "800" }],
        h3: ["34px", { lineHeight: "0.95", letterSpacing: "-0.045em", fontWeight: "800" }],
        h4: ["24px", { lineHeight: "1", letterSpacing: "-0.03em", fontWeight: "800" }],
        stat: ["56px", { lineHeight: "1", letterSpacing: "-0.045em", fontWeight: "800" }],
        lead: ["18px", { lineHeight: "1.6" }],
      },
      borderRadius: {
        sm: "12px",
        md: "16px",
        lg: "28px",
        full: "999px",
      },
      boxShadow: {
        focus: "0 0 0 2px var(--jb-bg), 0 0 0 4px var(--jb-link)",
        glow: "var(--jb-glow)",
        "glow-hover": "var(--jb-glow-hover)",
        glass: "var(--jb-glass-shadow)",
      },
      backgroundImage: { glass: "var(--jb-glass-bg)" },
      dropShadow: { neon: "0 0 18px rgba(249, 114, 121, .55)" },
      backdropBlur: { glass: "18px" },
      maxWidth: { container: "1240px" },
      transitionTimingFunction: {
        out: "cubic-bezier(.2, .8, .2, 1)",
        "in-out": "cubic-bezier(.65, 0, .35, 1)",
      },
      transitionDuration: { fast: "150ms", base: "220ms", slow: "400ms", entrance: "900ms" },
      keyframes: {
        "franja-entra": { from: { transform: "translateX(110%)" } },
      },
      animation: {
        "franja-entra": "franja-entra 900ms cubic-bezier(.2, .8, .2, 1) 150ms both",
      },
    },
  },
};
