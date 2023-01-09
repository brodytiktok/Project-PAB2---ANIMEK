package com.example.anime.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.anime.R;
import com.example.anime.databinding.ActivityMainBinding;
import com.example.anime.fragments.AnimeFragment;
import com.example.anime.fragments.ForumFragment;
import com.example.anime.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private BottomNavigationView bvmmenu;
    private FrameLayout flContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new AnimeFragment());

        binding.mainBnvContainer.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bnm_item_home:
                    replaceFragment(new AnimeFragment());
                    break;
                case R.id.bnm_item_forum:
                    replaceFragment(new ForumFragment());
                    break;
                case R.id.bnm_item_profile:
                    replaceFragment(new ProfileFragment());
                    break;
            };


            return true;
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_fl_container, fragment);
        fragmentTransaction.commit();
    };
}