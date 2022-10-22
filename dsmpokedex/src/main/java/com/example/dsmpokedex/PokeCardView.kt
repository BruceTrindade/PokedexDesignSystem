package com.example.dsmpokedex

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.bumptech.glide.Glide
import com.example.dsmpokedex.databinding.CardViewPokeBinding

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
        binding.pokemonType.text = type
    }

    fun setPokeStype(sType: String) {
        binding.pokemonSecondType.text = sType
    }

    fun setPokeImage(url: String) {
        Glide.with(context)
            .load(url)
            .into(binding.pokemonImg)
    }

    fun setColors(primaryColor: Int, secondColor: Int) {
       cardViewBackground(primaryColor)
    }

    private fun setPokemonTypeColor(color: Int) {
        binding.pokemonType.setBackgroundColor(color)
    }

    private fun setPokemonSecondTypeColor(color: Int) {
        binding.pokemonSecondType.setBackgroundColor(color)
    }

    private fun cardViewBackground(secondColor: Int) {
        val primaryColor = resources.getColor(R.color.white)
        val drawable = GradientDrawable().apply {
            colors = intArrayOf(
                primaryColor,
                secondColor
            )
            orientation = GradientDrawable.Orientation.BOTTOM_TOP
            gradientType = GradientDrawable.LINEAR_GRADIENT
            shape = GradientDrawable.RECTANGLE
            cornerRadius = 24f
        }
        binding.pokeCard.background = drawable
    }

}
