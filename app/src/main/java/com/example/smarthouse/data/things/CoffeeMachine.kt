package com.example.smarthouse.data.things

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.Painter
import com.example.smarthouse.data.enums.Coffee
import java.time.LocalTime

class CoffeeMachine(val image: Painter, val name: String, initialStatus: Boolean, initialCoffee: Coffee, initialTime: LocalTime){
    var status by mutableStateOf(initialStatus)
    var time by mutableStateOf(initialTime)
    var coffee by mutableStateOf(initialCoffee)
}