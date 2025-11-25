package com.example.app.pages

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app.MainActivity
import com.example.app.component.SKCheckbox
import com.example.app.component.SKChoice
import com.example.app.component.SKCounter
import com.example.app.component.SKForm
import com.example.app.component.SKIncrement
import com.example.app.component.SKLabeledComposable
import com.example.app.component.SKLabeledCounter
import com.example.app.data.AutonData
import com.example.app.ui.theme.SkafoldExampleAppTheme
import com.example.app.ui.theme.Typography
import io.oliverj.skaffold.EMPTY_LAMBDA
import io.oliverj.skaffold.Page
import io.oliverj.skaffold.Skafold
import io.oliverj.skaffold.data.skafolded
import io.oliverj.skaffold.skafold

class AutonPage(onNext: () -> Unit = EMPTY_LAMBDA, onBack: () -> Unit = EMPTY_LAMBDA) : Page(onNext, onBack) {
    @Composable
    override fun Render() {
        var name: String by skafolded { "name" }


        SKForm(labelWidth = 150.dp, Modifier.padding(10.dp)) {
            Text("Auton", style= MaterialTheme.typography.titleLarge)
            SKLabeledComposable("Points Scored") {
                SKCounter(
                    "points",
                    Modifier.height(40.dp)
                )
            }
            SKLabeledComposable("Did Robot Move?") {
                SKChoice(
                    "didMove",
                    listOf("Yes", "No")
                )
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