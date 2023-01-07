package com.example.anime;

import com.example.anime.model.API.APIResponse;
import com.example.anime.model.API.Anime;
import com.example.anime.model.API.Anime2;
import com.example.anime.model.API.AnimeCharacter;
import com.example.anime.model.API.AnimeGenre;
import com.example.anime.model.API.AnimeGenre2;
import com.example.anime.model.API.Genre;
import com.example.anime.model.API.Seiyuu;
import com.example.anime.model.Firebase.Sender;
import com.example.anime.model.Firebase.ViewData;

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
    Call<APIResponse<List<Anime2>>> showAnime(@Path("id") long id);

    @POST("anime/{id}/update")
    @FormUrlEncoded
    Call<APIResponse<Anime>> updateAnime(@Path("id") long id,
                                         @Field("foto_anime") String foto_anime,
                                         @Field("judul_anime") String judul_anime,
                                         @Field("deskripsi_anime") String deskripsi_anime);

    @GET("anime/{id}/delete")
    Call<APIResponse<List<Anime>>> deleteAnime(@Path("id") long id);



    @GET("genre")
    Call<APIResponse<List<Genre>>> getAllGenre();

    @POST("genre")
    @FormUrlEncoded
    Call<APIResponse<Genre>> createGenre(@Field("nama_genre") String nama_genre);

    @GET("genre/{id}")
    Call<APIResponse<List<Genre>>> showGenre(@Path("id") long id);

    @POST("genre/{id}/update")
    @FormUrlEncoded
    Call<APIResponse<Genre>> updateGenre(@Path("id") long id,
                                         @Field("nama_genre") String nama_genre);

    @GET("genre/{id}/delete")
    Call<APIResponse<List<Genre>>> deleteGenre(@Path("id") long id);



    @GET("seiyuu")
    Call<APIResponse<List<Seiyuu>>> getAllSeiyuu();

    @POST("seiyuu")
    @FormUrlEncoded
    Call<APIResponse<Seiyuu>> createSeiyuu(@Field("foto_seiyuu") String foto_seiyuu,
                                         @Field("nama_seiyuu") String nama_seiyuu);

    @GET("seiyuu/{id}")
    Call<APIResponse<List<Seiyuu>>> showSeiyuu(@Path("id") long id);

    @POST("seiyuu/{id}/update")
    @FormUrlEncoded
    Call<APIResponse<Seiyuu>> updateSeiyuu(@Path("id") long id,
                                           @Field("foto_seiyuu") String foto_seiyuu,
                                           @Field("nama_seiyuu") String nama_seiyuu);

    @GET("seiyuu/{id}/delete")
    Call<APIResponse<List<Seiyuu>>> deleteSeiyuu(@Path("id") long id);



    @GET("character")
    Call<APIResponse<List<AnimeCharacter>>> getAllAnimeCharacter();

    @POST("character")
    @FormUrlEncoded
    Call<APIResponse<AnimeCharacter>> createAnimeCharacter(@Field("id_seiyuu") long id_seiyuu,
                                                           @Field("id_anime") long id_anime,
                                                           @Field("foto_character") String foto_character,
                                                           @Field("nama_character") String nama_character);

    @GET("character/{id}")
    Call<APIResponse<List<AnimeCharacter>>> showAnimeCharacter(@Path("id") long id);

    @POST("character/{id}/update")
    @FormUrlEncoded
    Call<APIResponse<AnimeCharacter>> updateAnimeCharacter(@Path("id") long id,
                                                           @Field("id_anime") long id_anime,
                                                           @Field("id_seiyuu") long id_seiyuu,
                                                           @Field("foto_character") String foto_character,
                                                           @Field("nama_character") String nama_character);

    @GET("character/{id}/delete")
    Call<APIResponse<List<AnimeCharacter>>> deleteAnimeCharacter(@Path("id") long id);



    @GET("animegenre")
    Call<APIResponse<List<AnimeGenre>>> getAllAnimeGenre();

    @POST("animegenre")
    @FormUrlEncoded
    Call<APIResponse<AnimeGenre>> createAnimeGenre(@Field("id_genre") long id_genre,
                                                   @Field("id_anime") long id_anime);

    @GET("animegenre/{id}")
    Call<APIResponse<List<AnimeGenre2>>> showAnimeGenre(@Path("id") long id);

    @POST("animegenre/{id}/update")
    @FormUrlEncoded
    Call<APIResponse<AnimeGenre>> updateAnimeGenre(@Path("id") long id,
                                                   @Field("id_genre") long id_genre,
                                                   @Field("id_anime") long id_anime);

    @GET("animegenre/{id}/delete")
    Call<APIResponse<List<AnimeGenre>>> deleteAnimeGenre(@Path("id") long id);

}
