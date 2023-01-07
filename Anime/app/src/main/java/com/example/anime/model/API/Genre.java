package com.example.anime.model.API;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Genre implements Parcelable {

    @SerializedName("id")
    private long id;

    @SerializedName("nama_genre")
    private String nama_genre;

    protected Genre(Parcel in) {
        id = in.readLong();
        nama_genre = in.readString();
    }

    public static final Creator<Genre> CREATOR = new Creator<Genre>() {
        @Override
        public Genre createFromParcel(Parcel in) {
            return new Genre(in);
        }

        @Override
        public Genre[] newArray(int size) {
            return new Genre[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeString(nama_genre);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama_genre() {
        return nama_genre;
    }

    public void setNama_genre(String nama_genre) {
        this.nama_genre = nama_genre;
    }

    public Genre() {
    }

    public Genre(long id, String nama_genre) {
        this.id = id;
        this.nama_genre = nama_genre;
    }
}
