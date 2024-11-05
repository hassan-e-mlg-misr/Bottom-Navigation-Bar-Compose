package com.mlg.bottomnavigationbarcompose.navigation

//import androidx.compose.material3.Tooltip
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mlg.bottomnavigationbarcompose.screen.Screens
import com.mlg.bottomnavigationbarcompose.screen.screens.HomeScreen
import com.mlg.bottomnavigationbarcompose.screen.screens.QuestionsScreen
import com.mlg.bottomnavigationbarcompose.screen.screens.ToolsScreen
import com.mlg.bottomnavigationbarcompose.screen.screens.ConnectorScreen
import com.mlg.bottomnavigationbarcompose.screen.screens.ProfileScreen
import com.mlg.bottomnavigationbarcompose.utils.ShowCaseProperty

/**
 * Here comes the important part now let’s set up the bottom
 * navigation bar by using Scaffold this file Contains Bottom Navigation Bar and Nav Host also .*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigationBar() {

    val context = LocalContext.current
    val targets = remember { mutableStateMapOf<String, ShowCaseProperty>() }


    val navController = rememberNavController()
    //   val navBackStackEntry by navController.currentBackStackEntryAsState()
    //initializing the default selected item
    var navigationSelectedItem by remember { mutableIntStateOf(0) }

    //  val currentDestination = navBackStackEntry?.destination
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(tonalElevation = 18.dp) {
                BottomNavigationItem().bottomNavigationItems()
                    //  Tool
                    //If index (the position of the current item in the list) is equal to navigationSelectedItem
                    // (the currently selected item), it means this item should appear as selected in the UI.
                    .forEachIndexed { index, navigationItem ->
                        //iterating all items with their respective indexes
                        // TooltipBox(tooltip = { Text(navigationSelectedItem .description)}) {
//                       TooltipBox(
//                    tooltip = {Text() }
//                       )
                        NavigationBarItem(
                            selected = index == navigationSelectedItem,
                            label = { Text(navigationItem.label) },
                            icon = {
                                Icon(
                                    navigationItem.icon,
                                    contentDescription = navigationItem.label
                                )
                            },
                            onClick = {
                                navigationSelectedItem = index
                                navController.navigate(navigationItem.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            })

                    }
            }

        }
    ) { paddingValues ->
        //We need to setup our NavHost in here
        NavHost(
            navController = navController,
            startDestination = Screens.Home.route,
            modifier = Modifier.padding(paddingValues = paddingValues)
        ) {
            composable(Screens.Home.route) {
                //call our actual  composable screens here
                HomeScreen()
            }
            composable(Screens.Connector.route) {
                //call our composable screens here
                ConnectorScreen()
            }
            composable(Screens.Questions.route) {
                //call our composable screens here
                QuestionsScreen()
            }
            composable(Screens.Tools.route) {
                ToolsScreen()
            }
            composable(Screens.Profile.route) {
                ProfileScreen()
            }
        }

    }

}