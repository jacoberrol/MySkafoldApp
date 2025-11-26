package com.example.app.data

import io.oliverj.skaffold.data.PageData
import io.oliverj.skafold.processor.SerializableData
import kotlinx.serialization.Serializable

@Serializable
@SerializableData
class EndData(
    var barge_parked: Int = 0,
    var barge_shallowClimb: Int = 0,
    var barge_deepClimb: Int = 0,
    var autonRP: Boolean = false,
    var coralRP: Boolean = false,
    var bargeRP: Boolean = false
) : PageData("end") {
}