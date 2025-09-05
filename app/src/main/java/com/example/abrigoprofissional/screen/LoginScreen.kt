package com.example.abrigoprofissional.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Icon

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.abrigoprofissional.R


@Composable
fun LoginScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF10C7E8))
    ){
        CardLogin()
        SecaoLogin(modifier = Modifier.align(Alignment.BottomCenter))

    }
}

@Composable
fun CardLogin() {
    Card(modifier = Modifier
        .size(width = 400.dp, height = 595.dp)
        .padding(start = 20.dp, end = 20.dp),

        shape = RoundedCornerShape(bottomStart = 70.dp,
            bottomEnd = 70.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF467789)
        )
    ) {

    }
}

@Composable
fun SecaoLogin(modifier: Modifier = Modifier) {
    Card (
        modifier = modifier
            .size(width = 316.dp,
            height = 467.dp),
        shape = RoundedCornerShape(topStart = 31.dp,
            topEnd = 31.dp,
            bottomStart = 31.dp,
            bottomEnd = 31.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ){
        Column(modifier = Modifier.padding(24.dp)) {
            TextField(modifier = Modifier.padding(20.dp),
                value = "",
                onValueChange = {},
                label = {
                    Text(text="Digite seu E-mail")
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.user_18),
                        contentDescription = "Icone De Usuario"
                    )
                },

                shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                    bottomStart = 20.dp,
                    bottomEnd = 20.dp
                )
            )
            TextField(modifier = Modifier.padding(20.dp),
                value = "",
                onValueChange = {},
                label = {
                    Text(text="Digite sua senha")
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.lock),
                        contentDescription = "Icone De Cadeado"
                    )
                },
                shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                    bottomStart = 20.dp,
                    bottomEnd = 20.dp
                )
            )
            Text(text="Esqueci minha senha", modifier = Modifier.padding(start = 25.dp))
            Button(modifier = Modifier
                .padding(top = 34.dp, start = 15.dp)
                .size(width = 293.dp, height = 41.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xFF10C7E8), contentColor = Color(0xFF000000)),
                shape = RoundedCornerShape(topEnd = 8.dp,
                    topStart = 8.dp,
                    bottomStart = 8.dp,
                    bottomEnd = 8.dp)

            ) {
                Text(text="LOGIN", modifier = Modifier)
            }
            Text(text="Não tem uma conta?", modifier = Modifier.padding(start = 25.dp, top = 10.dp))
            Text(text="-------------OU------------", modifier = Modifier.padding(start = 70.dp, top = 25.dp))
            Row (horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                .padding(start = 110.dp, top = 25.dp)
                .size(width = 43.dp, height = 43.dp)


            ){
                Icon(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Iconde do Goggle",

                )
                Icon(
                    painter = painterResource(id = R.drawable.linkedin),
                    contentDescription = "Iconde do Linkedin",

                    )
            }
        }
    }
}

@Preview
@Composable
private fun SecaoLoginPreview() {
    SecaoLogin()
    
}

@Preview
@Composable
private fun CardLoginPreview() {

    CardLogin()
}

@Preview
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}