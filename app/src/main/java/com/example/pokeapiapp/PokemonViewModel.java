package com.example.pokeapiapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class PokemonViewModel extends ViewModel {
    private List<String> allPokemonNames = new ArrayList<>();
    private List<String> likedPokemon = new ArrayList<>();
    private List<String> dislikedPokemon = new ArrayList<>();
    public MutableLiveData<String> currentPokemonName = new MutableLiveData<>();

    public void init(List<String> names) {
        allPokemonNames.addAll(names);
        loadNextPokemon();
    }

    public void loadNextPokemon() {
        if (!allPokemonNames.isEmpty()) {
            currentPokemonName.setValue(allPokemonNames.remove(0));
        }
    }

    public void addToLiked(String name) {
        likedPokemon.add(name);
    }

    public void addToDisliked(String name) {
        dislikedPokemon.add(name);
    }
}
