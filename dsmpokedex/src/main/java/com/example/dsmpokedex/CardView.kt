package com.example.dsmpokedex

import android.content.Context
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.google.android.material.card.MaterialCardView

class PokeCardView : MaterialCardView {
    constructor(
        context: Context
    ) : super(context) {
        initialization()
    }

    private fun initialization() {
        val pokeballImage = R.drawable.pokeball
        val imageView = ImageView(context)

        strokeColor = ContextCompat.getColor(context, R.color.white)
        strokeWidth = 2

        imageView.setImageDrawable(context.getDrawable(pokeballImage))
    }
}
