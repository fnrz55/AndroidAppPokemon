package com.example.pokeapiapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsList {
    @JsonProperty("results")
    private ArrayList<ItemPokemon> results;

    @JsonProperty("count")
    private int count;

    public int getCount() {
        return count;
    }

    public ArrayList<ItemPokemon> getResult() {
        return results;
    }
}
