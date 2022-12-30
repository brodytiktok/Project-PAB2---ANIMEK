package com.example.anime.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Anime implements Parcelable {
    @SerializedName("id")
    private long id;

    @SerializedName("foto_anime")
    private String foto_anime;

    @SerializedName("judul_anime")
    private String judul_anime;

    @SerializedName("deskripsi_anime")
    private String deskripsi_anime;

    protected Anime(Parcel in) {
        id = in.readLong();
        foto_anime = in.readString();
        judul_anime = in.readString();
        deskripsi_anime = in.readString();
    }

    public static final Creator<Anime> CREATOR = new Creator<Anime>() {
        @Override
        public Anime createFromParcel(Parcel in) {
            return new Anime(in);
        }

        @Override
        public Anime[] newArray(int size) {
            return new Anime[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeString(foto_anime);
        parcel.writeString(judul_anime);
        parcel.writeString(deskripsi_anime);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFoto_anime() {
        return foto_anime;
    }

    public void setFoto_anime(String foto_anime) {
        this.foto_anime = foto_anime;
    }

    public String getJudul_anime() {
        return judul_anime;
    }

    public void setJudul_anime(String judul_anime) {
        this.judul_anime = judul_anime;
    }

    public String getDeskripsi_anime() {
        return deskripsi_anime;
    }

    public void setDeskripsi_anime(String deskripsi_anime) {
        this.deskripsi_anime = deskripsi_anime;
    }

    public Anime() {

    }

    public Anime(long id, String foto_anime, String judul_anime, String deskripsi_anime) {
        this.id = id;
        this.foto_anime = foto_anime;
        this.judul_anime = judul_anime;
        this.deskripsi_anime = deskripsi_anime;
    }
}
