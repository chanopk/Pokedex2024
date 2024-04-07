package com.chanop.pokedex2024.model


import com.google.gson.annotations.SerializedName

data class Name(
    @SerializedName("language")
    val language: Language? = null,
    @SerializedName("name")
    val name: String? = null
)