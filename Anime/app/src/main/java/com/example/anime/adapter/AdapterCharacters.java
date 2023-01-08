package com.example.anime.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anime.R;
import com.example.anime.model.API.APIUtil;

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
public class AdapterCharacters extends RecyclerView.Adapter<AdapterCharacters.ListViewHolder {
    private APIUtil<List<Character>> character;
    private AdapterView.OnItemClickListener<Character> itemClickListener;

    public AdapterCharacters(AdapterView.OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setCharacter(APIUtil<List<Character>> character) {
        this.character = character;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterCharacters.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_characters, parent, false);

        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCharacters.ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends  RecyclerView.ViewHolder{
        public ListViewHolder(View view) {
            super(view);

        }
    }
}
