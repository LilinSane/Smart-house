package com.example.smarthouse.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.smarthouse.data.rooms.Room
import com.example.smarthouse.ui.components.KitchenComponent
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.clock.ClockDialog
import com.maxkeppeler.sheets.clock.models.ClockSelection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KitchenScreen(kitchen: Room){
    KitchenComponent(kitchen = kitchen)
}