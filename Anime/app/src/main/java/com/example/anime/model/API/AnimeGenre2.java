package com.example.anime.model.API;

import com.google.gson.annotations.SerializedName;

public class AnimeGenre2 {
    @SerializedName("nama_genre")
    private String nama_genre;

    public AnimeGenre2() {
    }

    public String getNama_genre() {
        return nama_genre;
    }
}
