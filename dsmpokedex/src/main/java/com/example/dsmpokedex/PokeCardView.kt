package com.example.dsmpokedex

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.bumptech.glide.Glide
import com.example.dsmpokedex.databinding.CardViewPokeBinding
import com.example.dsmpokedex.util.PokemonTypesColors.getTypeColor

class CardViewPoke @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val binding = CardViewPokeBinding
        .inflate(LayoutInflater.from(context), this, true)

    fun setPokeName(text: String) {

        binding.pokemonName.text = text
    }

    fun setPokeType(type: String) {
        val color = resources.getColor(getTypeColor(type))

        cardViewBackground(color)

        binding.pokemonType.setContent {

            PokeChips(text = type, primaryColor = color)
        }
    }

    fun setPokeSecondType(secondType: String) {
        val color = resources.getColor(getTypeColor(secondType))
        binding.pokemonSecondType.apply {
            if (secondType.isEmpty()) {
                this.visibility = View.GONE
            } else {
                this.visibility = View.VISIBLE
                setContent {
                    PokeChips(text = secondType, color)
                }
            }
        }
    }

    fun setPokeImage(url: String) {
        Glide.with(context)
            .load(url)
            .into(binding.pokemonImg)
    }

    private fun cardViewBackground(color: Int) {
        val drawable = GradientDrawable().apply {
            colors = intArrayOf(
                color,
                color
            )
            orientation = GradientDrawable.Orientation.BOTTOM_TOP
            gradientType = GradientDrawable.LINEAR_GRADIENT
            shape = GradientDrawable.RECTANGLE
            cornerRadius = 24f
        }
        binding.pokeCard.background = drawable
    }
}
