package com.example.anime.adapter;

import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.anime.R;
import com.example.anime.activity.AnimeDetail;

public class AdapterAnime extends RecyclerView.Adapter<AdapterAnime.CardViewHolder> {
    @NonNull
    @Override
    public AdapterAnime.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_anime, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAnime.CardViewHolder holder, int position) {
//        holder.tvTanime.setText();
//        holder.tvGerne.setText();
//        holder.tvDesc.setText();


//        Glide.with(holder.itemView.getContext())
//                .load()
//                .apply(new RequestOptions().override())
//                .into(holder.ivAnime);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent kirim = new Intent(holder.itemView.getContext(), AnimeDetail.class);
                kirim.putExtra("varVK",0);
                kirim.putExtra("varTAnime", 0);
                kirim.putExtra("varGerne", 0);
                kirim.putExtra("varDesc", 0);
                holder.itemView.getContext().startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView ivAnime;
        TextView tvTanime, tvDesc, tvGerne;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAnime = itemView.findViewById(R.id.iv_anime);
            tvTanime = itemView.findViewById(R.id.tv_tanime);
            tvDesc = itemView.findViewById(R.id.tv_desc);
            tvGerne = itemView.findViewById(R.id.tv_gerne);
        }
    }
}
