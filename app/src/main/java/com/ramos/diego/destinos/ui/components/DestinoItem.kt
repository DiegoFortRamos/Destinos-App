package com.ramos.diego.destinos.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramos.diego.destinos.R
import com.ramos.diego.destinos.model.Destinos


@Composable
fun DestinoItem(destinos: Destinos) {

    Surface(shape = RoundedCornerShape(15.dp), shadowElevation = 4.dp) {
        Column(
            modifier = Modifier
                .height(250.dp)
                .width(280.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(destinos.imagemDestino),
                    contentDescription = null,
                    contentScale = ContentScale.Crop

                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    destinos.tituloDestino, fontWeight = FontWeight(700), fontSize = 18.sp
                )
                Text(
                    destinos.descricaoTitulo,
                    modifier = Modifier.padding(top = 8.dp),
                    textAlign = TextAlign.Center
                )
                Button(
                    onClick = {/*TODO*/ }, modifier = Modifier
                        .width(100.dp)
                        .padding(top = 20.dp)
                ) {
                    Text("Saiba Mais", fontSize = 10.sp)
                }

            }


        }


    }

}

@Preview(showBackground = true)
@Composable
private fun DestinoItemPreview() {
    DestinoItem(
        Destinos(
            tituloDestino = "Rio de Janeiro",
            descricaoTitulo = "Conheça a cidade maravilhosa",
            imagemDestino = R.drawable.ic_launcher_background
        )
    );
}
