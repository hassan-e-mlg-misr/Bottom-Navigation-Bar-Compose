package com.mlg.bottomnavigationbarcompose.screen.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
//        Text(
//            text = "HOME",
//            fontSize = MaterialTheme.typography.titleLarge,
//            fontWeight = FontWeight.Bold,
//            color = androidx.compose.ui.graphics.Color.White
//        )

        Text(text = "Profile" , fontSize = 25.sp )
    }

}