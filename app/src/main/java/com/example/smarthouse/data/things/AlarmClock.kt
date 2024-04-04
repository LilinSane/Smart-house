package com.example.smarthouse.data.things

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalTime

class AlarmClock(val image: Painter, val name: String, initialStatus: Boolean, initialTime: LocalTime){
    var status by mutableStateOf(initialStatus)
    var time by mutableStateOf(initialTime)
}