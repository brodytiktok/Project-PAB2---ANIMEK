package com.example.anime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anime.adapter.AdapterPost;

import com.example.anime.model.API.APIUtil;
import com.example.anime.model.FirebaseForum.APIForum;
import com.example.anime.model.FirebaseForum.ForumUtility;
import com.example.anime.model.FirebaseForum.Post;
import com.example.anime.model.FirebaseForum.ValueData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentForum extends Fragment {
    RecyclerView recyclerView;
    private AdapterPost adapterPost;
    private List<Post> post = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_forum, container, false);
//        binding = ActivityForumBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
//        View view = binding.getRoot();
//        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_post);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        APIForum api = ForumUtility.getmRetrofit().create(APIForum.class);
        api.getAllPost().enqueue(new Callback<ValueData<Post>>() {
            @Override
            public void onResponse(Call<ValueData<Post>> call, Response<ValueData<Post>> response) {
                if (response.code() ==200){
                    int success = response.body().getSuccess();
                    String message = response.body().getMessage();
                    if (success ==1) {
                        post = response.body().getData();
                        adapterPost.setPost((ValueData<List<Post>>) post);
                    }
                }
            }

            @Override
            public void onFailure(Call<ValueData<Post>> call, Throwable t) {

            }
        });
    }
//    private void getAllPost(){
//        APIForum apiForum = ForumUtility.getmRetrofit().create(APIForum.class);
//        apiForum.getAllPost().enqueue(new Callback<ValueData<Post>>() {
//            @Override
//            public void onResponse(Call<ValueData<Post>> call, Response<ValueData<Post>> response) {
//                if (response.code() == 200) {
//                    int success = response.body().getSuccess();
//                    String message = response.body().getMessage();
//                    if (success == 1) {
//                        data = response.body().getData();
//                        adapterPost.
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ValueData<Post>> call, Throwable t) {
//
//            }
//        });
//    }

}