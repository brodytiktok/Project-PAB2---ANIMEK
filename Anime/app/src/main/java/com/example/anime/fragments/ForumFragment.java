package com.example.anime.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.anime.activites.AddForumActivity;
import com.example.anime.adapter.AdapterForum;
import com.example.anime.databinding.FragmentForumBinding;
import com.example.anime.model.Firebase.Forum;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ForumFragment extends Fragment {

    private FragmentForumBinding binding;
    private DatabaseReference mBase;
    private AdapterForum adapter;
    private RecyclerView rv;


    public ForumFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentForumBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBase = FirebaseDatabase.getInstance().getReference();
        rv = binding.rvPost;
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));


        binding.fabInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddForumActivity.class);
                startActivity(intent);
            }
        });

        FirebaseRecyclerOptions<Forum> options =
                new FirebaseRecyclerOptions.Builder<Forum>()
                        .setQuery(mBase.child("forum"), Forum.class)
                        .build();

        adapter = new AdapterForum(options);
        rv.setAdapter(adapter);

    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.startListening();

    }

    @Override
    public void onPause() {
        super.onPause();
        adapter.stopListening();


    }
}