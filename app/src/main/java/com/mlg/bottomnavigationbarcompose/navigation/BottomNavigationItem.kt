package com.mlg.bottomnavigationbarcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.ui.graphics.vector.ImageVector
import com.mlg.bottomnavigationbarcompose.screen.Screens

//a data class represent an items with the specifications
data class BottomNavigationItem(
    val label: String = "",
    //starter - and the Basic screen
    val icon: ImageVector = Icons.Filled.Home,
    val route: String = "" ,
    val description : String = ""
) {
    //function to get the list of bottomNavigationItems
    fun bottomNavigationItems(): List<BottomNavigationItem> {

        val itemsList: List<BottomNavigationItem> = listOf(
            BottomNavigationItem(
                label = "Home",
                icon = Icons.Filled.Home,
                route = Screens.Home.route ,
                description = "vous trouverez ici votre plan d'étude"
            ),
            BottomNavigationItem(
                label = "Connector",
                icon = Icons.Filled.Chat,
                route = Screens.Connector.route,
                description = "vous trouverez ici des partenaires d'étude et des ici votre plan d'étude connector"
            ),
            BottomNavigationItem(
                label = "Questions",
                icon = Icons.Default.QuestionMark,
                route = Screens.Questions.route ,
                description = "voici les questions avec des réponse Questions"
            ),
            BottomNavigationItem(
                label = "Tools",
                icon = Icons.Filled.Edit,
                route = Screens.Tools.route ,
                description = "voici les questions avec des réponse Tools "
            ) ,
            BottomNavigationItem(
                label = "Profile",
                icon = Icons.Filled.AccountCircle,
                route = Screens.Profile.route ,
                description = "voici les questions avec des réponse Profile "
            )
        )
        return itemsList
    }

}
