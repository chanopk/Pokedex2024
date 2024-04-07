package com.chanop.pokedex2024

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chanop.pokedex2024.model.PokedexModel
import com.chanop.pokedex2024.service.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class KantoViewModel: ViewModel() {
    private val apiService = RetrofitInstance.api

    val pokedexState = MutableStateFlow<PokedexModel>(PokedexModel())

    // Update the state using methods or coroutines
    fun updatePokedexState(newValue: PokedexModel) {
        pokedexState.value = newValue
    }

    fun getPokemonKanto() {
        viewModelScope.launch {
            try {
                val response = apiService.getPokemonKanto()
                updatePokedexState(response)
            } catch (e: Exception) {
                // Handle errors here
                updatePokedexState(PokedexModel())
            }
        }
    }
}