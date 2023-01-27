package api

import api.model.PokemonApiResult
import api.model.PokemonsApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonService {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int) : Call<PokemonsApiResult>

    @GET("pokemon/{number}")
    fun getPokemon(number:Int): Call<PokemonApiResult>

}