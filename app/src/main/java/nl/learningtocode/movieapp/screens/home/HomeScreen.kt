package nl.learningtocode.movieapp.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import nl.learningtocode.movieapp.model.Movie
import nl.learningtocode.movieapp.model.getMovies
import nl.learningtocode.movieapp.navigation.MovieScreens
import nl.learningtocode.movieapp.widgets.MovieRow

@Composable
fun HomeScreen(navController: NavController){
        Scaffold(topBar = {
            TopAppBar(backgroundColor = Color.Blue,
                elevation = 5.dp) {
                Text(text = "Marvel Movies")

                }
            }) {
            MainContent(navController = navController)
        }
}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<Movie> = getMovies(
//    "The Wolverine",
//    "Spiderman",
//    "Deadpool",
//    "Superman",
//    "The Flash",
//    "The Green Lantern",
//    "The Green Arrow",
//    "Captain Marvel",
//    "Iron Man",
//    "Caption America",
//    "The Incredible Hulk",
//    "Venom",
//    "Thor",
//    "Doctor Strange",
//    "Black Widow",
//    "The Black Panther",
//    "Ant-Man"
)) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(movie = it) { movie ->

                    Log.d("TAG", "MainContent: $movie")

                    navController.navigate(route = MovieScreens.DetailScreen.name + "/$movie")
                }
            }
        }
    }
}
