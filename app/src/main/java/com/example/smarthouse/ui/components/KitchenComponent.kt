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
fun KitchenComponent(kitchen: Room) {

    LazyVerticalGrid(
        GridCells.Fixed(2),
        modifier = Modifier.fillMaxWidth()
    ) {
        item {
            LightComponent(light = kitchen.light)
        }
        item {
            AirConditionerComponent(airConditioner = kitchen.airConditioner)
        }
        item { 
            CoffeeMachineComponent(coffeeMachine = kitchen.coffeeMachine!!)
        }
    }
}