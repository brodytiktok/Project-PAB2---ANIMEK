package com.example.anime.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anime.model.FirebaseForum.Post;
import com.example.anime.model.FirebaseForum.ValueData;

import java.util.List;
import java.util.zip.Inflater;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.ViewHolder> {
    private ValueData<List<Post>> post;
    ItemClickListener<Post> itemClickListener;

    public interface ItemClickListener<T> {
        void itemClick(T data, int position);
    }
    public AdapterPost(ItemClickListener<Post> itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
    public void setPost(List<Post> post) {
        this.post = post;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ListAdapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterPost.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
