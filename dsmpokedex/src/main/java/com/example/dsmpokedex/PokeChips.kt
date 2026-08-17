package com.example.dsmpokedex

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PokeChips(text: String, primaryColor: Int = android.graphics.Color.WHITE) {
    val color = Color(primaryColor)

    AssistChip(
        onClick = { /* no-op */ },
        label = { Text(text) },
        modifier = Modifier
            .testTag("Chips Test Tag")
            .height(20.dp),
        shape = RoundedCornerShape(32.dp),
        colors = AssistChipDefaults.assistChipColors(containerColor = color),
    )
}

@Preview(showBackground = true)
@Composable
private fun ChipsPreview() = MaterialTheme {
    PokeChips("Fire")
}
