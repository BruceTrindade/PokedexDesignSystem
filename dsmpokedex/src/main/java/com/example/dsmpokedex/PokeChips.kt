package com.example.dsmpokedex

import androidx.compose.material3.*
import androidx.compose.material3.AssistChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokeChips(text: String, primaryColor: Int = R.color.white) {

    val color1 = Color(primaryColor)

    AssistChip(
        onClick = { /*TODO*/ },
        label = { Text(text) },
        colors = AssistChipDefaults.assistChipColors(color1)

    )
}
