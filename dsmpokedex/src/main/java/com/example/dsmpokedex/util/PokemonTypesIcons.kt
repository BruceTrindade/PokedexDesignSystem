package com.example.dsmpokedex.util

import com.example.dsmpokedex.R

object PokemonTypesIcons {
    fun getIconPoke(type: String): Int {
        return when (type) {
            "grass", "bug" -> R.drawable.leaf
            "fire" -> R.drawable.flame
            "electric" -> R.drawable.lightning
            "water" -> R.drawable.drop
            "poison" -> R.drawable.poison
            else -> R.drawable.pokeball
        }
    }
}
