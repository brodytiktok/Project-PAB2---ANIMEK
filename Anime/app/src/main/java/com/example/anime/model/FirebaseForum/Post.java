package com.example.anime.model.FirebaseForum;

import android.os.Parcel;

public class Post {
    private int id;
    private String content, user_id, created_date, modified_Date, username;

    public Post() {

    }

    protected Post(Parcel in) {
        id = in.readInt();
        content = in.readString();
        user_id = in.readString();
        created_date = in.readString();
        modified_Date = in.readString();
        username = in.readString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getModified_Date() {
        return modified_Date;
    }

    public void setModified_Date(String modified_Date) {
        this.modified_Date = modified_Date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
