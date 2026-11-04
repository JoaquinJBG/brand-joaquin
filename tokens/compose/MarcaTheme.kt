// Marca personal de Joaquín Beltrán · tema para Jetpack Compose (Material 3)
// Punto de partida: copia este archivo al módulo de UI y cambia el package.
// Fuentes: res/values/font_certs.xml del ejemplo oficial de "Downloadable Fonts"
// y la dependencia androidx.compose.ui:ui-text-google-fonts.
package es.joaquinbeltran.marca

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

object Jb {
    val Niebla = Color(0xFFE7EEF2)
    val Hielo = Color(0xFFCCDBE2)
    val Acero = Color(0xFF738A9A)
    val Pizarra = Color(0xFF435565)
    val Salvia = Color(0xFF697773)
    val Tinta = Color(0xFF161D24)
    val Noche = Color(0xFF121820)
    val Coral = Color(0xFFF97279)
    val Cobalto = Color(0xFF2A72A3)
    val CobaltoTexto = Color(0xFF23648F)
    val CobaltoClaro = Color(0xFF7FB4DA)
    val SuperficieClara = Color(0xFFF4F8FA)
    val SuperficieOscura = Color(0xFF1A222C)
    val SuperficieOscura2 = Color(0xFF243040)
}

// En Material 3 "primary" pinta los botones principales. En esta marca el botón principal
// es tinta (o niebla en oscuro); el coral es la franja y el botón de acento (secondary).
private val Claro = lightColorScheme(
    primary = Jb.Tinta,
    onPrimary = Jb.Niebla,
    secondary = Jb.Coral,
    onSecondary = Jb.Tinta,
    tertiary = Jb.CobaltoTexto,
    onTertiary = Jb.Niebla,
    background = Jb.Niebla,
    onBackground = Jb.Tinta,
    surface = Jb.SuperficieClara,
    onSurface = Jb.Tinta,
    surfaceVariant = Jb.Hielo,
    onSurfaceVariant = Jb.Pizarra,
    outline = Jb.Acero,
    outlineVariant = Jb.Hielo,
)

private val Oscuro = darkColorScheme(
    primary = Jb.Niebla,
    onPrimary = Jb.Tinta,
    secondary = Jb.Coral,
    onSecondary = Jb.Tinta,
    tertiary = Jb.CobaltoClaro,
    onTertiary = Jb.Tinta,
    background = Jb.Noche,
    onBackground = Jb.Niebla,
    surface = Jb.SuperficieOscura,
    onSurface = Jb.Niebla,
    surfaceVariant = Jb.SuperficieOscura2,
    onSurfaceVariant = Color(0xFF9DB0BD),
    outline = Jb.Acero,
    outlineVariant = Jb.SuperficieOscura2,
)

private val proveedor = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs,
)

val Bricolage = FontFamily(
    Font(GoogleFont("Bricolage Grotesque"), proveedor, FontWeight.ExtraBold),
    Font(GoogleFont("Bricolage Grotesque"), proveedor, FontWeight.Bold),
)
val Geist = FontFamily(
    Font(GoogleFont("Geist"), proveedor, FontWeight.Normal),
    Font(GoogleFont("Geist"), proveedor, FontWeight.Medium),
    Font(GoogleFont("Geist"), proveedor, FontWeight.SemiBold),
)

private fun titulo(size: Int, lineHeight: Float) = TextStyle(
    fontFamily = Bricolage,
    fontWeight = FontWeight.ExtraBold,
    fontSize = size.sp,
    lineHeight = (size * lineHeight).sp,
    letterSpacing = (-0.045).em,
)

val TipografiaJb = Typography(
    displayLarge = titulo(72, 0.9f),
    displayMedium = titulo(56, 0.9f),
    displaySmall = titulo(44, 0.92f),
    headlineLarge = titulo(34, 0.95f),
    headlineMedium = titulo(28, 1f),
    headlineSmall = titulo(24, 1f).copy(letterSpacing = (-0.03).em),
    titleLarge = TextStyle(fontFamily = Geist, fontWeight = FontWeight.SemiBold, fontSize = 20.sp, lineHeight = 28.sp),
    titleMedium = TextStyle(fontFamily = Geist, fontWeight = FontWeight.Medium, fontSize = 16.sp, lineHeight = 24.sp),
    bodyLarge = TextStyle(fontFamily = Geist, fontSize = 18.sp, lineHeight = 28.sp),
    bodyMedium = TextStyle(fontFamily = Geist, fontSize = 16.sp, lineHeight = 26.sp),
    bodySmall = TextStyle(fontFamily = Geist, fontSize = 14.sp, lineHeight = 22.sp),
    labelLarge = TextStyle(fontFamily = Geist, fontWeight = FontWeight.Medium, fontSize = 15.sp, lineHeight = 20.sp),
    labelMedium = TextStyle(fontFamily = Geist, fontWeight = FontWeight.Medium, fontSize = 13.sp, lineHeight = 18.sp),
    labelSmall = TextStyle(fontFamily = Geist, fontSize = 12.sp, lineHeight = 16.sp),
)

// Botones y chips usan "full" (cápsula); tarjetas "large" (28 dp).
val FormasJb = Shapes(
    extraSmall = RoundedCornerShape(12.dp),
    small = RoundedCornerShape(16.dp),
    medium = RoundedCornerShape(28.dp),
    large = RoundedCornerShape(28.dp),
    extraLarge = RoundedCornerShape(percent = 50),
)

@Immutable
data class EspaciosJb(
    val s1: Int = 4, val s2: Int = 8, val s3: Int = 12, val s4: Int = 16,
    val s5: Int = 24, val s6: Int = 32, val s7: Int = 48, val s8: Int = 64,
)

@Immutable
data class FranjaJb(
    val ancho: Float = 0.6f,
    val arriba: Float = 0.46f,
    val alto: Float = 0.30f,
    val rayasAncho: Float = 0.22f,
    val raya: Int = 7,
    val color: Color = Jb.Coral,
    val logoFuera: Color = Jb.Acero,
    val logoDentro: Color = Jb.Tinta,
)

val LocalEspaciosJb = staticCompositionLocalOf { EspaciosJb() }
val LocalFranjaJb = staticCompositionLocalOf { FranjaJb() }

@Composable
fun MarcaTheme(oscuro: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (oscuro) Oscuro else Claro,
        typography = TipografiaJb,
        shapes = FormasJb,
        content = content,
    )
}
