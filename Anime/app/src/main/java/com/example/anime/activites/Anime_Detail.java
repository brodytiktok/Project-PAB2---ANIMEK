package com.example.anime.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import com.anime.R;
import com.bumptech.glide.Glide;
import com.example.anime.Utilities.APIService;
import com.example.anime.R;
import com.example.anime.Utilities.ItemClickListener;
import com.example.anime.adapter.AdapterAnime;
import com.example.anime.adapter.AdapterCharacters;
import com.example.anime.databinding.ActivityMainBinding;
import com.example.anime.databinding.AnimeDetailBinding;
import com.example.anime.model.API.APIResponse;
import com.example.anime.Utilities.APIUtil;
import com.example.anime.model.API.Anime;
import com.example.anime.model.API.Anime2;
import com.example.anime.model.API.AnimeCharacter;
import com.example.anime.model.API.AnimeCharacter2;
import com.example.anime.model.API.AnimeGenre2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Anime_Detail extends AppCompatActivity {
    private AnimeDetailBinding binding;
    private Anime anime;
    private AnimeGenre2 animeGenre2;
    private AdapterCharacters adapterCharacters;
    private ItemClickListener<Anime> itemClickListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AnimeDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        anime = getIntent().getParcelableExtra("dataAnime");

        binding.tvAnime.setText(anime.getJudul_anime());
        binding.tvDescription.setText(anime.getDeskripsi_anime());
        Glide.with(Anime_Detail.this)
                .load(anime.getFoto_anime())
                .into(binding.ivFanime);

        APIUtil.getRetrofit().create(APIService.class).showAnime(anime.getId()).enqueue(new Callback<APIResponse<Anime2>>() {
            @Override
            public void onResponse(Call<APIResponse<Anime2>> call, Response<APIResponse<Anime2>> response) {
                Toast.makeText(Anime_Detail.this, response.body().getMessage(), Toast.LENGTH_SHORT);
                if (response.isSuccessful()){
                    List<AnimeCharacter2> animeCharacter2s = response.body().getData().getCharacters();
                    adapterCharacters = new AdapterCharacters();
                    adapterCharacters.setCharacter(animeCharacter2s);
                    RecyclerView rv = binding.rvCharva;
                    rv.setLayoutManager(new LinearLayoutManager(Anime_Detail.this));
                    rv.setAdapter(adapterCharacters);

                } else {

                }

            }

            @Override
            public void onFailure(Call<APIResponse<Anime2>> call, Throwable t) {

            }
        });

        APIUtil.getRetrofit().create(APIService.class).showAnimeGenre(anime.getId()).enqueue(new Callback<APIResponse<List<AnimeGenre2>>>() {
            @Override
            public void onResponse(Call<APIResponse<List<AnimeGenre2>>> call, Response<APIResponse<List<AnimeGenre2>>> response) {
                if (response.isSuccessful()){
                    List<AnimeGenre2> result = response.body().getData();
                    Log.d("TAG", "onResponse: "+result);

                    binding.tvGenre.setText(result.toString());
                }

            }

            @Override
            public void onFailure(Call<APIResponse<List<AnimeGenre2>>> call, Throwable t) {

            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}