package com.example.anime.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.anime.databinding.ListAnimeBinding;
import com.example.anime.model.API.APIResponse;
import com.example.anime.model.API.Anime;

import java.util.List;
public class AdapterAnime extends RecyclerView.Adapter<AdapterAnime.CardViewHolder> {
    private APIResponse<List<Anime>> anime;
    private ItemClickListener<Anime> itemClickListener;

    public interface ItemClickListener<T> {
        void itemClick(T data, int position);
    }
    public AdapterAnime(ItemClickListener<Anime> itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setAnimeAdapter(APIResponse<List<Anime>> anime) {
        this.anime = anime;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterAnime.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CardViewHolder(ListAnimeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAnime.CardViewHolder holder, int position) {
        Anime result = anime.getData().get(position);
        holder.binding.tvAnime.setText("Anime : "+ result.getJudul_anime());
        Glide.with(holder.itemView.getContext())
                .load(result.getFoto_anime())
                .into(holder.binding.ivAnime);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClickListener.itemClick(result, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return anime.getData().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        private ListAnimeBinding binding;

        public CardViewHolder(@NonNull ListAnimeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}