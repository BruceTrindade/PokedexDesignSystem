package com.example.dsmpokedex

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
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

    fun setCompose(type: String) {
        val secondColor = resources.getColor(getTypeColor(type))
        val primaryColor = resources.getColor(getTypeColor(type))

        binding.pokemonType.setContent {
            PokeChips(icon = type, text = type, primaryColor = primaryColor)
        }

        binding.pokemonSecondType.setContent {
            PokeChips(icon = type, text = type, secondColor = secondColor)
        }
    }

    fun setPokeType(type: String) {
        setCompose(type)
    }

    fun setPokeStype(sType: String) {
        setCompose(sType)
    }

    fun setPokeImage(url: String) {
        Glide.with(context)
            .load(url)
            .into(binding.pokemonImg)
    }

    fun setColors(primaryColor: Int, secondColor: Int) {
        cardViewBackground(primaryColor)
        setPokemonTypeColor(primaryColor)
        setPokemonSecondTypeColor(secondColor)
        setPokemonTypeColor(primaryColor)
    }

    private fun setPokemonTypeColor(color: Int): Int {
        return color
    }

    private fun setPokemonSecondTypeColor(color: Int) {
        //  binding.pokemonSecondType.chipBackgroundColor = ColorStateList.valueOf(resources.getColor(color))
    }

    private fun cardViewBackground(secondColor: Int) {
        val drawable = GradientDrawable().apply {
            colors = intArrayOf(
                resources.getColor(secondColor),
                resources.getColor(secondColor)
            )
            orientation = GradientDrawable.Orientation.BOTTOM_TOP
            gradientType = GradientDrawable.LINEAR_GRADIENT
            shape = GradientDrawable.RECTANGLE
            cornerRadius = 24f
        }
        binding.pokeCard.background = drawable
    }
}
