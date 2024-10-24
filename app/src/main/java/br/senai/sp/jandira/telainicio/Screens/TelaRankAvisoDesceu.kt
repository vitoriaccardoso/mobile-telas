package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun RankDesceu(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource(R.drawable.calabresobravo),
            contentDescription = "calabreso triste",
            modifier = Modifier
                .size(130.dp)
        )

        Box(modifier = Modifier
            .height(11.dp)
            .width(200.dp)
            .background(color = (Color(0xFFFCDA572))),
        ){

        }

        Spacer(modifier = Modifier.size(50.dp))

        Text(
            text = "Que pena !!!",
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(){
            Image(painter = painterResource(R.drawable.bronzei),
                contentDescription = "calabreso triste",
                modifier = Modifier
                    .size(100.dp)
            )
        }



        Box(modifier = Modifier.width(192.dp)
        ){
            Text(
                text = "Você caiu para o rank bronze I",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
                textAlign = TextAlign.Center

            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { /* Ação a ser executada ao clicar no botão */ },
            modifier = Modifier
                .width(172.dp)
                .height(41.dp),
            colors = ButtonDefaults.buttonColors( containerColor =  Color(0xFFFFFD700))
        ){
            Text("Voltar")
        }
        Spacer(modifier = Modifier.height(100.dp))

        Box(modifier = Modifier
            .height(11.dp)
            .width(200.dp)
            .background(color = (Color(0xFFFCDA572))),
        ){

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun RankDesceuPreview() {
    RankDesceu()
}