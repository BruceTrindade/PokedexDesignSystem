package com.example.dsmpokedex

import androidx.compose.material3.*
import androidx.compose.material3.AssistChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokeChips(icon: String, text: String) {

    val color = Color.Black

    val iconPoke =
    when(icon) {
        "grass", "bug" -> painterResource(id = R.drawable.leaf)
        "fire" -> painterResource(id = R.drawable.flame)
        "electric" -> painterResource(id = R.drawable.lightning)
        "water" -> painterResource(id = R.drawable.drop)
        "poison" -> painterResource(id = R.drawable.poison)
        else -> { null }
    }

    AssistChip(
        onClick = { /*TODO*/ },
        label = { Text(text) },
        leadingIcon = {
            if (iconPoke != null) {
                Icon(
                    painter = iconPoke,
                    contentDescription = "Icon pokemon type"
                )
            }
        },
        colors = AssistChipDefaults.assistChipColors(color)

    )
}
