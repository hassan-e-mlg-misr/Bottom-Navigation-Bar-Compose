package com.mlg.bottomnavigationbarcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.mlg.bottomnavigationbarcompose.screen.Screens

//a data class represent an items with the specifications
data class BottomNavigationItem(
    val label: String = "",
    //starter - and the Basic screen
    val icon: ImageVector = Icons.Filled.Home,
    val route: String = ""
) {
    //function to get the list of bottomNavigationItems
    fun bottomNavigationItems(): List<BottomNavigationItem> {
        /**
         * return listOf(
         *             BottomNavigationItem(
         *                 label = "Home",
         *                 icon = Icons.Filled.Home,
         *                 route = Screens.Home.route
         *             ),
         *             BottomNavigationItem(
         *                 label = "Search",
         *                 icon = Icons.Filled.Search,
         *                 route = Screens.Search.route
         *             ),
         *             BottomNavigationItem(
         *                 label = "Profile",
         *                 icon = Icons.Filled.AccountCircle,
         *                 route = Screens.Profile.route
         *             ),
         *         )
        * */

        val itemsList: List<BottomNavigationItem> = listOf(
            BottomNavigationItem(
                label = "Home",
                icon = Icons.Filled.Home,
                route = Screens.Home.route
            ),
            BottomNavigationItem(
                label = "Settings",
                icon = Icons.Filled.Search,
                route = Screens.Settings.route
            ),
            BottomNavigationItem(
                label = "Profile",
                icon = Icons.Filled.AccountCircle,
                route = Screens.Profile.route
            )
        )

        return itemsList
    }

}
