package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.model.Mensagem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaChatConversa(modifier: Modifier = Modifier) {
    // Lista de mensagens que será exibida
    val mensagens = remember { mutableStateListOf<Mensagem>() }
    var textoMensagem by remember { mutableStateOf("") } // Estado para o campo de texto

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xff302F2F))
    ) {
        // Cabeçalho
        Column(
            modifier = Modifier
                .height(60.dp)
                .background(color = Color(0xff302F2F))
                .fillMaxWidth() // Preenche a largura da tela
        ) {
            Text(
                text = "ChatIA",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 20.dp),
                fontSize = 20.sp,
                color = Color.White
            )
        }

        Row (
            modifier = Modifier
                .height(60.dp)
            .width(350.dp)) {
            Row(
                modifier = Modifier
                    .offset(y = 20.dp)
                    .padding(start = 30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.calabreso2),
                    contentDescription = "calabreso", modifier = Modifier
                        .size(60.dp) // Tamanho da imagem
                        .clip(CircleShape) // Faz a imagem ser circular
                        .background(Color(0xffE9CE03)) // Fundo para a imagem
                        .padding(4.dp)
                )

                Text(
                    text = "Olá, sou a assistende virtual do StudyFy, no que posso ajudar? ",
                    modifier = Modifier.padding(8.dp), fontSize = 15.sp, color = Color.White
                )
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
            .background(Color.White, shape = RoundedCornerShape(50.dp))
            .height(60.dp)
            .width(200.dp)
            .padding(end = 100.dp)
        )
        Text(text = "Você vai dominar o mundo?")



    }

    }












@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaChatConversaPreview() {
    TelaChatConversa()
}
