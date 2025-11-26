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
            SKFormTitle("Auton Phase")
            HorizontalDivider()
            SKLabeledComposable("Did Robot Leave?") {
                SKYesNoChoice("didLeave")
            }
            HorizontalDivider()
            SKLabeledComposable("Coral L1") {
                SKCounter("coral_L1")
            }
            SKLabeledComposable("Coral L2") {
                SKCounter("coral_L2")
            }
            SKLabeledComposable("Coral L3") {
                SKCounter("coral_L3")
            }
            SKLabeledComposable("Coral L4") {
                SKCounter("coral_L4")
            }
            HorizontalDivider()
            SKLabeledComposable("Algae Processor") {
                SKCounter("algae_processor")
            }
            SKLabeledComposable("Algae Net") {
                SKCounter("algae_net")
            }
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAuton() {
    Skafold.currentPage = "auton"
    Skafold.pageData["auton"] = AutonData()

    SkafoldExampleAppTheme {
        AutonPage().Core({})
    }
}