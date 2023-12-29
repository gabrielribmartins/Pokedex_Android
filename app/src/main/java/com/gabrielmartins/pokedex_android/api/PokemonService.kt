package com.gabrielmartins.pokedex_android.api

import android.telecom.Call
import com.gabrielmartins.pokedex_android.api.model.PokemonApiResult
import com.gabrielmartins.pokedex_android.api.model.PokemonsApiResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface PokemonService {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): retrofit2.Call<PokemonsApiResult>

    @GET("pokemon/{number}")
    fun getPokemon(@Path("number") number: Int): retrofit2.Call<PokemonApiResult>
}