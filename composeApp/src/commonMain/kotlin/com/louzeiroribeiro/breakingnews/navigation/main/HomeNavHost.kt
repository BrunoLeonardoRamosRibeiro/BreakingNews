package com.louzeiroribeiro.breakingnews.navigation.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.louzeiroribeiro.breakingnews.features.about.AboutScreen
import com.louzeiroribeiro.breakingnews.features.home.HomeScreen
import com.louzeiroribeiro.breakingnews.navigation.routes.HomeRoutes

@Composable
fun HomeNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {

    NavHost(
        navController = navHostController,
        startDestination = HomeRoutes.Home,
        modifier = modifier
    ) {
        composable<HomeRoutes.About> {
            AboutScreen(
                onBackPressed = {
                    navHostController.popBackStack()
                }
            )
        }

        composable<HomeRoutes.Home> {
            HomeScreen(
                navigateToAboutScreen = {
                    navHostController.navigate(HomeRoutes.About)
                }
            )
        }
    }
}