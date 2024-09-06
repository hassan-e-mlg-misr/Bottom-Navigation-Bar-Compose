package com.mlg.bottomnavigationbarcompose.screen

sealed class Screens( val route: String) {

    //Hold Screen Objects
    object Home : Screens(route = "home_screen")
    object Profile : Screens(route = "profile_screen")
    object Settings : Screens(route = "settings_screen" )
}