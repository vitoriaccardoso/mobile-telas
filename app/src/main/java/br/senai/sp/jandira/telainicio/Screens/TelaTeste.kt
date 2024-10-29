package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Composable
fun TelaTeste(modifier: Modifier = Modifier) {
    var isScreenVisible by remember { mutableStateOf(false) }

    // Variável que rastreia o deslocamento vertical para o arraste
    var offsetY by remember { mutableStateOf(0f) }

    // Pega a altura total da tela
    val configuration = LocalConfiguration.current
    val screenHeightPx = configuration.screenHeightDp.dp

    // Define a altura da tela deslizante como 90% da tela
    val slidingScreenHeight by animateDpAsState(targetValue = if (isScreenVisible) screenHeightPx * 0.9f else 0.dp)

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        // Tela de fundo (parte cinza)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
        )

        // Botão que abre a tela deslizante
        Button(
            onClick = {
                isScreenVisible = true
                offsetY = 0f  // Resetar o offset ao reabrir a tela
            },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("Abrir")
        }

        // Tela deslizante com arraste
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(slidingScreenHeight)  // Usando altura animada com 90% da tela
                .offset { IntOffset(x = 0, y = offsetY.roundToInt()) }
                .align(Alignment.BottomCenter)
                .background(Color.White, RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .draggable(
                    orientation = Orientation.Vertical,
                    state = rememberDraggableState { delta ->
                        offsetY = (offsetY + delta).coerceIn(0f, screenHeightPx.value * 0.9f)  // Controla o limite do arrasto
                        if (offsetY == screenHeightPx.value * 0.9f) {
                            isScreenVisible = false
                        }
                    }
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Indicador visual para o usuário arrastar
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(width = 40.dp, height = 4.dp)
                        .background(Color.Gray, RoundedCornerShape(2.dp))
                )


            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun TelaTestePreview() {
    TelaTeste()
}