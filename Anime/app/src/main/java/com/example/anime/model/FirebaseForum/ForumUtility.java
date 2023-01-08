package com.example.anime.model.FirebaseForum;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ForumUtility {
    private static final String BASE_URL = "https://fcm.googleapis.com/";

    public static Retrofit mRetrofit;

    public static Retrofit getmRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }
}
