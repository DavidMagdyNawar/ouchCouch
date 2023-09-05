package de.davidriad.ouchcouch.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import de.davidriad.ouchcouch.composables.screen.FavouritesScreen
import de.davidriad.ouchcouch.composables.screen.HomeScreen
import de.davidriad.ouchcouch.composables.screen.ProfileScreen
import de.davidriad.ouchcouch.composables.screen.SearchScreen
import de.davidriad.ouchcouch.composables.screen.SettingsScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.screen_route) {
        composable(NavigationItem.Home.screen_route) {
            HomeScreen()
        }
        composable(NavigationItem.Search.screen_route) {
            SearchScreen()
        }
        composable(NavigationItem.Favourite.screen_route) {
            FavouritesScreen()
        }
        composable(NavigationItem.Profile.screen_route) {
            ProfileScreen()
        }
        composable(NavigationItem.Settings.screen_route) {
            SettingsScreen()
        }
    }
}
