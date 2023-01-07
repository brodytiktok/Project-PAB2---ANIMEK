package com.example.anime.model.API;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Anime2 {
    @SerializedName("animes")
    private List<Anime> animes;

    @SerializedName("characters")
    private List<AnimeCharacter> characters;

    public Anime2() {
    }

    public List<Anime> getAnimes() {
        return animes;
    }

    public List<AnimeCharacter> getCharacters() {
        return characters;
    }
}
