// Tailwind v3: presets: [require("./marca/tailwind.preset.js")], e importa tokens.css (los colores de rol son sus variables).
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
        lead: ["18px", { lineHeight: "1.6" }],
      },
      borderRadius: {
        sm: "12px",
        md: "16px",
        lg: "28px",
        full: "999px",
      },
      boxShadow: {
        DEFAULT: "none",
        focus: "0 0 0 2px var(--jb-bg), 0 0 0 4px var(--jb-link)",
      },
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
