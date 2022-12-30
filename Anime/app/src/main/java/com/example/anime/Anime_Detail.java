package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Anime_Detail extends AppCompatActivity {
    //                Visual Key Anime
    private ImageView ivAnime;
    //             Judul Anime, Deskripsi Anime
    private TextView tvTAnime, tvDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anime_detail);
        ivAnime = findViewById(R.id.iv_anime);
        tvTAnime = findViewById(R.id.tv_tanime);
        tvDesc = findViewById(R.id.tv_desc);

        Intent terima = getIntent();
//        String judul_anime = terima.getDataString("varTitleAnime");
    }
}