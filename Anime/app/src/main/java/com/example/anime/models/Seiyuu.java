package com.example.anime.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Seiyuu implements Parcelable {

    @SerializedName("id")
    private long id;

    @SerializedName("foto_seiyuu")
    private String foto_seiyuu;

    @SerializedName("nama_seiyuu")
    private String nama_seiyuu;

    protected Seiyuu(Parcel in) {
        id = in.readLong();
        foto_seiyuu = in.readString();
        nama_seiyuu = in.readString();
    }

    public static final Creator<Seiyuu> CREATOR = new Creator<Seiyuu>() {
        @Override
        public Seiyuu createFromParcel(Parcel in) {
            return new Seiyuu(in);
        }

        @Override
        public Seiyuu[] newArray(int size) {
            return new Seiyuu[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeString(foto_seiyuu);
        parcel.writeString(nama_seiyuu);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFoto_seiyuu() {
        return foto_seiyuu;
    }

    public void setFoto_seiyuu(String foto_seiyuu) {
        this.foto_seiyuu = foto_seiyuu;
    }

    public String getNama_seiyuu() {
        return nama_seiyuu;
    }

    public void setNama_seiyuu(String nama_seiyuu) {
        this.nama_seiyuu = nama_seiyuu;
    }

    public Seiyuu() {
    }

    public Seiyuu(long id, String foto_seiyuu, String nama_seiyuu) {
        this.id = id;
        this.foto_seiyuu = foto_seiyuu;
        this.nama_seiyuu = nama_seiyuu;
    }
}
