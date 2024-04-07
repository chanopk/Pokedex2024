package com.chanop.pokedex2024.model


import com.google.gson.annotations.SerializedName

data class PokedexModel(
    @SerializedName("descriptions")
    val descriptions: List<Description> = listOf(),
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("is_main_series")
    val isMainSeries: Boolean? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("names")
    val names: List<Name>? = null,
    @SerializedName("pokemon_entries")
    val pokemonEntries: List<PokemonEntry> = listOf(),
    @SerializedName("region")
    val region: Region? = null,
    @SerializedName("version_groups")
    val versionGroups: List<VersionGroup> = listOf()
)