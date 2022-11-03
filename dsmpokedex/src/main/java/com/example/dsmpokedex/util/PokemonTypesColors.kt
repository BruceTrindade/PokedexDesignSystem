package com.example.dsmpokedex.util

import com.example.dsmpokedex.R

object PokemonTypesColors {
    fun getTypeColor(type: String): Int {
        return when (type) {
            "Grass", "Bug" -> R.color.bug_grass
            "Water", "Fighting", "Normal" -> R.color.water_fighting_normal
            "Poison", "Ghost" -> R.color.poison_ghost
            "Flying" -> R.color.flying
            "Ground", "Rock" -> R.color.rock_ground
            "Steel" -> R.color.steel
            "Fire" -> R.color.fire
            "Electric", "Psychic" -> R.color.electric_psychic
            "Ice" -> R.color.ice
            "Dragon" -> R.color.dragon
            "Fairy" -> R.color.fairy
            "Dark" -> R.color.dark
            else -> R.color.dragon
        }
    }
}
