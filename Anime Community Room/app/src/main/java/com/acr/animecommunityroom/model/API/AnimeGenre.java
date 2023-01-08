package com.acr.animecommunityroom.model.API;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class AnimeGenre implements Parcelable {
    @SerializedName("id")
    private long id;

    @SerializedName("id_anime")
    private long id_anime;

    @SerializedName("id_genre")
    private long id_genre;

    protected AnimeGenre(Parcel in) {
        id = in.readLong();
        id_anime = in.readLong();
        id_genre = in.readLong();
    }

    public static final Creator<AnimeGenre> CREATOR = new Creator<AnimeGenre>() {
        @Override
        public AnimeGenre createFromParcel(Parcel in) {
            return new AnimeGenre(in);
        }

        @Override
        public AnimeGenre[] newArray(int size) {
            return new AnimeGenre[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeLong(id_anime);
        parcel.writeLong(id_genre);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_anime() {
        return id_anime;
    }

    public void setId_anime(long id_anime) {
        this.id_anime = id_anime;
    }

    public long getId_genre() {
        return id_genre;
    }

    public void setId_genre(long id_genre) {
        this.id_genre = id_genre;
    }

    public AnimeGenre() {
    }

    public AnimeGenre(long id, long id_anime, long id_genre) {
        this.id = id;
        this.id_anime = id_anime;
        this.id_genre = id_genre;
    }
}
