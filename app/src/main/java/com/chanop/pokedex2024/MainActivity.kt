package com.chanop.pokedex2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chanop.pokedex2024.ui.theme.Pokedex2024Theme

class MainActivity : ComponentActivity() {

    private val viewModel: KantoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Pokedex2024Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(viewModel = viewModel)

                    DisposableEffect(Unit) {
                        viewModel.getPokemonKanto()
                        onDispose {}
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier, viewModel: KantoViewModel) {
    val pokedex by viewModel.pokedexState.collectAsState()

    LazyColumn {
        items(pokedex.pokemonEntries) { pokemonEntries ->
            Text(
                text = "${pokemonEntries.pokemonSpecies?.name}",
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pokedex2024Theme {
//        Greeting(viewModel)
    }
}