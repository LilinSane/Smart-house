package com.example.smarthouse.data.things

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.Painter

class AirConditioner (val image: Painter, val name: String, initialStatus: Boolean, initialTemperature: Float){
    var status by mutableStateOf(initialStatus)
    var temperature by mutableStateOf(initialTemperature)
}