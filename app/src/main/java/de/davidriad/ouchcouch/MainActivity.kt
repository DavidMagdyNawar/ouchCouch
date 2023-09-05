package de.davidriad.ouchcouch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import de.davidriad.ouchcouch.composables.BottomNavigationBar
import de.davidriad.ouchcouch.composables.MainScreen
import de.davidriad.ouchcouch.composables.Navigation
import de.davidriad.ouchcouch.composables.NavigationItem
import de.davidriad.ouchcouch.composables.TopBar
import de.davidriad.ouchcouch.composables.screen.FavouritesScreen
import de.davidriad.ouchcouch.composables.screen.HomeScreen
import de.davidriad.ouchcouch.composables.screen.ProfileScreen
import de.davidriad.ouchcouch.composables.screen.SearchScreen
import de.davidriad.ouchcouch.composables.screen.SettingsScreen
import de.davidriad.ouchcouch.ui.theme.OuchCouchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}






