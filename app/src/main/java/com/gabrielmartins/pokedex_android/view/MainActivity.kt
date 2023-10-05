package com.gabrielmartins.pokedex_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrielmartins.pokedex_android.R
import com.gabrielmartins.pokedex_android.api.PokemonRepository
import com.gabrielmartins.pokedex_android.domain.Pokemon
import com.gabrielmartins.pokedex_android.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val charmander = Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png",
            4,
            "Charmander",
            listOf(PokemonType("Fire"))
        )

        val pokemons = listOf(charmander,charmander,charmander,charmander,charmander,)

        val pokemonsApi = PokemonRepository.listPokemons()

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapater(pokemons)
    }
}