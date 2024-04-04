package com.example.smarthouse.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.smarthouse.data.things.Light
import com.example.smarthouse.ui.theme.Purple10

@Composable
fun LightComponent(light: Light) {
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
                painter = light.image,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .padding(8.dp)
            )
            Text(
                text = "Свет",
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = if (light.status) "Статус: Включено" else "Статус: Выключено",
                modifier = Modifier.padding(8.dp)
            )
            Switch(checked = light.status, onCheckedChange = { light.status = it })
        }
    }
}