package com.gabrielmartins.pokedex_android.domain

import java.net.URL

data class Pokemon(
    val number: Int,
    val name: String,
    val types: List<PokemonType>
) {
    val formattedName = name.capitalize()

    val formattedNumber = number.toString().padStart(3, '0')

    val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png"
}

