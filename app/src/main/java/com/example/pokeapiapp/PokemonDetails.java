package com.example.pokeapiapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetails {

    @JsonProperty("stats")
    private List<PokemonStat> stats;

    @JsonProperty("name")
    private String name;

    @JsonProperty("sprites")
    private Sprites sprites;

    public String getName() { return name; }
    public String getImageUrl() { return sprites.frontDefault; }

    public List<PokemonStat> getStats() {
        return stats != null ? stats : Collections.emptyList();
    }

}
