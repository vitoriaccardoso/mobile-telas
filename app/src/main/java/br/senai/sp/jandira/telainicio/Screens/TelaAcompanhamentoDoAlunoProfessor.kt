package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun acompanhamentoProfessor(modifier: Modifier = Modifier) {
    Column {
        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Acompanhamento",
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 15.dp)
            )
            Text(
                text = "Insira o código de um aluno para começar a acompanhá-lo",
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraLight,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(40.dp)
            )

            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "entrar",
                            tint = Color(0xff302F2F)
                        )
                    }
                },
                value = "",
                onValueChange = { },
                modifier = Modifier
                    .width(250.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedBorderColor = Color(0xFF666260),
                    unfocusedBorderColor = Color(0xFF666260),
                ),
                placeholder = {
                    Text(
                        text = "XXX-XXX",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                }
            )

        }
        Spacer(modifier = Modifier.height(50.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
            modifier = Modifier
                .height(110.dp)
                .width(302.dp)
                .clip(RoundedCornerShape(16.dp))

                .background(Color.White)

                
        ){
                Image(
                    painter = painterResource(id = R.drawable.usuario),
                    contentDescription = "", modifier = Modifier.padding(top = 30.dp, start = 10.dp).size(50.dp))
            }


            }

        }


       }




@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun acompanhamentoProfessorPreview() {
    acompanhamentoProfessor()
}