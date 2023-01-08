package com.acr.animecommunityroom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.acr.animecommunityroom.model.API.Anime;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class AdapterAnime extends RecyclerView.Adapter<AdapterAnime.ViewHolder> {
    private List<Anime> data = new ArrayList<>();

    public void setData(List<Anime> data) {
        this.data = data;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public AdapterAnime.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_anime, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAnime.ViewHolder holder, int position) {
        int pos = holder.getAdapterPosition();
        Anime anime = data.get(pos);
        holder.tvJudulAnime.setText(anime.getJudul_anime());

        Glide.with(holder.itemView.getContext())
                .load(data.get(position).getFoto_anime())
                .load(holder.ivFoto);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudulAnime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.iv_anime);
            tvJudulAnime = itemView.findViewById(R.id.tv_anime);
        }
    }
}
