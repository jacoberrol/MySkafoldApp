package com.example.app.pages

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app.component.SKChoice
import com.example.app.component.SKCounter
import com.example.app.component.SKForm
import com.example.app.component.SKLabeledComposable
import com.example.app.data.AutonData
import com.example.app.ui.theme.SkafoldExampleAppTheme
import io.oliverj.skaffold.EMPTY_LAMBDA
import io.oliverj.skaffold.Page
import io.oliverj.skaffold.Skafold

class AutonPage(onNext: () -> Unit = EMPTY_LAMBDA, onBack: () -> Unit = EMPTY_LAMBDA) : Page(onNext, onBack) {
    @Composable
    override fun Render() {
        SKForm(
            Modifier.padding(10.dp),
            labelWidth = 150.dp,
            componentWidth = 200.dp,
            fieldHeight = 40.dp,
            rowSpacing = 8.dp
        ) {

            Text("Auton", style= MaterialTheme.typography.titleLarge)
            SKLabeledComposable("Points Scored") {
                SKCounter("points")
            }
            SKLabeledComposable("Did Robot Move?") {
                SKChoice("didMove", listOf("Yes", "No"))
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewRender() {
    Skafold.currentPage = "auton"
    Skafold.pageData["auton"] = AutonData()

    SkafoldExampleAppTheme {
        AutonPage().Core({})
    }
}