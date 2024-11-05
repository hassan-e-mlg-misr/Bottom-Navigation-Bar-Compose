package com.mlg.bottomnavigationbarcompose.utils

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RichTooltip
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.TooltipState
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExplanationArea(
    title: String,
    details: String,
    onNext: () -> Unit,
    tooltipState: TooltipState,
    content: @Composable () -> Unit
) {
    TooltipBox(
        positionProvider = TooltipDefaults.rememberTooltipPositionProvider(),
        tooltip = {
            RichTooltip(title = { Text(title) }, action = {
                TextButton(onClick = onNext) {
                    Text("Next")
                }
            }) {
                Text(details)
            }
        },
        state = tooltipState,
    ) {
        content()
    }
}