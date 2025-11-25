package com.example.app.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SKLabeledComposable(
    label: String,
    modifier: Modifier = Modifier,
    composable: @Composable () -> Unit
) {
    val labelWidth = LocalLabelWidth.current

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        SKLabel(label,modifier.width(labelWidth))
        composable()
    }
}