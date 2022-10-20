package com.example.dsmpokedex

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.dsmpokedex.databinding.CardViewPokeBinding

class CardViewPoke @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val binding = CardViewPokeBinding
        .inflate(LayoutInflater.from(context), this, true)

//    fun setPokeName(text: String) {
//        binding.pokemonName.text = text
//    }
//
//    fun setPokeType(type: String) {
//        binding.pokemonType.text = type
//    }
//
//    fun setPokeStype(sType: String) {
//        binding.pokemonSecondType.text = sType
//    }
//
//    fun setPokeImage(image: Drawable) {
//        binding.pokemonImg.setImageDrawable(image)
//    }



}
