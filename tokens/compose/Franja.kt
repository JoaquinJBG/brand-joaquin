package es.joaquinbeltran.marca

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

fun DrawScope.dibujarFranja(f: FranjaJb, blend: BlendMode = BlendMode.SrcOver) {
    val ancho = size.width * f.ancho
    val izquierda = size.width - ancho
    val arriba = size.height * f.arriba
    val alto = size.height * f.alto
    drawRect(f.color, Offset(izquierda, arriba), Size(ancho, alto), blendMode = blend)

    // corte de neón: capas cada vez más anchas y transparentes hacen de halo sin depender de sombras nativas
    val corte = f.corte.dp.toPx()
    val sobra = alto * f.corteSobra
    for ((extra, alfa) in listOf(14.dp.toPx() to .12f, 8.dp.toPx() to .22f, 3.dp.toPx() to .45f, 0f to 1f)) {
        drawRoundRect(
            f.color.copy(alpha = alfa),
            Offset(izquierda - corte - extra, arriba - sobra - extra),
            Size(corte + 2 * extra, alto + 2 * sobra + 2 * extra),
            CornerRadius(corte + extra),
            blendMode = blend,
        )
    }
}

private class FormaFranja(private val f: FranjaJb) : Shape {
    override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density) =
        Outline.Rectangle(
            Rect(size.width * (1 - f.ancho), size.height * f.arriba, size.width, size.height * (f.arriba + f.alto))
        )
}

private val escalaDeGrises = ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })

@Composable
fun FotoConFranja(foto: Painter, descripcion: String?, modifier: Modifier = Modifier, f: FranjaJb = LocalFranjaJb.current) {
    // Offscreen para que el multiply se mezcle solo con la foto y no con lo de detrás.
    Box(modifier.graphicsLayer(compositingStrategy = CompositingStrategy.Offscreen)) {
        Image(foto, descripcion, Modifier.matchParentSize(), contentScale = ContentScale.Crop, colorFilter = escalaDeGrises)
        Canvas(Modifier.matchParentSize()) { dibujarFranja(f, BlendMode.Multiply) }
    }
}

@Composable
fun LogoConFranja(modifier: Modifier = Modifier, f: FranjaJb = LocalFranjaJb.current, logo: @Composable (Color) -> Unit) {
    Box(modifier, contentAlignment = Alignment.Center) {
        logo(f.logoFuera)
        Canvas(Modifier.matchParentSize()) { dibujarFranja(f) }
        Box(Modifier.matchParentSize().clip(FormaFranja(f)), contentAlignment = Alignment.Center) {
            logo(f.logoDentro)
        }
    }
}
