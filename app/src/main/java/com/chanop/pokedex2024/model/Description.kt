package com.chanop.pokedex2024.model


import com.chanop.pokedex2024.model.Language
import com.google.gson.annotations.SerializedName

data class Description(
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("language")
    val language: Language? = null
)