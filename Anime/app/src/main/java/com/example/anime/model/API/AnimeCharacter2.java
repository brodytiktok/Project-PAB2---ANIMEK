package com.example.anime.model.API;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class AnimeCharacter2 implements Parcelable {
    @SerializedName("nama_character")
    private String nama_character;
    @SerializedName("foto_character")
    private String foto_character;
    @SerializedName("nama_seiyuu")
    private String nama_seiyuu;
    @SerializedName("foto_seiyuu")
    private String foto_seiyuu;

    protected AnimeCharacter2(Parcel in) {
        nama_character = in.readString();
        foto_character = in.readString();
        nama_seiyuu = in.readString();
        foto_seiyuu = in.readString();
    }

    public static final Creator<AnimeCharacter2> CREATOR = new Creator<AnimeCharacter2>() {
        @Override
        public AnimeCharacter2 createFromParcel(Parcel in) {
            return new AnimeCharacter2(in);
        }

        @Override
        public AnimeCharacter2[] newArray(int size) {
            return new AnimeCharacter2[size];
        }
    };

    public String getNama_character() {
        return nama_character;
    }

    public String getFoto_character() {
        return foto_character;
    }

    public String getNama_seiyuu() {
        return nama_seiyuu;
    }

    public String getFoto_seiyuu() {
        return foto_seiyuu;
    }

    public AnimeCharacter2() {
    }

    public AnimeCharacter2(String nama_character, String foto_character, String nama_seiyuu, String foto_seiyuu) {
        this.nama_character = nama_character;
        this.foto_character = foto_character;
        this.nama_seiyuu = nama_seiyuu;
        this.foto_seiyuu = foto_seiyuu;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_character);
        parcel.writeString(foto_character);
        parcel.writeString(nama_seiyuu);
        parcel.writeString(foto_seiyuu);
    }
}
