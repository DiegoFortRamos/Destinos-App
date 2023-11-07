package com.ramos.diego.destinos.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramos.diego.destinos.sampleDestinoAfrica
import com.ramos.diego.destinos.sampleDestinoEuropa
import com.ramos.diego.destinos.samplePromocoes
import com.ramos.diego.destinos.ui.components.DestinosSection


@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier)
        DestinosSection(title = "Promoções", samplePromocoes)
        DestinosSection(title = "África", sampleDestinoAfrica)
        DestinosSection(title = "Europa", sampleDestinoEuropa)
        Spacer(modifier = Modifier)
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}