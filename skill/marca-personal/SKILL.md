---
name: marca-personal
description: Use when Joaquín asks to apply, bring in, update or check his personal brand in one of his personal projects (FightLab PRO, NoticIA, Efectivo, PokemonTeamBuilder / Team Builder, Percha, his portfolio or any new personal project) — "aplica mi branding personal", "aplica mi marca", "ponle mi estilo", "pásale la marca personal", "que se vea como mis proyectos", "actualiza la marca a la última versión", "¿esto cumple mi marca?". Also when designing any new screen, landing, logo, icon or README banner for one of those projects. Not for Bettergy repos (caes, miot, bettergyHub…): they have their own brand.
---

# Aplicar la marca personal de Joaquín

La marca es suya y está definida en un repo con versiones. Esta skill te dice dónde está, cómo llevarla a un
proyecto sin romper nada y cómo comprobar que ha quedado bien. Joaquín entiende poco de diseño: explícale con
capturas y frases cortas, no con teoría.

## 1. La fuente de verdad

- Repo: https://github.com/JoaquinJBG/brand-joaquin · copia local `C:\dev\personal\marca-personal`.
- Mira la última versión antes de nada: `git ls-remote --tags https://github.com/JoaquinJBG/brand-joaquin`
  (la etiqueta `vX.Y.Z` más alta). No hay «releases» en GitHub, solo etiquetas. Usa siempre esa etiqueta, no
  `main`. Para leer los documentos de esa versión: `git -C C:\dev\personal\marca-personal show vX.Y.Z:GUIA-MARCA.md`
  (si la copia local no tiene la etiqueta, haz `git -C … fetch --tags`).
- Lee **entero** `GUIA-MARCA.md` antes de tocar nada: ahí están las reglas y sus porqués. Después
  `CHANGELOG.md` (qué cambió) y `PROMPT-MARCA.md` (el bloque para el `CLAUDE.md` del proyecto).
- La muestra viva enseña cómo se ve cada pieza: sirve la carpeta (`python -m http.server 4173 --bind 127.0.0.1`
  dentro de `marca-personal`) y abre `http://127.0.0.1:4173/muestra/`.

En una frase: grises fríos y coral `#F97279`, nebulosa que fluye por los lados, paneles de cristal con borde de
luz, neón coral en el botón principal, los números y las cifras, títulos en Bricolage Grotesque 800 en
minúsculas, y como sello **la franja**: banda coral a 3/5 del ancho que entra por la derecha, tiñe fotos y logos
y acaba en un corte de neón.

## 2. Antes de cambiar nada

Si Joaquín solo pide revisar («¿esto cumple mi marca?», «¿cómo lo harías?»), trabaja en solo lectura: haz los
pasos 1 y 2, el inventario y el plan, y no instales ni cambies nada.

1. Comprueba que es un proyecto personal suyo. Si es un repo de Bettergy, para y pregúntale.
2. Lee el `CLAUDE.md` / `AGENTS.md` del proyecto: sus normas mandan sobre esta skill en cómo se trabaja
   (ramas, commits, tests).
3. Averigua el stack (Next.js/React, Angular, Kotlin + Compose, otro) y las **pantallas clave** (portada,
   inicio, panel principal).
4. Haz un inventario corto: dónde se definen colores, letras, radios, sombras y animaciones; qué logo, iconos,
   favicon e imagen para compartir tiene ahora.
5. Busca choques con la marca: nombres de tokens repetidos (`--color-bg`, `--font-display`…), colores escritos a
   mano en `.tsx`/`.ts` (incluida la lógica que devuelve colores), colores de estado propios, mayúsculas
   pequeñas, animaciones de «aparece y sube», emojis.
6. Pregúntale lo que solo él decide, sin suponerlo:
   - **Modo claro**: si el proyecto solo tiene oscuro, no le añadas claro salvo que lo pida.
   - **Nebulosa**: en apps donde ya va de fondo en todas las pantallas, si se queda en todas o solo en portada,
     login y bienvenida (la guía pide fondo liso en pantallas densas).
   - **Iconos propios**: si se quedan (pasándolos a contorno de 1,75) o se cambian por Lucide.
7. Enséñale el plan en pocas líneas y una captura del «antes» de las pantallas clave. Espera su visto bueno si el
   cambio es grande.

## 3. Traer la marca

| Stack | Cómo |
|---|---|
| Web (cualquiera) | `pnpm add github:JoaquinJBG/brand-joaquin#<etiqueta>` (o el gestor que use el proyecto) |
| Letras en Next.js | `next/font/google` con `variable` (`Bricolage_Grotesque({ weight: "800", variable: "--fuente-display" })` y `Geist({ variable: "--fuente-body" })`), las clases en `<html>`, y **después** de los imports de la marca: `:root { --font-display: var(--fuente-display), "Bricolage Grotesque", sans-serif; --font-body: var(--fuente-body), "Geist", system-ui, sans-serif; }`. Hace falta porque next/font renombra la letra y los tokens usan el nombre literal. No importes `fuentes.css` |
| Letras fuera de Next.js | `@import "brand-joaquin/fuentes.css";` como **primera línea** del CSS (si va después, el navegador lo ignora) |
| Tailwind v4 | en el CSS global: `fuentes.css` (solo si no es Next.js), `tailwindcss`, `brand-joaquin/tokens.css`, `brand-joaquin/componentes.css`, `brand-joaquin/tailwind-v4.css`. Borra del `@theme` del proyecto los nombres que ya trae la marca (`--color-bg`, `--color-surface`, `--color-neon`, `--font-display`…) y renombra sus utilidades a las de la marca (`text-ink` → `text-fg`, `text-muted` → `text-fg-muted`) |
| Tailwind v3 | `presets: [require("brand-joaquin/tailwind-preset")]` + importar `tokens.css` y `componentes.css` en el punto de entrada |
| Angular | los mismos `@import` en `styles.css`; si usa Angular Material, `primary` = coral |
| Nebulosa | `import { montarNebulosa } from "brand-joaquin/nebulosa"` sobre un `<canvas>` dentro de `.jb-fondo`; destrúyela al desmontar |
| Kotlin + Compose | copia `tokens/compose/` del repo al módulo de UI, cambia el `package`, añade `ui-text-google-fonts` y `font_certs.xml`, envuelve la app en `MarcaTheme`. Esos archivos nunca se han compilado: compílalos y arréglalos |

