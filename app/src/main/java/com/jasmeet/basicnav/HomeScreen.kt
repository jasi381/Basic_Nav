package com.jasmeet.basicnav

import android.net.wifi.hotspot2.pps.HomeSp
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(navController: NavHostController) {

    LaunchedEffect(Unit) {
        delay(5000)
    }
    DisposableEffect(Unit) {
        onDispose {

        }
    }
    SideEffect {

    }


//    BackHandler {
//
//    }

//    Scaffold() {
//
//    }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
            .navigationBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Home Screen", color = Color.Black,modifier = Modifier
            .align(
                Alignment.CenterHorizontally
            ))
        Button(onClick = {
            navController.navigate("about")
        }) {
            Text(text = "Navigate to about screen")
        }
    }
}

@Composable
fun HomeSpeScreen2(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
            .navigationBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Home Screen", color = Color.Black,modifier = Modifier
            .align(
                Alignment.CenterHorizontally
            ))
        Button(onClick = {
            navController.navigate("about")
        }) {
            Text(text = "Navigate to about screen")
        }
    }

}

@Composable
fun HomeSpeScreen4(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
            .navigationBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Home Screen", color = Color.Black,modifier = Modifier
            .align(
                Alignment.CenterHorizontally
            ))
        Button(onClick = {
            navController.navigate("about")
        }) {
            Text(text = "Navigate to about screen")
        }
    }

}

@Composable
fun HomeSpeScreen3(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
            .navigationBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Home Screen", color = Color.Black,modifier = Modifier
            .align(
                Alignment.CenterHorizontally
            ))
        Button(onClick = {
            navController.navigate("about")
        }) {
            Text(text = "Navigate to about screen")
        }
    }

}

