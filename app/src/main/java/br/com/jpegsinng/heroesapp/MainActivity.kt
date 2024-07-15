package br.com.jpegsinng.heroesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.jpegsinng.heroesapp.ui.theme.HeroesappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HeroesappTheme {
                HeroesScreen()
                FavoritesScreen()
                AboutScreen()
            }
        }
    }
}




