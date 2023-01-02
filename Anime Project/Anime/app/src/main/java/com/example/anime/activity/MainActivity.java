package com.example.anime.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.anime.R;
import com.example.anime.fragment.AnimeFragment;
import com.example.anime.fragment.ForumFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bvmmenu;
    private FrameLayout flContainer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openFragment(new AnimeFragment());
        getSupportActionBar().setTitle("Anime");

        bvmmenu = findViewById(R.id.bnv_menu);
        flContainer = findViewById(R.id.fl_container);

        bvmmenu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fr;
                switch (item.getItemId()) {
                    case R.id.menu_anime:
                        openFragment(new AnimeFragment());
                        getSupportActionBar().setTitle("Anime");
                        return true;
                    case R.id.menu_forum:
                        openFragment(new ForumFragment());
                        getSupportActionBar().setTitle("Forum");
                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_nav_bottom, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void openFragment(Fragment frg) {
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.fl_container, frg);
        FT.commit();
    }
}