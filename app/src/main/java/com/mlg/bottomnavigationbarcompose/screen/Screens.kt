package com.mlg.bottomnavigationbarcompose.screen

sealed class Screens(val route: String) {

    //Hold Screen Objects
    object Home : Screens(route = "home_screen")
    object Connector : Screens(route = "connector_screen")
    object Questions : Screens(route = "questions_screen")
    object Tools : Screens(route = "tools_screen")
    object Profile : Screens(route = "profile_screen")
}