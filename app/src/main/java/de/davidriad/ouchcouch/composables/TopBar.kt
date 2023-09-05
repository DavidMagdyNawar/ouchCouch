package de.davidriad.ouchcouch.composables

import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import de.davidriad.ouchcouch.R

@Composable
fun TopBar() {
    TopAppBar(
        title = { },
        backgroundColor = colorResource(id = R.color.teal_200),
        contentColor = Color.White
    )
}
@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}
