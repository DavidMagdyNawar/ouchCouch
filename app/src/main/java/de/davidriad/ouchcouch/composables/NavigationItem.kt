package de.davidriad.ouchcouch.composables

import de.davidriad.ouchcouch.R

sealed class NavigationItem(var title:String, var icon:Int, var screen_route:String){

    object Home : NavigationItem("Home", R.drawable.ic_home,"home")
    object Search: NavigationItem("Search",R.drawable.ic_search,"search")
    object Favourite: NavigationItem("Favourite",R.drawable.ic_favorite,"favourite")
    object Profile: NavigationItem("Profile",R.drawable.ic_profile,"profile")
    object Settings: NavigationItem("Settings",R.drawable.ic_settings,"settings")
}