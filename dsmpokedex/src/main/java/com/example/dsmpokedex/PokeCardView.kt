package com.example.dsmpokedex

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
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
        binding.pokemonSecondType.apply {
            if (sType.isEmpty()) this.visibility = View.GONE
            else {
                this.visibility = View.VISIBLE
                this.text = sType
            }
        }
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
    }

    private fun setPokemonTypeColor(color: Int) {
        binding.pokemonType.chipBackgroundColor = ColorStateList.valueOf(resources.getColor(color))
    }

    private fun setPokemonSecondTypeColor(color: Int) {
        binding.pokemonSecondType.chipBackgroundColor = ColorStateList.valueOf(resources.getColor(color))
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
