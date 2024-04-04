package com.example.smarthouse.data.things

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.Painter

class Light(val image: Painter, initialStatus: Boolean){
    var status by mutableStateOf(initialStatus)
}