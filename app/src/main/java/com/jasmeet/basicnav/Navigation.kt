package com.jasmeet.basicnav

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavHost(navController: androidx.navigation.NavHostController) {



    NavHost(navController = navController, startDestination = "home" ) {
        composable(
            "home",
            enterTransition = {
                fadeIn() + slideInHorizontally()
            },
            exitTransition = {
                fadeOut()+ slideOutHorizontally()
            }
        ) {
            HomeScreen(navController = navController)

        }
        composable("about") {
            AboutScreen(navController = navController)

        }


    }

}