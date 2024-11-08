package com.mlg.bottomnavigationbarcompose.utils

import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.graphics.Color

data class ShowCaseProperty(
    val index: Int,
    val coordinate: LayoutCoordinates,
    val title: String,
    val subTitle: String,
    val titleColor: Color = Color.White,
    val subTitleColor: Color = Color.White
)

