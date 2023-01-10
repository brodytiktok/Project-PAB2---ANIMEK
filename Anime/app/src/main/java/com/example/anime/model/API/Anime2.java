package com.example.anime.model.API;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Anime2 {
    @SerializedName("animes")
    private Anime animes;

    @SerializedName("characters")
    private List<AnimeCharacter2> characters;

    public Anime2() {
    }

    public Anime getAnimes() {
        return animes;
    }

    public List<AnimeCharacter2> getCharacters() {
        return characters;
    }
}
