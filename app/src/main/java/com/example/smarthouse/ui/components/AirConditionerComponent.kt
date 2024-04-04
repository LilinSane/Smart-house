package com.example.smarthouse.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.smarthouse.data.things.AirConditioner
import com.example.smarthouse.ui.theme.Purple10
import kotlin.math.roundToInt

@Composable
fun AirConditionerComponent(airConditioner: AirConditioner) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .heightIn(max = 270.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Purple10),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(
                painter = airConditioner.image,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .padding(8.dp)
            )
            Text(
                text = "Кондиционер " + airConditioner.name,
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = if (airConditioner.status) "Статус: Включено" else "Статус: Выключено",
                modifier = Modifier.padding(8.dp)
            )
            Switch(
                checked = airConditioner.status,
                onCheckedChange = { airConditioner.status = it }
            )

            if (airConditioner.status) {
                Text(
                    text = "Температура: " + airConditioner.temperature.toString() + "°C",
                    modifier = Modifier.padding(8.dp, 12.dp, 8.dp, 8.dp)
                )
                Slider(
                    value = airConditioner.temperature,
                    onValueChange = { airConditioner.temperature = (it * 10).roundToInt() / 10f },
                    valueRange = 0f..30f,
                    steps = 300,
                    colors = SliderDefaults.colors(
                        activeTrackColor = Purple10,
                        activeTickColor = Purple10
                    )
                )
            }
        }
    }
}