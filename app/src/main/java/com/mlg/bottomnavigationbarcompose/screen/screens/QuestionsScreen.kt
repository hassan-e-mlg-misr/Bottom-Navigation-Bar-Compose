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
fun QuestionsScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Questions" , fontSize = 25.sp )
    }
}