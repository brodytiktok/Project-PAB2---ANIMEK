package com.example.anime.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anime.databinding.ItemForumBinding;
import com.example.anime.model.API.APIResponse;
import com.example.anime.model.API.Anime;
import com.example.anime.model.Firebase.Forum;
import com.example.anime.model.Firebase.User;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class AdapterForum extends FirebaseRecyclerAdapter<Forum, AdapterForum.ForumViewHolder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    private Forum model;

    public AdapterForum(@NonNull FirebaseRecyclerOptions<Forum> options) {
        super(options);
    }

    public void setAdapterForum(Forum model) {
        this.model = model;
        notifyDataSetChanged();
    }

    @Override
    protected void onBindViewHolder(@NonNull AdapterForum.ForumViewHolder holder, int position, @NonNull Forum model) {
        holder.binding.itemForumCivContent.setText(model.getContent());
        FirebaseDatabase
                .getInstance()
                .getReference()
                .child("users")
                .child(model.getUser_id())
                .get()
                .addOnCompleteListener(task ->
                {
                    if (task.isSuccessful()) {
                        User user = task.getResult().getValue(User.class);
                        holder.binding.itemForumCivUsername.setText(user.getFullName());
                    }
                });
    }

    @NonNull
    @Override
    public AdapterForum.ForumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ForumViewHolder(ItemForumBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    public class ForumViewHolder extends RecyclerView.ViewHolder {
        private ItemForumBinding binding;

        public ForumViewHolder(ItemForumBinding binding){
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
