package com.example.anime.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.anime.R;

public class AnimeDetail extends AppCompatActivity {
    ImageView ivAnime;
    TextView tvTanime, tvDesc, tvGerne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anime_detail);
        ivAnime = findViewById(R.id.iv_anime);
        tvTanime = findViewById(R.id.tv_tanime);
        tvDesc = findViewById(R.id.tv_desc);
        tvGerne = findViewById(R.id.tv_gerne);

        Intent terima = getIntent();
        String vkAnime = terima.getStringExtra("varVK"); // Visual Key
        String jdAnime = terima.getStringExtra("varTAnime"); // Judul Anime
        String gerne = terima.getStringExtra("varGerne"); // Gerne
        String deskripsi = terima.getStringExtra("varDesc"); // Deskripsi

        getSupportActionBar().setTitle(jdAnime);

        tvTanime.setText(jdAnime);
        tvGerne.setText(gerne);
        tvDesc.setText(deskripsi);
        Glide.with(AnimeDetail.this)
                .load(vkAnime)
                .into(ivAnime);

    }
}