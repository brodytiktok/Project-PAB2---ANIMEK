package com.example.anime.model.FirebaseForum;

import com.example.anime.model.FirebaseForum.Post;
import com.example.anime.model.FirebaseForum.ValueData;
import com.example.anime.model.FirebaseForum.ValueNoData;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIForum {
    @POST("loginUser")
    @FormUrlEncoded
    Call<ValueNoData> login(@Field("key") String key,
                            @Field("name") String name,
                            @Field("password") String password);

    // (2)
    @POST("registerUser")
    @FormUrlEncoded
    Call<ValueNoData> register(@Field("key") String key,
                               @Field("username") String username,
                               @Field("password") String password);

    // (3)
    @POST("getAllPost")
    @FormUrlEncoded
    Call<ValueData<Post>> getAllPost(@Field("key") String key);

    // (4)
    @POST("insertPost")
    @FormUrlEncoded
    Call<ValueNoData> insert(@Field("key") String key,
                             @Field("username") String username,
                             @Field("content") String content);

    // (5)
    @POST("updatePost")
    @FormUrlEncoded
    Call<ValueNoData> update(@Field("key") String key,
                             @Field("id") int id,
                             @Field("content") String content);

    // (6)
    @POST("deletePost")
    @FormUrlEncoded
    Call<ValueNoData> delete(@Field("key") String key,
                             @Field("id") int id);
}
