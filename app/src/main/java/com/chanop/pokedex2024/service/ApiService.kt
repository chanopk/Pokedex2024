package com.chanop.pokedex2024.service

import com.chanop.pokedex2024.model.PokedexModel
import retrofit2.http.GET

interface ApiService {
    @GET("/api/v2/pokedex/2/")
    suspend fun getPokemonKanto(): PokedexModel
}