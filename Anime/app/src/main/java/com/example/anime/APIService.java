package com.example.anime;

import com.example.anime.models.APIResponse;
import com.example.anime.models.Anime;
import com.example.anime.models.Sender;
import com.example.anime.models.ViewData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {
    @POST("fcm/send")
    Call<ViewData> sendNotification(@Body Sender body);

    @GET("anime")
    Call<APIResponse<List<Anime>>> getAllAnime();

    @POST("anime")
    @FormUrlEncoded
    Call<APIResponse<Anime>> createAnime(@Field("foto_anime") String foto_anime,
                                       @Field("judul_anime") String judul_anime,
                                       @Field("deskripsi_anime") String deskripsi_anime);

    @GET("anime/{id}")
    Call<APIResponse<List<Anime>>> showAnime(@Path("id") long id);

    @POST("anime/{id}/update")
    @FormUrlEncoded
    Call<APIResponse<Anime>> updateAnime(@Field("foto_anime") String foto_anime,
                                         @Field("judul_anime") String judul_anime,
                                         @Field("deskripsi_anime") String deskripsi_anime);

    @GET("anime/{id}/delete")
    Call<APIResponse<List<Anime>>> deleteAnime(@Path("id") long id);

    @GET("genre")
    Call<APIResponse<List<Anime>>> getAllGenre();

    @POST("genre")
    @FormUrlEncoded
    Call<APIResponse<Anime>> createGenre(@Field("nama_genre") String nama_genre);

    @GET("genre/{id}")
    Call<APIResponse<List<Anime>>> showGenre(@Path("id") long id);

    @POST("genre/{id}/update")
    @FormUrlEncoded
    Call<APIResponse<Anime>> updateGenre(@Field("nama_genre") String nama_genre);

    @GET("genre/{id}/delete")
    Call<APIResponse<List<Anime>>> deleteGenre(@Path("id") long id);

}
