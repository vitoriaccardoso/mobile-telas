package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
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
                    .drawBehind {
                        // Configurações da sombra
                        val shadowColor = Color(0xFFE9CE03) // Cor da sombra sólida
                        val offsetY = 15f // Deslocamento no eixo Y
                        val cornerRadius = 20f // Raio dos cantos arredondados

                        // Desenha a sombra sólida com cantos arredondados
                        drawRoundRect(
                            color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                            topLeft = Offset(0f, offsetY), // Define o deslocamento da sombra
                            size = Size(
                                size.width,
                                size.height
                            ), // Tamanho da sombra igual ao da Column
                            cornerRadius = CornerRadius(
                                cornerRadius,
                                cornerRadius
                            ) // Define os cantos arredondados
                        )
                    }
                    .border(
                        width = 1.dp, // Largura da borda
                        color = Color(0xFFE9CE03), // Cor da borda
                        shape = RoundedCornerShape(10.dp) // O mesmo shape para a borda
                    )
                    .fillMaxHeight()
                    .width(130.dp)
                    .background(Color(0xFFFEE101), shape = RoundedCornerShape(10.dp))
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
                    fontWeight = FontWeight.Bold
                ) // Mudando a cor do texto para branco
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Descrição",
                    fontWeight = FontWeight.Bold
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xFFD9D9D9) // Cor da sombra sólida
                            val offsetY = 15f // Deslocamento no eixo Y
                            val cornerRadius = 20f // Raio dos cantos arredondados

                            // Desenha a sombra sólida com cantos arredondados
                            drawRoundRect(
                                color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                topLeft = Offset(0f, offsetY), // Define o deslocamento da sombra
                                size = Size(
                                    size.width,
                                    size.height
                                ), // Tamanho da sombra igual ao da Column
                                cornerRadius = CornerRadius(
                                    cornerRadius,
                                    cornerRadius
                                ) // Define os cantos arredondados
                            )
                        }
                        .height(120.dp)
                        .background(Color.White)
                        .border(
                            1.dp,
                            color = Color(0xFFD9D9D9),
                            shape = RoundedCornerShape(5.dp)
                        )

                ) {
                    Text(
                        "        wsdsd sds dewfefnj fnierf uhfhef efeufhuefe \nfheufh  sjds hsdhsjd \njhjfsjf sfhsjhfj h jshf jsh djs\n jh sh jhshd jshdjsh d ",
                        fontSize = 16.sp,
                    )
                }

            }
        }

        Row(
            modifier = Modifier
                .align(alignment = Alignment.Start)
                .padding(top = 30.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconementoria),
                contentDescription = "Mentor Image",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Mentor do grupo", fontWeight = FontWeight.Bold, fontSize = 15.sp)
        }
        Spacer(modifier = Modifier.height(10.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween

        ) {


        }
        Column(
            modifier = Modifier
                .background(Color.Red)
                .height(60.dp).width(400.dp)

        ) {
            Row {
                Box(modifier = Modifier.size(60.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.usuario),
                        contentDescription = "usuario",
                        modifier = Modifier.size(60.dp).padding(start = 15.dp).width(20.dp)
                    )
                }
                Box(){
                    Text(text = "Nome do mentor")
                    Text(text = ("20 pessoas"))
                }
                Box(){

                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly // Espaça as colunas igualmente
        ) {
            // Primeira Column
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .height(46.dp)
                    .width(100.dp),
                contentAlignment = Alignment.Center // Centraliza o conteúdo no Box
            ) {
                Text(text = "Atividades")
            }

            // Segunda Column
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .height(46.dp)
                    .width(100.dp),
                contentAlignment = Alignment.Center // Centraliza o conteúdo no Box
            ) {
                Text(text = "Atividades")
            }

            // Terceira Column
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .height(46.dp)
                    .width(100.dp),
                contentAlignment = Alignment.Center // Centraliza o conteúdo no Box
            ) {
                Text(text = "Atividades")
            }
        }


    }



    }




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaGrupoMentoriaPreview() {
    TelaGrupoMentoria()
}
