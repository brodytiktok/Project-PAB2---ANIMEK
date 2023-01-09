package com.example.anime.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anime.databinding.ItemChatBinding;
import com.example.anime.model.FirebaseForum.Post;
import com.example.anime.model.FirebaseForum.ValueData;

import java.util.List;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.ViewHolder> {
    private ValueData<List<Post>> post;
    private ItemClickListener<Post> itemClickListener;

    public interface ItemClickListener<T> {
        void itemClick(T data, int position);
    }
    public AdapterPost(ItemClickListener<Post> itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
    public void setPost(ValueData<List<Post>> post) {
        this.post = post;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemChatBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterPost.ViewHolder holder, int position) {
        Post result = (Post) post.getData().get(position);
        holder.binding.tvUsername.setText("Username : " + result.getUsername());
        holder.binding.tvComment.setText("Comment : " + result.getUsername());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return post.getData().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemChatBinding binding;
        public ViewHolder(@NonNull ItemChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
