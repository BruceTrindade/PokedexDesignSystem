package com.example.dsmpokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PokeBallBackground(text: String? = null, color: Color = Color(R.color.poke_white)) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = color,
        contentColor = color,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.End) {
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = painterResource(id = R.drawable.pokeball),
                contentDescription = "Draw of a Pokeball",
                modifier = Modifier
                    .padding(4.dp)
                    .size(90.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, Color(R.color.white), CircleShape),
                alignment = Alignment.BottomEnd
            )
        }
    }
}
