package com.example.anime;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.anime.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private BottomNavigationView bvmmenu;
    private FrameLayout flContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
        setContentView(R.layout.activity_main);

        openFragment(new FragmentAnime());
        getSupportActionBar().setTitle("Anime");

        bvmmenu = findViewById(R.id.bnvmenu);
        flContainer = findViewById(R.id.fl_container);
        bvmmenu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment FR;
                switch (item.getItemId()) {
                    case R.id.menu_anime:
                        openFragment(new FragmentAnime());
//                        getActionBar().setTitle("Anime");
                        return true;
                    case R.id.menu_forum:
                        openFragment(new FragmentForum());
//                        getActionBar().setTitle("Forum");
                        return true;
                }
                return false;
            }
        });
//        binding.btnForum.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, ForumActivity.class);
//                startActivity(intent);
//            }
//        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_nav_bottom, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void openFragment(Fragment FRG) {
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.fl_container, FRG);
        FT.commit();
    }
}