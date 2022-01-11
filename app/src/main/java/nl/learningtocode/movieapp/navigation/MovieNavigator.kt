package nl.learningtocode.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import nl.learningtocode.movieapp.screens.HomeScreen
import nl.learningtocode.movieapp.screens.details.DetailsScreen


@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =  MovieScreens.HomeScreen.name ) {
        composable(MovieScreens.HomeScreen.name){
            // The direction where to navigate to.
            HomeScreen(navController = navController)
        }
         composable(MovieScreens.DetailScreen.name){
             DetailsScreen(navController = navController)
         }
    }
}

