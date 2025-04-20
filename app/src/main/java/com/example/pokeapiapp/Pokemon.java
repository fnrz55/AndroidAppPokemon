package com.example.pokeapiapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon{

    @JsonProperty("id")
    public int id;
    @JsonProperty("height")
    public int height;
    @JsonProperty("name")
    public String name;


}
