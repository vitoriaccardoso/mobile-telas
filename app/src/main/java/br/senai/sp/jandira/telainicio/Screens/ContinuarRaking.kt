package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun continuacaoRanking(modifier: Modifier = Modifier) {

    Column {
        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Rank de mentores",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Box(
                modifier = Modifier
                    .height(11.dp)
                    .width(200.dp)
                    .background(Color(0xFFFE9CE03))
                    .clip(RoundedCornerShape(10.dp))

            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun continuacaoRankingPreview() {
    continuacaoRanking()
}