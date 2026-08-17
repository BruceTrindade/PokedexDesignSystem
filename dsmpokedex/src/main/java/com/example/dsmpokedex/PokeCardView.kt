package com.example.dsmpokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.dsmpokedex.util.PokemonTypesColors.getTypeColor

/**
 * Compose replacement for the former `CardViewPoke` custom View. A card tinted by
 * the Pokémon's primary type, showing the name, type chips and artwork.
 *
 * @param name    display name.
 * @param imageUrl remote artwork URL (loaded with Coil).
 * @param types   type names (Title case, e.g. "Fire"); the first drives the card color.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokeCard(
    name: String,
    imageUrl: String,
    types: List<String>,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    val primaryColor = colorResource(id = getTypeColor(types.firstOrNull().orEmpty()))

    Card(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 2.dp, vertical = 4.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = primaryColor),
    ) {
        Box {
            // Faint pokéball watermark, bottom-end.
            Image(
                painter = painterResource(id = R.drawable.pokeball),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(120.dp)
                    .alpha(0.15f),
            )

            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    text = name,
                    color = Color(0xFF313131),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier.padding(top = 8.dp),
                ) {
                    types.forEach { type ->
                        PokeChips(
                            text = type,
                            primaryColor = colorResource(id = getTypeColor(type)).toArgb(),
                        )
                    }
                }
            }

            AsyncImage(
                model = imageUrl,
                contentDescription = name,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .size(90.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PokeCardPreview() {
    PokeCard(
        name = "Charmander",
        imageUrl = "",
        types = listOf("Fire"),
    )
}
