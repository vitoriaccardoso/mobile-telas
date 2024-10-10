package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R

@Composable
fun TelaRankeamento(modifier: Modifier = Modifier) {
    Column {
       Row{
           Text(
               text = "Ranking",
               fontSize = 20.sp,
               modifier = Modifier
                   .weight(0.2f),
               textAlign = TextAlign.Center
               )

           Image(
               painter = painterResource(R.drawable.duvida),
               contentDescription = "divida",
               modifier = Modifier
                   .size(30.dp)
           )
       }
        Column {
            Text(text = "")
            Box(){

            }
            Image(
                painter = painterResource(R.drawable.trofeu),
                contentDescription = "trofeu",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun TelaRankeamentopreview() {
    TelaRankeamento()
}