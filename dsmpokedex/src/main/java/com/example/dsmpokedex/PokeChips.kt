package com.example.dsmpokedex

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokeChips(text: String, primaryColor: Int = R.color.white) {
    val color = Color(primaryColor)

    AssistChip(
        onClick = { /*TODO*/ },
        label = { Text(text) },
        modifier = Modifier.height(20.dp),
        shape = RoundedCornerShape(32.dp),
        colors = AssistChipDefaults.assistChipColors(color)

    )
}
