package com.example.smarthouse.data.rooms

import androidx.compose.ui.graphics.painter.Painter
import com.example.smarthouse.data.things.AirConditioner
import com.example.smarthouse.data.things.AlarmClock
import com.example.smarthouse.data.things.CoffeeMachine
import com.example.smarthouse.data.things.Light

class Room(
    val image: Painter,
    val name: String,
    val airConditioner: AirConditioner,
    val light: Light,
    val alarmClock: AlarmClock?,
    val coffeeMachine: CoffeeMachine?
)
