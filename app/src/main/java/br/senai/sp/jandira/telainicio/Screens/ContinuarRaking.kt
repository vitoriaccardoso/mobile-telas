package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R

@Composable
fun continuacaoRanking(modifier: Modifier = Modifier) {

    Column{

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

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "Mentores que mais ajudam",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(25.dp))

            Box(
                modifier = Modifier
                    .height(320.dp)
                    .width(300.dp)
                    .border(BorderStroke(1.dp, Color.Gray))
            ){
                Column {

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.primeirolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.segundolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Image(
                                painter = painterResource(R.drawable.terceirolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#4",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#5",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(45.dp)
                            .border(BorderStroke(1.dp, Color.Gray))
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                            ) {
                            Image(painter = painterResource(id = R.drawable.anteriorduplo),
                                contentDescription = "anterior duplo",
                                modifier = Modifier
                                    .size(25.dp)
                            )

                            Image(painter = painterResource(id = R.drawable.anterior),
                                contentDescription = "anterior",
                                modifier = Modifier
                                    .size(25.dp)
                            )
                            Text(text = "1/100")

                            Image(painter = painterResource(id = R.drawable.proximo),
                                contentDescription = "proximo",
                                modifier = Modifier
                                    .size(25.dp)
                            )

                            Image(painter = painterResource(id = R.drawable.proximoduplo),
                                contentDescription = "proximoduplo",
                                modifier = Modifier
                                    .size(25.dp)
                            )
                        }


                    }

                }
            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = "Mentores com melhores avaliações",
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp
            )

             Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .height(320.dp)
                    .width(300.dp)
                    .border(BorderStroke(1.dp, Color.Gray))
            ){
                Column {

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.primeirolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "4,5",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.segundolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "4,2",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Image(
                                painter = painterResource(R.drawable.terceirolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "4,1",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#4",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "3",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#5",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "1",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(45.dp)
                            .border(BorderStroke(1.dp, Color.Gray))
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(painter = painterResource(id = R.drawable.anteriorduplo),
                                contentDescription = "anterior duplo",
                                modifier = Modifier
                                    .size(25.dp)
                            )

                            Image(painter = painterResource(id = R.drawable.anterior),
                                contentDescription = "anterior",
                                modifier = Modifier
                                    .size(25.dp)
                            )
                            Text(text = "1/100")

                            Image(painter = painterResource(id = R.drawable.proximo),
                                contentDescription = "proximo",
                                modifier = Modifier
                                    .size(25.dp)
                            )

                            Image(painter = painterResource(id = R.drawable.proximoduplo),
                                contentDescription = "proximoduplo",
                                modifier = Modifier
                                    .size(25.dp)
                            )
                        }


                    }

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun continuacaoRankingPreview() {
    continuacaoRanking()
}