package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

//import com.anime.R;
import com.bumptech.glide.Glide;
import com.example.anime.model.API.APIResponse;
import com.example.anime.model.API.APIUtil;
import com.example.anime.model.API.Anime;
import com.example.anime.model.API.Anime2;
import com.example.anime.model.API.AnimeCharacter;
import com.example.anime.model.API.AnimeGenre;
import com.example.anime.model.API.AnimeGenre2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Anime_Detail extends AppCompatActivity {
    public static int ANIME_ID = 1;
    private AnimeCharacter animeCharacter;
    private Anime2 anime2;
    private Anime anime;
    private AnimeGenre2 animeGenre2;
    private ImageView ivAnime;
    private TextView tvAnime, tvGenre, tvDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anime_detail);
        ivAnime = findViewById(R.id.iv_fanime);
        tvAnime = findViewById(R.id.tv_anime);
        tvGenre = findViewById(R.id.tv_genre);
        tvDesc = findViewById(R.id.tv_description);

        APIUtil.getRetrofit().create(APIService.class).showAnime(ANIME_ID).enqueue(new Callback<APIResponse<List<Anime2>>>() {
            @Override
            public void onResponse(Call<APIResponse<List<Anime2>>> call, Response<APIResponse<List<Anime2>>> response) {
                if(response.isSuccessful()){
                    Anime2 anime2 = response.body().getData().get(0);
                    Anime anime = anime2.getAnimes().get(0);
                    AnimeCharacter animeCharacter = anime2.getCharacters().get(0);

                    tvAnime.setText(anime.getJudul_anime());
                    tvDesc.setText(anime.getDeskripsi_anime());
                    APIUtil.getRetrofit().create(APIService.class).showAnimeGenre(ANIME_ID).enqueue(new Callback<APIResponse<List<AnimeGenre2>>>() {
                        @Override
                        public void onResponse(Call<APIResponse<List<AnimeGenre2>>> call, Response<APIResponse<List<AnimeGenre2>>> response) {
                            AnimeGenre2 animeGenre2 = response.body().getData().get(0);
                            tvGenre.setText(animeGenre2.getNama_genre());
                            Log.d("tasta", "onResponse: "+anime2);
                        }

                        @Override
                        public void onFailure(Call<APIResponse<List<AnimeGenre2>>> call, Throwable t) {

                        }
                    });
                } else {

                }


            }

            @Override
            public void onFailure(Call<APIResponse<List<Anime2>>> call, Throwable t) {

            }
        });

    }
}