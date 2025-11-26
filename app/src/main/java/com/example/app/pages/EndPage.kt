package com.example.app.pages

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app.component.SKCounter
import com.example.app.component.SKForm
import com.example.app.component.SKFormTitle
import com.example.app.component.SKLabeledComposable
import com.example.app.component.SKYesNoChoice
import com.example.app.data.EndData
import com.example.app.ui.theme.SkafoldExampleAppTheme
import io.oliverj.skaffold.EMPTY_LAMBDA
import io.oliverj.skaffold.Page
import io.oliverj.skaffold.Skafold

class EndPage(onNext: () -> Unit = EMPTY_LAMBDA, onBack: () -> Unit = EMPTY_LAMBDA) : Page(onNext, onBack) {
    @Composable
    override fun Render() {
        SKForm(
            Modifier.padding(10.dp),
            labelWidth = 150.dp,
            componentWidth = 200.dp,
            fieldHeight = 40.dp,
            rowSpacing = 8.dp) {
            
            SKFormTitle("End Game")

            HorizontalDivider()
            SKLabeledComposable("Parked") {
                SKCounter("barge_parked")
            }
            SKLabeledComposable("Shallow Climb") {
                SKCounter("barge_shallowClimb")
            }
            SKLabeledComposable("Deep Climb") {
                SKCounter("barge_deepClimb")
            }
            HorizontalDivider()
            SKLabeledComposable("Auton RP?") {
                SKYesNoChoice("autonRP")
            }
            SKLabeledComposable("Coral RP?") {
                SKYesNoChoice("autonRP")
            }
            SKLabeledComposable("Barge RP?") {
                SKYesNoChoice("autonRP")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEnd() {
    Skafold.currentPage = "end"
    Skafold.pageData["end"] = EndData()

    SkafoldExampleAppTheme {
        EndPage().Core({})
    }
}