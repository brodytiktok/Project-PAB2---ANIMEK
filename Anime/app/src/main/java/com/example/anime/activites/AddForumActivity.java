package com.example.anime.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.anime.R;
import com.example.anime.databinding.ActivityAddForumBinding;
import com.example.anime.databinding.AnimeDetailBinding;
import com.example.anime.model.Firebase.Forum;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;

public class AddForumActivity extends AppCompatActivity {

    private ActivityAddForumBinding binding;
    private DatabaseReference mBase;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddForumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mBase = FirebaseDatabase.getInstance().getReference();

        mAuth = FirebaseAuth.getInstance();
        String userId = mAuth.getCurrentUser().getUid();


        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = binding.etContent.getText().toString();
                Long tsLong = System.currentTimeMillis()/1000;
                String time = tsLong.toString();
                Forum forum = new Forum(userId, content, time);
                mBase.child("forum").push().setValue(forum);

                finish();
            }
        });


    }
}