package com.example.dsmpokedex

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.dsmpokedex.databinding.CardViewPokeBinding

class CardViewPoke @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttr: Int = 0
) : ViewGroup(context, attrs, defStyleAttr) {

    private val binding = CardViewPokeBinding
        .inflate(LayoutInflater.from(context), this, true)

    override fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) {
        TODO("Not yet implemented")
    }
}
