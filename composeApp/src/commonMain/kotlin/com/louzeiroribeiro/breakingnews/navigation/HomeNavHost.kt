package com.louzeiroribeiro.breakingnews.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.louzeiroribeiro.breakingnews.features.AboutScreen

@Composable
fun HomeNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
){

    NavHost(
        navController = navHostController,
        startDestination = HomeRoutes.About,
        modifier = modifier
    ) {
        composable<HomeRoutes.About>{
            AboutScreen()
        }
    }
}