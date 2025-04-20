package com.example.pokeapiapp;

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseCallback<T> implements Callback<T> {
    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        Log.d("tag", response.body().toString());
//        List<ItemPokemon> items = response.body().getClass();

    }

    @Override
    public void onFailure(Call<T> call, Throwable throwable) {
        Log.d("tag", throwable.getMessage());
    }
}
