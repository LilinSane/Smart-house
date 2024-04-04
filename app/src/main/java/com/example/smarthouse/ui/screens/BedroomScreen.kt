package com.example.smarthouse.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import com.example.smarthouse.data.rooms.Room
import com.example.smarthouse.ui.components.BedroomComponent
import com.example.smarthouse.ui.components.LivingRoomComponent

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun BedroomScreen(bedroom: Room){
    BedroomComponent(bedroom = bedroom)
}