package com.example.dsmpokedex

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.dsmpokedex.util.PokemonTypesColors.getTypeColor

/**
 * Large detail card with the Pokémon artwork over a type-colored gradient, name,
 * number and type chips. Compose implementation of the (previously empty)
 * `PokeDetailCardView`.
 */
@Composable
fun PokeDetailCard(
    name: String,
    number: String,
    imageUrl: String,
    types: List<String>,
    modifier: Modifier = Modifier,
) {
    val primaryColor = colorResource(id = getTypeColor(types.firstOrNull().orEmpty()))
    val secondColor = if (types.size > 1) colorResource(id = getTypeColor(types[1])) else Color.White

    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(410.dp)
            .clip(RoundedCornerShape(24.dp))
            .background(Brush.verticalGradient(listOf(secondColor, primaryColor)))
            .padding(16.dp),
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = name,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(300.dp),
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(name, color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 32.sp)
            Text(number, color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 32.sp)
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(top = 8.dp),
        ) {
            types.forEach { type ->
                PokeChips(text = type, primaryColor = colorResource(id = getTypeColor(type)).toArgb())
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PokeDetailCardPreview() {
    PokeDetailCard(
        name = "Charmander",
        number = "004",
        imageUrl = "",
        types = listOf("Fire"),
    )
}
