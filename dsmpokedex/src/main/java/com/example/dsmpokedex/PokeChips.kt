package com.example.dsmpokedex

import androidx.compose.material3.*
import androidx.compose.material3.AssistChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokeChips(icon: String, text: String, primaryColor: Int = R.color.white) {

    // val color = secondColor ?: primaryColor

    val iconPoke =
        when (icon) {
            "grass", "bug" -> painterResource(id = R.drawable.leaf)
            "fire" -> painterResource(id = R.drawable.flame)
            "electric" -> painterResource(id = R.drawable.lightning)
            "water" -> painterResource(id = R.drawable.drop)
            "poison" -> painterResource(id = R.drawable.poison)
            else -> { null }
        }

    val color1 = Color(primaryColor)

    AssistChip(
        onClick = { /*TODO*/ },
        label = { Text(text) },
        colors = AssistChipDefaults.assistChipColors(color1)

    )
}
