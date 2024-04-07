package com.chanop.pokedex2024.model


import com.google.gson.annotations.SerializedName

data class PokemonEntry(
    @SerializedName("entry_number")
    val entryNumber: Int? = null,
    @SerializedName("pokemon_species")
    val pokemonSpecies: PokemonSpecies? = null
)