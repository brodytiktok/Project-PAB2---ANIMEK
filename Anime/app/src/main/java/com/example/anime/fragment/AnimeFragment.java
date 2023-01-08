package com.example.anime.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anime.APIService;
import com.example.anime.R;
import com.example.anime.Utility;
import com.example.anime.model.API.APIResponse;
import com.example.anime.model.API.APIUtil;
import com.example.anime.model.API.Anime;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AnimeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AnimeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AnimeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AnimeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AnimeFragment newInstance(String param1, String param2) {
        AnimeFragment fragment = new AnimeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        APIUtil.getRetrofit().create(APIService.class).getAllAnime().enqueue(new Callback<APIResponse<List<Anime>>>() {
            @Override
            public void onResponse(Call<APIResponse<List<Anime>>> call, Response<APIResponse<List<Anime>>> response) {
                Utility.getmRetrofit().create(APIService.class).getAllAnime().enqueue(new Callback<APIResponse<List<Anime>>>() {
                    @Override
                    public void onResponse(Call<APIResponse<List<Anime>>> call, Response<APIResponse<List<Anime>>> response) {
                        Anime anime = response.body().getData().get(0);
                        
                    }

                    @Override
                    public void onFailure(Call<APIResponse<List<Anime>>> call, Throwable t) {

                    }
                });
            }

            @Override
            public void onFailure(Call<APIResponse<List<Anime>>> call, Throwable t) {

            }
        });
        return inflater.inflate(R.layout.fragment_anime, container, false);
    }
}