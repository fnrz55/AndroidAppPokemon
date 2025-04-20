package com.example.pokeapiapp;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class NetworkClient {
    private static NetworkClient instance = null;

    public static NetworkClient getInstance() {
        if (instance == null) {
            instance = new NetworkClient();
        }

        return instance;
    }

    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(JacksonConverterFactory.create())
            .build();


    public PokemonService getPokemonService(){
        return retrofit.create(PokemonService.class);
    }
}
