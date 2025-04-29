package com.example.pokeapiapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Sprites {
    @JsonProperty("front_default")
    public String frontDefault;
}
