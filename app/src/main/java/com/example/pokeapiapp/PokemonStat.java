package com.example.pokeapiapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonStat {

    @JsonProperty("base_stat")
    private int baseStat;

    @JsonProperty("stat")
    private StatInfo statInfo;

    public String getStatName() {
        return statInfo != null ? statInfo.getName() : "";
    }

    public int getBaseStat() {
        return baseStat;
    }

}
