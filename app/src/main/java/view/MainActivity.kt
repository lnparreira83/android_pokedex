package view
//01h:19min
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import api.PokemonRepository
import com.example.myapplication.R
import domain.Pokemon
import domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val bulbasaur = Pokemon("https://i.pinimg.com/736x/1f/21/f2/1f21f25d27e1e74d44e4d6523311e10f--pokemon-umbreon-pokemon-go.jpg",2, "Bulbasaur",listOf(
                PokemonType("Water")
            )
        )

        val pokemons = listOf(
            bulbasaur,bulbasaur,bulbasaur
        )

        val pokemonsApi = PokemonRepository.listPokemons()

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}