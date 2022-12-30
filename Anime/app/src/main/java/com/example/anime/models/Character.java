package com.example.anime.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Character implements Parcelable {
    @SerializedName("id")
    private long id;

    @SerializedName("id_seiyuu")
    private long id_seiyuu;

    @SerializedName("foto_seiyuu")
    private String foto_seiyuu;

    @SerializedName("nama_character")
    private String nama_character;

    protected Character(Parcel in) {
        id = in.readLong();
        id_seiyuu = in.readLong();
        foto_seiyuu = in.readString();
        nama_character = in.readString();
    }

    public static final Creator<Character> CREATOR = new Creator<Character>() {
        @Override
        public Character createFromParcel(Parcel in) {
            return new Character(in);
        }

        @Override
        public Character[] newArray(int size) {
            return new Character[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeLong(id_seiyuu);
        parcel.writeString(foto_seiyuu);
        parcel.writeString(nama_character);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_seiyuu() {
        return id_seiyuu;
    }

    public void setId_seiyuu(long id_seiyuu) {
        this.id_seiyuu = id_seiyuu;
    }

    public String getFoto_seiyuu() {
        return foto_seiyuu;
    }

    public void setFoto_seiyuu(String foto_seiyuu) {
        this.foto_seiyuu = foto_seiyuu;
    }

    public String getNama_character() {
        return nama_character;
    }

    public void setNama_character(String nama_character) {
        this.nama_character = nama_character;
    }

    public Character() {
    }

    public Character(long id, long id_seiyuu, String foto_seiyuu, String nama_character) {
        this.id = id;
        this.id_seiyuu = id_seiyuu;
        this.foto_seiyuu = foto_seiyuu;
        this.nama_character = nama_character;
    }
}
