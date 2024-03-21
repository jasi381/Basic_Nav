package com.jasmeet.basicnav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun AboutScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Cyan)
    ){
        Text(text = "About Screen", color = Color.White,modifier = Modifier.fillMaxSize().align(Alignment.CenterHorizontally))
    }

}