package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun Notificacao(modifier: Modifier = Modifier) {
    Column( modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Notificação",
            fontSize = 20.sp,
            fontFamily = poppinsFontFamily
        )
        Spacer(modifier = Modifier.height(20.dp))


        Box(modifier = Modifier
            .height(27.dp)
            .width(330.dp)
            .background(Color(0xFFFFFE944))
        ){
            Text(text = "Você subiu de rank!",
                fontSize = 15.sp,
                fontFamily = poppinsFontFamily
            )
        }
        Box(modifier = Modifier
            .height(130.dp)
            .width(330.dp)
            .background(Color(0xFFD5D8D8))
        ){
            Row {
                Box(modifier = Modifier
                    .height(50.dp)
                    .width(200.dp)
                    .padding(5.dp)
                ) {

                    Text(text = "Você terminou a temporada com 420pts.",
                        fontSize = 14.sp,
                        fontFamily = poppinsFontFamily
                    )

                }

            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun NotificacaoPreview() {
    Notificacao()
}