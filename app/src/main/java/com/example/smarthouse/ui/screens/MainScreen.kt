package com.example.smarthouse.ui.screens

import androidx.compose.runtime.Composable
import com.example.smarthouse.data.rooms.Room
import com.example.smarthouse.ui.components.RoomsComponent

@Composable
fun MainScreen(rooms: List<Room>, onClick: (Room) -> Unit){
    RoomsComponent(
        rooms = rooms,
        onClick = onClick
    )
}