package com.acr.animecommunityroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.acr.animecommunityroom.model.API.APIResponse;
import com.acr.animecommunityroom.model.API.APIUtil;
import com.acr.animecommunityroom.model.API.Anime;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentAnime extends Fragment {

    RecyclerView recyclerView;
    private AdapterAnime adapterAnime;
    List<Anime> data = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_anime, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_anime);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        APIService api = APIUtil.getRetrofit().create(APIService.class);
        api.getAllAnime().enqueue(new Callback<APIResponse<List<Anime>>>() {
            @Override
            public void onResponse(Call<APIResponse<List<Anime>>> call, Response<APIResponse<List<Anime>>> response) {
                if (response.code() == 200) {
                    int success = response.body().getStatus();
                    String message = response.body().getMessage();
                    if (success == 1){
                        data = response.body().getData();
                        adapterAnime.setData(data);
                    }else {
                        Toast.makeText(FragmentAnime.this, message, Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<APIResponse<List<Anime>>> call, Throwable t) {

            }
        });
        // retrofit

    }
}