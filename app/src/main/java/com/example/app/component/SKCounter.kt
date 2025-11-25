package com.example.app.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.oliverj.skaffold.data.skafolded

@Composable
fun SKCounter(
    fieldName: String,
    modifier: Modifier = Modifier
) {
    var field: Int by skafolded { fieldName }

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            { field -= 1 },
            shape = RoundedCornerShape(25.dp, 0.dp, 0.dp, 25.dp),
        ) {
            Text("-")
        }
        Box(
            modifier = modifier
                .background(MaterialTheme.colorScheme.primary)
                .padding(horizontal = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("$field", color = MaterialTheme.colorScheme.onPrimary)
        }
        Button(
            { field += 1 },
            shape = RoundedCornerShape(0.dp, 25.dp, 25.dp, 0.dp),
        ) {
            Text("+")
        }
    }
}