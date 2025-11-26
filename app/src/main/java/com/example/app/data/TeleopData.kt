package com.example.app.data

import io.oliverj.skaffold.data.PageData
import io.oliverj.skafold.processor.SerializableData
import kotlinx.serialization.Serializable

@Serializable
@SerializableData
class TeleopData(
    var coral_L1: Int = 0,
    var coral_L2: Int = 0,
    var coral_L3: Int = 0,
    var coral_L4: Int = 0,
    var algae_processor: Int = 0,
    var algae_net: Int = 0,
    var coopBonus: Boolean = false,
) : PageData("teleop") {
}