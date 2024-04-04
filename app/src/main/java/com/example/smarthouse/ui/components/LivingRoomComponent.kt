package com.example.smarthouse.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.smarthouse.data.rooms.Room

@Composable
fun LivingRoomComponent(livingRoom: Room) {

    LazyVerticalGrid(
        GridCells.Fixed(2),
        modifier = Modifier.fillMaxWidth()
    ) {
        item {
            LightComponent(light = livingRoom.light)
        }
        item {
            AirConditionerComponent(airConditioner = livingRoom.airConditioner)
        }
    }
}