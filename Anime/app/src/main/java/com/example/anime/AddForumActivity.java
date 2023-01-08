package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.anime.databinding.ActivityAddForumBinding;

import org.w3c.dom.Text;

public class AddForumActivity extends AppCompatActivity {
    private ActivityAddForumBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddForumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = binding.etContent.getText().toString();

                boolean goPost = true;

                if (TextUtils.isEmpty(content)) {
                    goPost = false;
                    binding.etContent.setError("Forum Tidak Boleh Kosong!");
                } if (goPost) {

                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void addPost(String username, String content) {

    }
}