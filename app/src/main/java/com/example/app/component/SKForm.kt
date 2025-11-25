package com.example.app.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val LocalLabelWidth = compositionLocalOf { 150.dp }

@Composable
fun SKForm(
    labelWidth: Dp,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalLabelWidth provides labelWidth) {
        Column(modifier) {
            content()
        }
    }
}