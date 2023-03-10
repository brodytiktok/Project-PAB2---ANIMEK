package com.example.anime.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.anime.R;
import com.example.anime.Utilities.APIUtil;
import com.example.anime.Utilities.ItemClickListener;
import com.example.anime.databinding.ListCharactersBinding;
import com.example.anime.model.API.APIResponse;
import com.example.anime.model.API.AnimeCharacter;
import com.example.anime.model.API.AnimeCharacter2;

import java.util.List;

//
//public class AdapterCharacters extends RecyclerView.Adapter<AdapterCharacters.CardViewHolder> {
//
//    @NonNull
//    @Override
//    public AdapterCharacters.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull AdapterCharacters.CardViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class CardViewHolder extends RecyclerView.ViewHolder {
//
//        public CardViewHolder(@NonNull View itemView) {
//            super(itemView);
//        }
//    }
//}
public class AdapterCharacters extends RecyclerView.Adapter<AdapterCharacters.ListViewHolder>{
    private List<AnimeCharacter2> character;

    public AdapterCharacters() {
    }

    public void setCharacter(List<AnimeCharacter2> character) {
        this.character = character;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterCharacters.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListViewHolder(ListCharactersBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCharacters.ListViewHolder holder, int position) {
        AnimeCharacter2 result = character.get(position);
        holder.binding.tvCharacter.setText(result.getNama_character());
        Glide.with(holder.itemView.getContext())
                .load(result.getFoto_character())
                .into(holder.binding.ivCharacter);
        holder.binding.tvVa.setText(result.getNama_seiyuu());
        Glide.with(holder.itemView.getContext())
                .load(result.getFoto_seiyuu())
                .into(holder.binding.ivVa);
    }

    @Override
    public int getItemCount() {
        return character.size();
    }

    public class ListViewHolder extends  RecyclerView.ViewHolder{
        private ListCharactersBinding binding;
        public ListViewHolder(ListCharactersBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
