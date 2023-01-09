package com.example.anime.model.Firebase;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Forum implements Parcelable {

    @SerializedName("user_id")
    private String user_id;

    @SerializedName("content")
    private String content;

    @SerializedName("posted_at")
    private String posted_at;

    protected Forum(Parcel in) {
        user_id = in.readString();
        content = in.readString();
        posted_at = in.readString();
    }

    public static final Creator<Forum> CREATOR = new Creator<Forum>() {
        @Override
        public Forum createFromParcel(Parcel in) {
            return new Forum(in);
        }

        @Override
        public Forum[] newArray(int size) {
            return new Forum[size];
        }
    };

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPosted_at() {
        return posted_at;
    }

    public void setPosted_at(String posted_at) {
        this.posted_at = posted_at;
    }

    public Forum(String user_id, String content, String posted_at) {
        this.user_id = user_id;
        this.content = content;
        this.posted_at = posted_at;
    }

    public Forum(String content) {
        this.content = content;
    }

    public Forum() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(user_id);
        parcel.writeString(content);
        parcel.writeString(posted_at);
    }
}
