package de.davidriad.ouchcouch.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import de.davidriad.ouchcouch.R

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { },
        bottomBar = { BottomNavigationBar(navController) },
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                Navigation(navController = navController)
            }
        },
        backgroundColor = colorResource(R.color.teal_700) // Set background color to avoid the white flashing when you switch between screens
    )
}
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}

