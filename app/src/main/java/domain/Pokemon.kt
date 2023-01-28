package domain

import java.util.*

data class Pokemon(
    val number: Int? = null,
    val name: String,
    val types: List<PokemonType>
) {
    val formattedName = name.capitalize(Locale.ROOT)
    val formattedNumber = number.toString().padStart(3,'0')
    val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png"
}