package com.example.pokeapiapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonService {
        @GET("pokemon/ditto")
        Call<Pokemon> listRepos();

        @GET("pokemon")
        Call<ItemsList> getPokemonList(
                @Query("limit") int limit,
                @Query("offset") int offset);
        @GET("pokemon/{name}")
        Call<Pokemon> getPokemonDetails(@Path("name") String name);
}
