package com.example.anime.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anime.databinding.ItemChatBinding;

public class ChatViewHolder extends RecyclerView.ViewHolder {
    public ItemChatBinding itemChatBinding;

    public ChatViewHolder(@NonNull ItemChatBinding itemChatBinding) {
        super(itemChatBinding.getRoot());

        this.itemChatBinding = itemChatBinding;
    }
}
