package com.mlg.bottomnavigationbarcompose.screen.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mlg.bottomnavigationbarcompose.ui.theme.BottomNavigationBarComposeTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.Blue),
        contentAlignment = Alignment.Center
    ) {
//        Text(
//            text = "HOME",
//            fontSize = MaterialTheme.typography.titleLarge,
//            fontWeight = FontWeight.Bold,
//            color = androidx.compose.ui.graphics.Color.White
//        )

        Text(text = "Tools" , fontSize = 25.sp )
    }

//    var text by remember { mutableStateOf("") }
//    var isActive by remember { mutableStateOf(false) }
//
//    var items = remember {
//        mutableStateListOf(
//            "hassan",
//            "elsayed",
//            "mohamed",
//            "hussien",
//            "ibrahim"
//        )
//    }
//
//    Scaffold(modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 10.dp)) {
//        SearchBar(
//            modifier = Modifier.fillMaxWidth(),
//            query = text,
//            //a call back to trigger the input qurry update
//            onQueryChange = { text = it },
//            onSearch = {
//                items.add(text)
//                isActive = false
//                text = ""
//            },
//            active = isActive,
//            onActiveChange = { isActive = it },
//            placeholder = { Text("Search") },
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon"
//                )
//            },
//            trailingIcon = {
//                // if search box is active == true show close icon and make click remove text
//                if (isActive) {
//                    Icon(
//                        modifier = Modifier
//                            .clickable {
//                                if (text.isNotEmpty()) {
//                                    text = ""
//                                } else {
//                                    isActive = false
//                                }
//                            },
//                        imageVector = Icons.Default.Close, contentDescription = "Cancel Icon"
//                    )
//                } else {
//                    //set active boolean == false
//                    isActive = false
//
//                }
//            }
//        ) {
//            items.forEach {
//                Row(modifier = Modifier.padding(12.dp)) {
//                    Icon(
//                        modifier = Modifier.padding(14.dp),
//                        painter = painterResource(id = R.drawable.ic_history),
//                        contentDescription = null
//                    )
//                    Text(text = it)
//
//                }
//            }
//
//        }
//    }
    // view model instance in screen
    // val searchViewModel = SearchViewModel(person)


//    val searchText by searchViewModel.searchText.collectAsState()//flow of data (StateFlow or LiveData) into a Compose State object.
//    val persons by searchViewModel.persons.collectAsState()
//    val isSearching by searchViewModel.isSearching.collectAsState()
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(20.dp)
//    ) {
//      //  TextField(
//        //    value = searchText,
//            //argument
//         //   onValueChange = searchViewModel::onSearchTextChange,
//            modifier = Modifier.fillMaxWidth(),
//      //      placeholder = { Text(text = "Search") }
//     //   )
//        Spacer(modifier = Modifier.height(16.dp))
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(1f)
//        ) {
//            //List of Items
//            items(persons) { person ->
//                Text(
//                    text = "${person.firstName} ${person.lastName}" ,
//                    modifier = Modifier.fillMaxWidth().padding(16.dp)
//                )
//            }
//        }
//
//    }


}

@Preview
@Composable
fun SearchScreenPreview() {
    BottomNavigationBarComposeTheme {
        ToolsScreen()
    }

}