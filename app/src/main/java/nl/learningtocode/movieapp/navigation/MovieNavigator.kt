package nl.learningtocode.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
        // reference example www.google.com/details-screen/id=12,
        // so you have to give the composable a route to navigate to.
         composable(MovieScreens.DetailScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") {type = NavType.StringType}))
         {
         backStackEntry ->
             DetailsScreen(navController = navController, backStackEntry.arguments?.getString("movie"))
         }
    }
}

