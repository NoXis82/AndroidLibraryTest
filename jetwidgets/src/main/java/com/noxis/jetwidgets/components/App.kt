package com.noxis.jetwidgets.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { }) { Text("Sine wave") }
        }
        SineScreen()
    }
}

@Composable
private fun BoxScope.SineScreen() {
    Column(
        modifier = Modifier.Companion.align(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var size by remember { mutableStateOf(24f) }
        var frequency by remember { mutableStateOf(4f) }
        Text("Set size:")
        Slider(
            value = size,
            onValueChange = { size = it },
            valueRange = 0f..400f
        )
        Text("Set wave frequency:")
        Slider(
            value = frequency,
            onValueChange = { frequency = it },
            valueRange = 0f..50f
        )
        RecordingButton(size.dp, frequency.toInt()) {}
    }
}
