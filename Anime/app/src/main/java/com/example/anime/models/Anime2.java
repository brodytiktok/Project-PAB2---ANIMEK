package com.example.anime.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Anime2 {
    @SerializedName("animes")
    private List<Anime> animes;

    @SerializedName("characters")
    private List<Character> characters;

    public Anime2() {
    }

    public List<Anime> getAnimes() {
        return animes;
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
