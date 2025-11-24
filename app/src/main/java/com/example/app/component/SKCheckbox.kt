package com.example.app.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import io.oliverj.skaffold.data.skafolded

@Composable
fun SKCheckbox(fieldName: String, label: String) {
    var fieldValue: Boolean by skafolded { fieldName }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(label)
        Checkbox(fieldValue, { fieldValue = it })
    }
}