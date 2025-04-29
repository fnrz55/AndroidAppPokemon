package com.example.pokeapiapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatInfo {
    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

}
