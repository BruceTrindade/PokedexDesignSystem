package com.example.dsmpokedex

import androidx.cardview.widget.CardView
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.android.material.card.MaterialCardView

@ExperimentalMaterialApi
@Composable
@NonRestartableComposable
fun PokeCardView() {
    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        elevation = 10.dp,
        shape = RoundedCornerShape(15.dp),
        backgroundColor = MaterialTheme.colors.surface
    ) {
//
    }
}

