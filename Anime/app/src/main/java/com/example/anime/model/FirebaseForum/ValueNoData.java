package com.example.anime.model.FirebaseForum;

public class ValueNoData {
    // penamaan variabel harus sama dengan yang ada di api
    private int success;
    private String message;

    //tidak perlu setter karena kita tidak perlu ngeset data
    public int getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
