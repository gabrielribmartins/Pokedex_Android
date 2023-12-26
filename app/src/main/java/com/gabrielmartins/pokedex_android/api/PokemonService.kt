package com.gabrielmartins.pokedex_android.api

import android.telecom.Call
import androidx.viewpager2.widget.ViewPager2.OffscreenPageLimit
import com.gabrielmartins.pokedex_android.api.model.PokemonApiResult
import com.gabrielmartins.pokedex_android.api.model.PokemonsApiResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface PokemonService {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<PokemonsApiResult>

    @GET("pokemon/{number}")
    fun getPokemon(@Path("number") number: Int): Call<PokemonApiResult>
}