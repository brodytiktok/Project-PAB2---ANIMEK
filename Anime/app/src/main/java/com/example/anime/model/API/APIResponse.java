package com.example.anime.model.API;

public class APIResponse<T> {
    private int status;
    private String pesan;
    private T data;

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return pesan;
    }

    public T getData() {
        return data;
    }
}