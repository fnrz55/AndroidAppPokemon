package com.example.pokeapiapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseCallback<T> implements Callback<T> {
    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.body() instanceof ItemsList) {
            ItemsList itemsList = (ItemsList) response.body();
            ArrayList<ItemPokemon> items = itemsList.getResult();
            List<String> names = new ArrayList<>();
            int count = itemsList.getCount();
            Log.d("tag", "onResponse: " + count);

            if (items == null) {
                Log.e("tag", "Pokemon list is NULL!");
                return;
            }
            for (ItemPokemon item : items) {
                names.add(item.getName());
            }
            Log.d("tag", "Names: " + names.toString());
        } else if (response.body() instanceof PokemonDetails) {
            PokemonDetails currentPokemon = (PokemonDetails) response.body();

            Log.d("tag", "pokemon name: " + currentPokemon.getName());
            Log.d("tag", "pokemon img: " + currentPokemon.getImageUrl());


        } else {
            Log.d("tag", "Unexpected response type");
        }

    }

    @Override
    public void onFailure(Call<T> call, Throwable throwable) {
        Log.d("tag", throwable.getMessage());
    }
}
