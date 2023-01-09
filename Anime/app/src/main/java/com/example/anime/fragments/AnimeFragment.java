package com.example.anime.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.anime.R;
import com.example.anime.Utilities.APIService;
import com.example.anime.Utilities.APIUtil;
import com.example.anime.Utilities.ItemClickListener;
import com.example.anime.activites.Anime_Detail;
import com.example.anime.adapter.AdapterAnime;
import com.example.anime.databinding.FragmentAnimeBinding;
import com.example.anime.model.API.APIResponse;
import com.example.anime.model.API.Anime;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AnimeFragment extends Fragment {

    private AdapterAnime adapterAnime;
    private ItemClickListener<Anime> itemClickListener;

    private FragmentAnimeBinding binding;


    public AnimeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnimeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();

        APIUtil.getRetrofit().create(APIService.class).getAllAnime().enqueue(new Callback<APIResponse<List<Anime>>>() {
            @Override
            public void onResponse(Call<APIResponse<List<Anime>>> call, Response<APIResponse<List<Anime>>> response) {
                if(response.isSuccessful()){
                    itemClickListener = new ItemClickListener<Anime>() {
                        @Override
                        public void itemClick(Anime data, int position) {
                            Intent intent = new Intent(getActivity(), Anime_Detail.class);
                            intent.putExtra("dataAnime",data);
                            startActivity(intent);
                        }
                    };
                    adapterAnime = new AdapterAnime(itemClickListener);
                    adapterAnime.setAnimeAdapter(response.body());
                    RecyclerView rv = binding.rvAnime;
                    rv.setLayoutManager(new LinearLayoutManager(getActivity()));
                    rv.setAdapter(adapterAnime);
                } else {
                    Toast.makeText(getActivity(),"Response failed", Toast.LENGTH_SHORT);

                }
            }

            @Override
            public void onFailure(Call<APIResponse<List<Anime>>> call, Throwable t) {

            }
        });
    }
}