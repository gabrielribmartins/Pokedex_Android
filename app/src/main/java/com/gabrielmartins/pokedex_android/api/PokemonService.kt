package com.gabrielmartins.pokedex_android.api

import android.telecom.Call
import androidx.viewpager2.widget.ViewPager2.OffscreenPageLimit
import com.gabrielmartins.pokedex_android.api.model.PokemonApiResult
import retrofit2.http.GET
import retrofit2.http.Query


interface PokemonService {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<List<PokemonApiResult>

    @GET("pokemon/{number}")
    fun getPokemon(number: Int): Call<List<PokemonApiResult>

}