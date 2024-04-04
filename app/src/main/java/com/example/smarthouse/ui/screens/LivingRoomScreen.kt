package com.example.smarthouse.ui.screens

import androidx.compose.runtime.Composable
import com.example.smarthouse.data.rooms.Room
import com.example.smarthouse.ui.components.LivingRoomComponent

@Composable
fun LivingRoomScreen(livingRoom: Room){
    LivingRoomComponent(livingRoom = livingRoom)
}