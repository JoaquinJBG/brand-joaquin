package es.joaquinbeltran.marca

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// Brillo coral de botones y números. Las sombras de color solo se ven en Android 9 (API 28) o superior.
fun Modifier.brilloCoral(forma: Shape = RoundedCornerShape(percent = 50), fuerza: Dp = 18.dp) =
    shadow(fuerza, forma, clip = false, ambientColor = Jb.Coral, spotColor = Jb.Coral)

private val bordeDeLuz = Brush.linearGradient(
    0f to Jb.Coral.copy(alpha = .75f),
    .42f to Color.Transparent,
    .6f to Color.Transparent,
    1f to Jb.Cobalto.copy(alpha = .75f),
)

@Composable
fun Cristal(modifier: Modifier = Modifier, oscuro: Boolean, content: @Composable BoxScope.() -> Unit) {
    val forma = RoundedCornerShape(28.dp)
    val fondo = if (oscuro) {
        Brush.verticalGradient(listOf(Color.White.copy(alpha = .08f), Color.White.copy(alpha = .03f)))
    } else {
        Brush.verticalGradient(listOf(Color.White.copy(alpha = .72f), Color.White.copy(alpha = .42f)))
    }
    Box(modifier.background(fondo, forma).border(1.dp, bordeDeLuz, forma), content = content)
}

// La nebulosa animada es WebGL (web). En Android va esta versión quieta con degradados en los laterales.
@Composable
fun FondoNebulosa(oscuro: Boolean, modifier: Modifier = Modifier, content: @Composable BoxScope.() -> Unit) {
    val base = if (oscuro) Jb.Abismo else Jb.Niebla
    val f = if (oscuro) 1f else .7f
    Box(
        modifier.fillMaxSize().drawBehind {
            drawRect(base)
            fun mancha(color: Color, alfa: Float, x: Float, y: Float, radio: Float) {
                val centro = Offset(size.width * x, size.height * y)
                drawCircle(Brush.radialGradient(listOf(color.copy(alpha = alfa * f), Color.Transparent), centro, size.width * radio), size.width * radio, centro)
            }
            mancha(Jb.Cobalto, .45f, 0f, .4f, .8f)
            mancha(Jb.Coral, .30f, .04f, .6f, .6f)
            mancha(Jb.Acero, .45f, 1f, .3f, .8f)
            mancha(Jb.Coral, .30f, .96f, .55f, .6f)
        },
        content = content,
    )
}
