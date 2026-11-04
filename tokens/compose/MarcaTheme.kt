// Requiere androidx.compose.ui:ui-text-google-fonts y res/values/font_certs.xml del ejemplo oficial "Downloadable Fonts".
package es.joaquinbeltran.marca

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
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
    val Abismo = Color(0xFF0A0E13)
    val Coral = Color(0xFFF97279)
    val CoralTexto = Color(0xFFB83A44)
    val Cobalto = Color(0xFF2A72A3)
    val CobaltoTexto = Color(0xFF23648F)
    val CobaltoClaro = Color(0xFF7FB4DA)
    val SuperficieClara = Color(0xFFF4F8FA)
    val Error = Color(0xFFC8323F)
    val SuperficieOscura = Color(0xFF161D26)
    val SuperficieOscura2 = Color(0xFF212B38)
}

// primary = coral: el botón principal de la marca es coral con brillo (ver brilloCoral en Luz.kt).
private val Claro = lightColorScheme(
    primary = Jb.Coral,
    onPrimary = Jb.Tinta,
    secondary = Jb.Tinta,
    onSecondary = Jb.Niebla,
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
    error = Color(0xFFB42B37),
    onError = Color.White,
)

private val Oscuro = darkColorScheme(
    primary = Jb.Coral,
    onPrimary = Jb.Tinta,
    secondary = Jb.Niebla,
    onSecondary = Jb.Tinta,
    tertiary = Jb.CobaltoClaro,
    onTertiary = Jb.Tinta,
    background = Jb.Abismo,
    onBackground = Jb.Niebla,
    surface = Jb.SuperficieOscura,
    onSurface = Jb.Niebla,
    surfaceVariant = Jb.SuperficieOscura2,
    onSurfaceVariant = Color(0xFF9DB0BD),
    outline = Jb.Acero,
    outlineVariant = Jb.SuperficieOscura2,
    error = Color(0xFFFF5A6A),
    onError = Jb.Tinta,
)

// Estados y series de gráficas: Material solo trae «error», así que el resto va aparte.
@Immutable
data class ColoresJb(
    val exito: Color, val exitoTexto: Color,
    val aviso: Color, val avisoTexto: Color,
    val error: Color, val errorTexto: Color,
    val info: Color, val infoTexto: Color,
    val series: List<Color>,
)

val ColoresClaro = ColoresJb(
    exito = Color(0xFF1E9E6A), exitoTexto = Color(0xFF0B7550),
    aviso = Color(0xFFE2A21B), avisoTexto = Color(0xFF8A5A00),
    error = Jb.Error, errorTexto = Color(0xFFB42B37),
    info = Jb.Cobalto, infoTexto = Jb.CobaltoTexto,
    series = listOf(Color(0xFF2A72A3), Color(0xFFF97279), Color(0xFF7465D8), Color(0xFF0A9C86), Color(0xFFC9962B)),
)

val ColoresOscuro = ColoresJb(
    exito = Color(0xFF1E9E6A), exitoTexto = Color(0xFF3FCB8E),
    aviso = Color(0xFFE2A21B), avisoTexto = Color(0xFFF2BC4A),
    error = Jb.Error, errorTexto = Color(0xFFFF5A6A),
    info = Jb.CobaltoClaro, infoTexto = Jb.CobaltoClaro,
    series = listOf(Color(0xFF3F8AC4), Color(0xFFEA5F69), Color(0xFF8578E2), Color(0xFF149A85), Color(0xFFB98A2C)),
)

val LocalColoresJb = staticCompositionLocalOf { ColoresClaro }

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

// extraLarge es la cápsula de botones y chips; las tarjetas usan large.
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
    val corte: Int = 4,
    val corteSobra: Float = 0.14f,
    val color: Color = Jb.Coral,
    val logoFuera: Color = Jb.Acero,
    val logoDentro: Color = Jb.Tinta,
)

val LocalEspaciosJb = staticCompositionLocalOf { EspaciosJb() }
val LocalFranjaJb = staticCompositionLocalOf { FranjaJb() }

@Composable
fun MarcaTheme(oscuro: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalColoresJb provides if (oscuro) ColoresOscuro else ColoresClaro) {
        MaterialTheme(
            colorScheme = if (oscuro) Oscuro else Claro,
            typography = TipografiaJb,
            shapes = FormasJb,
            content = content,
        )
    }
}
