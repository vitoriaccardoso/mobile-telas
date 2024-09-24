package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telainicio.R

@Composable
fun TelaGrupoMentoria(controleDeNavegacao: NavHostController? = null) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(horizontal = 20.dp)
            .background(Color.White)
    ) {
        // Título
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .height(50.dp)
                .width(200.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF302F2F),
                text = "Grupo de mentoria",
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 20.dp)
            )
        }

        Spacer(modifier = Modifier.height(50.dp))
        // Row com o card quadrado e descrição
        Row(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
                Column(
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(130.dp)
                        .background(Color(0xFFFEE101), shape = RoundedCornerShape(10.dp)), // Mudando a cor para vermelho
                ) {
                    Image(
                        modifier = Modifier
                            .size(80.dp),
                        painter = painterResource(id = R.drawable.usuario),
                        contentDescription = "Mascote"
                    )
                    Text(
                        text = "membros 18/30",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold) // Mudando a cor do texto para branco
                }
            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Descrição")
                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .background(Color.LightGray)
                ){

                }
            }
        }
        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaGrupoMentoriaPreview() {
    TelaGrupoMentoria()
}
