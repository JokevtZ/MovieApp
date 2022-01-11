package nl.learningtocode.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import nl.learningtocode.movieapp.screens.home.HomeScreen


@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =  MovieScreens.HomeScreen.name ) {
        composable(MovieScreens.HomeScreen.name){
            // The direction where to go to.
            HomeScreen(navController = navController)

        }
    }
}