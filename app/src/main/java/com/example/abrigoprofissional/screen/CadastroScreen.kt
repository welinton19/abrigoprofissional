package com.example.abrigoprofissional.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CadastroScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF10C7E8))
    )
    Text(
        text = "CADASTRE-SE",
        modifier = Modifier.padding(top = 150.dp, start = 95.dp),
        color = Color.White, fontSize = 35.sp

    )
    Column(modifier = Modifier.padding(top = 290.dp, start = 45.dp)) {
        TextField(modifier = Modifier.padding(24.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text="Nome Completo")
            },
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 20.dp,
                bottomStart = 20.dp,
                bottomEnd = 20.dp
            )
        )
        TextField(modifier = Modifier.padding(24.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text="Data de Nascimento")
            },
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 20.dp,
                bottomStart = 20.dp,
                bottomEnd = 20.dp
            )
        )
//        TextField(modifier = Modifier.padding(24.dp),
//            value = "",
//            onValueChange = {},
//            placeholder = {
//                Text(text="Senha")
//            },
//            shape = RoundedCornerShape(
//                topStart = 20.dp,
//                topEnd = 20.dp,
//                bottomStart = 20.dp,
//                bottomEnd = 20.dp
//            )
//        )
//        TextField(modifier = Modifier.padding(24.dp),
//            value = "",
//            onValueChange = {},
//            placeholder = {
//                Text(text="Confirma Senha")
//            },
//            shape = RoundedCornerShape(
//                topStart = 20.dp,
//                topEnd = 20.dp,
//                bottomStart = 20.dp,
//                bottomEnd = 20.dp
//            )
//        )

    }

    CardCadastro(modifier = Modifier.padding(top = 520.dp))
}

@Composable
fun CardCadastro(modifier: Modifier = Modifier) {
    Card(modifier = modifier
        .size(width = 471.dp, height = 455.dp)
        .padding(start = 20.dp, end = 20.dp),

        shape = RoundedCornerShape(topStart = 40.dp,
            topEnd = 40.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF467789)
        )
    ) {

    }
    Column(modifier = Modifier.padding(top = 535.dp, start = 45.dp)) {
        TextField(modifier = Modifier.padding(24.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text="Senha")
            },
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 20.dp,
                bottomStart = 20.dp,
                bottomEnd = 20.dp
            )
        )
        TextField(modifier = Modifier.padding(24.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text="Confirma Senha")
            },
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 20.dp,
                bottomStart = 20.dp,
                bottomEnd = 20.dp
            )
        )

    }
    Row() {
        Text(
            text = "Concordo com os termos ",
            modifier = Modifier.padding(top = 750.dp, start = 105.dp),
            color = Color.Black, fontSize = 15.sp
        )


    }
    Button(modifier = Modifier.padding(top = 790.dp, start = 85.dp)
        .size(width = 236.dp, height = 46.dp),
        onClick = {},
        colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF), contentColor = Color(0xFF000000)),
        shape = RoundedCornerShape(topEnd = 8.dp,
            topStart = 8.dp,
            bottomStart = 8.dp,
            bottomEnd = 8.dp)
        ) {
        Text(text="CONTINUAR", modifier = Modifier)

    }

}

@Preview
@Composable
private fun CadrCadastropreview() {
    CardCadastro()
}

@Preview
@Composable
private fun CadastroScreenPreview() {
    CadastroScreen()
}