Detalle completo en el apartado 24 de la guía. Si el proyecto es una PWA, sube la versión de la caché del
service worker y del manifest: si no, el icono, el `theme-color` y los estilos nuevos pueden no verse.

## 4. Aplicarla

Sigue el apartado 22 de la guía («Cómo aplicarla a un proyecto nuevo») punto por punto. Lo esencial:

- Sustituye valores sueltos por los tokens (`--jb-*`, utilidades de Tailwind o `MarcaTheme`). Mapea los colores
  que ya tenga el proyecto a los roles de la marca, también los de estado (`good/warn/bad` → `exito/aviso/error`;
  un rojo o rosa propio que se parezca al coral se cambia por el carmesí de error). Si un color vive en la lógica
  (una función que devuelve un hex), que devuelva el rol (`"var(--jb-error)"`) o un nombre de rol que la vista
  traduzca, nunca el hex.
- Apps móviles (una sola columna): navegación con `.jb-tabbar`; el contenedor de 1240 px y la retícula de 12
  columnas son para landings y escritorio.
- **Respeta la estructura del proyecto**: cambia el aspecto, no las pantallas, los datos ni el comportamiento.
  La marca no busca que todos los proyectos sean iguales, sino que se reconozcan como suyos.
- Portada o pantalla de bienvenida: nebulosa de fondo, oscuro por defecto. Pantallas densas (tablas, formularios
  largos): fondo liso.
- Botón principal coral con brillo, uno por pantalla; el resto, cristal o contorno. Paneles en `.jb-glass`.
- Secciones numeradas con `.jb-num` solo si son una secuencia real.
- La franja **una vez** en la pieza principal (foto o logo).
- Estados con icono en neón y texto (caras x.x y ojos de estrella en `plantillas/iconos/`), sin bloques ni
  borde de color a un lado.
- Gráficas: cifra grande encima, el valor clave en neón, series en su orden fijo, tabla alternativa.
- Logos: si el repo de marca tiene `logos/<proyecto>/`, úsalos (logo, versión con franja, símbolo, favicon). Si
  no, deja el logo actual y avisa de que falta.
- Icono de app, favicon, imagen para compartir y banner del README desde `plantillas/` (tamaños en
  `plantillas/ICONOS.md`).
- Textos: tono del apartado 20 (tú, frases cortas, verbos en los botones, sin exclamaciones).
- Pega el bloque de `PROMPT-MARCA.md` en el `CLAUDE.md` del proyecto (créalo si no existe) para que las
  siguientes sesiones lo respeten solas.

Lo que Joaquín ya rechazó y no debe aparecer (apartado 21): punto de color al final de los títulos, franjas
encima de las tarjetas, figuras 3D decorativas, metal líquido, sombras grises bajo tarjetas planas, bordes de
color a un lado, texto directamente sobre la nebulosa, coral como texto pequeño sobre fondo claro, emojis como
iconos. Tampoco se nombra al compañero que sirvió de referencia.

## 5. Comprobar antes de decir que está

- La app en marcha, en **claro y oscuro**, en **escritorio y móvil**: capturas del antes y el después de cada
  pantalla clave para enseñárselas.
- Con **«reducir movimiento» activado** (su Windows lo tiene activado): la nebulosa tiene que verse quieta, no en
  blanco, y la franja aparecer colocada. Para enseñarle el movimiento, fuerza `movimiento: "si"`.
- Contraste según la tabla del apartado 3 de la guía.
- Si es PWA, que el icono, el `theme-color` y la caché nueva se ven tras recargar (o reinstalar la app).
- Ningún color ni tipografía de la marca escrito a mano fuera de los tokens (busca los hex y los nombres de letra).
- Build, lint y tests del proyecto en verde.
- Repasa el apartado 22 y di qué puntos se cumplen y cuáles no.

## 6. Cerrar

Commits según las normas del proyecto (Conventional Commits si no dice otra cosa) y **sin push** hasta que
Joaquín lo diga. Resume en pocas líneas qué ha cambiado, con las capturas, qué versión de la marca usa el
proyecto y qué queda pendiente (por ejemplo, logos que aún no existen o Compose por compilar).

Si algo de la marca no encaja en el proyecto o falta una pieza, no te lo inventes en el proyecto: díselo a
Joaquín, porque el cambio tiene que ir al repo de marca y salir en una versión nueva.
