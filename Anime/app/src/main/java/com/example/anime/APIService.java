package com.example.anime;

import com.example.anime.models.Sender;
import com.example.anime.models.ViewData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {
    @POST("fcm/send")
    Call<ViewData> sendNotification(@Body Sender body);
}
