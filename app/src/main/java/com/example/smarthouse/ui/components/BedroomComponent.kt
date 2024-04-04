package com.example.smarthouse.ui.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.smarthouse.data.rooms.Room

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun BedroomComponent(bedroom: Room) {

    LazyVerticalGrid(
        GridCells.Fixed(2),
        modifier = Modifier.fillMaxWidth()
    ) {
        item {
            LightComponent(light = bedroom.light)
        }
        item {
            AirConditionerComponent(airConditioner = bedroom.airConditioner)
        }
        item {
            AlarmClockComponent(alarmClock = bedroom.alarmClock!!)
        }
    }
}