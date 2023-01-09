package com.example.anime.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.anime.activites.SignInActivity;
import com.example.anime.adapter.ChatViewHolder;
import com.example.anime.databinding.FragmentForumBinding;
import com.example.anime.databinding.ItemChatBinding;
import com.example.anime.model.Firebase.ChatMessage;
import com.example.anime.model.Firebase.User;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.firebase.ui.database.SnapshotParser;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForumFragment extends Fragment {

    private FragmentForumBinding binding;
    private FirebaseAuth mAuth;
    private DatabaseReference mRoot, mRef;
    private FirebaseRecyclerAdapter<ChatMessage, ChatViewHolder> mFirebaseAdapter;
    private String userId;
    private LinearLayoutManager mLinearLayoutManager;
    private String mUsername;

    public ForumFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() == null) {
            Intent intent = new Intent(getActivity(), SignInActivity.class);
            startActivity(intent);
        } else {

            FirebaseMessaging.getInstance().subscribeToTopic("messages");

            userId = mAuth.getCurrentUser().getUid();
            mRoot = FirebaseDatabase.getInstance().getReference();
            mRef = mRoot.child("users").child(userId);
            mRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    User user = dataSnapshot.getValue(User.class);
                    mUsername = user.getFullName();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    mUsername = "Anonymous";
                }
            });

            binding.rvPost.setItemAnimator(null);

            mLinearLayoutManager = new LinearLayoutManager(getActivity());
            mLinearLayoutManager.setStackFromEnd(true);
            binding.rvPost.setLayoutManager(mLinearLayoutManager);

            SnapshotParser<ChatMessage> parser = new SnapshotParser<ChatMessage>() {
                @NonNull
                @Override
                public ChatMessage parseSnapshot(@NonNull DataSnapshot snapshot) {
                    ChatMessage chatMessage = snapshot.getValue(ChatMessage.class);
                    if (chatMessage != null) {
                        chatMessage.setId(snapshot.getKey());
                    }
                    return chatMessage;
                }
            };

            mRef = mRoot.child("messages");
            FirebaseRecyclerOptions<ChatMessage> options = new FirebaseRecyclerOptions.Builder<ChatMessage>()
                    .setQuery(mRef, parser)
                    .build();

            mFirebaseAdapter = new FirebaseRecyclerAdapter<ChatMessage, ChatViewHolder>(options) {
                @Override
                protected void onBindViewHolder(@NonNull final ChatViewHolder holder, int position, @NonNull final ChatMessage model) {
                    mRoot.child("users").child(model.getSender()).addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            User user = dataSnapshot.getValue(User.class);

                            if (model.getSender().equals(userId)) {
                                holder.itemChatBinding.llReceiver.setVisibility(View.GONE);
                                holder.itemChatBinding.llSender.setVisibility(View.VISIBLE);

                                if (model.getText() != null) {
                                    holder.itemChatBinding.tvMessageSender.setText(model.getText());
                                    holder.itemChatBinding.tvMessageSender.setVisibility(View.VISIBLE);
                                    holder.itemChatBinding.ivMessageSender.setVisibility(View.GONE);
                                } else if (model.getImageUrl() != null) {
                                    String imageUrl = model.getImageUrl();
                                    if (imageUrl.startsWith("gs://")) {
                                        StorageReference storageReference = FirebaseStorage.getInstance().getReferenceFromUrl(imageUrl);
                                        storageReference.getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Uri> task) {
                                                if (task.isSuccessful()) {
                                                    String downloadUrl = task.getResult().toString();
                                                    Glide.with(holder.itemChatBinding.ivMessageSender.getContext())
                                                            .load(downloadUrl)
                                                            .into(holder.itemChatBinding.ivMessageSender);
                                                } else {
                                                    Log.w("TAG", "Getting download url failed!", task.getException());
                                                }
                                            }
                                        });
                                    } else {
                                        Glide.with(holder.itemChatBinding.ivMessageSender.getContext())
                                                .load(model.getImageUrl())
                                                .into(holder.itemChatBinding.ivMessageSender);
                                    }
                                    holder.itemChatBinding.ivMessageSender.setVisibility(View.VISIBLE);
                                    holder.itemChatBinding.tvMessageSender.setVisibility(View.GONE);
                                }

                                holder.itemChatBinding.tvSender.setText(user.getFullName());

//                                ColorGenerator generator = ColorGenerator.Companion.getMATERIAL();
//                                TextDrawable textDrawable = TextDrawable.builder()
//                                        .beginConfig()
//                                        .width(50)
//                                        .height(50)
//                                        .endConfig()
//                                        .buildRound(getInitialName(user.getFullName().toUpperCase()), generator.getColor(model.getSender()));

//                                holder.itemChatBinding.ivSender.setImageDrawable(textDrawable);
                            } else {
                                holder.itemChatBinding.llReceiver.setVisibility(View.VISIBLE);
                                holder.itemChatBinding.llSender.setVisibility(View.GONE);

                                if (model.getText() != null) {
                                    holder.itemChatBinding.tvMessageReceiver.setText(model.getText());
                                    holder.itemChatBinding.tvMessageReceiver.setVisibility(View.VISIBLE);
                                    holder.itemChatBinding.ivMessageReceiver.setVisibility(View.GONE);
                                } else if (model.getImageUrl() != null) {
                                    String imageUrl = model.getImageUrl();
                                    if (imageUrl.startsWith("gs://")) {
                                        StorageReference storageReference = FirebaseStorage.getInstance().getReferenceFromUrl(imageUrl);
                                        storageReference.getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Uri> task) {
                                                if (task.isSuccessful()) {
                                                    String downloadUrl = task.getResult().toString();
                                                    Glide.with(holder.itemChatBinding.ivMessageReceiver.getContext())
                                                            .load(downloadUrl)
                                                            .into(holder.itemChatBinding.ivMessageReceiver);
                                                } else {
                                                    Log.w("TAG", "Getting download url failed!", task.getException());
                                                }
                                            }
                                        });
                                    } else {
                                        Glide.with(holder.itemChatBinding.ivMessageReceiver.getContext())
                                                .load(model.getImageUrl())
                                                .into(holder.itemChatBinding.ivMessageReceiver);
                                    }
                                    holder.itemChatBinding.ivMessageReceiver.setVisibility(View.VISIBLE);
                                    holder.itemChatBinding.tvMessageReceiver.setVisibility(View.GONE);
                                }

                                holder.itemChatBinding.tvReceiver.setText(user.getFullName());

//                                ColorGenerator generator = ColorGenerator.Companion.getMATERIAL();
//                                TextDrawable textDrawable = TextDrawable.builder()
//                                        .beginConfig()
//                                        .width(50)
//                                        .height(50)
//                                        .endConfig()
//                                        .buildRound(getInitialName(user.getFullName().toUpperCase()), generator.getColor(model.getSender()));
//
//                                holder.itemChatBinding.ivReceiver.setImageDrawable(textDrawable);
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });
                }

                @NonNull
                @Override
                public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//                    return new ChatViewHolder(inflater.inflate(R.layout.item_chat, parent, false));
                    return new ChatViewHolder(ItemChatBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
                }

                @Override
                public void onDataChanged() {
                    super.onDataChanged();
//                    binding.progressBar.setVisibility(View.INVISIBLE);
                }
            };

            mFirebaseAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                @Override
                public void onItemRangeInserted(int positionStart, int itemCount) {
                    super.onItemRangeInserted(positionStart, itemCount);
                    int chatMessageCount = mFirebaseAdapter.getItemCount();
                    int lastVisiblePosition = mLinearLayoutManager.findLastCompletelyVisibleItemPosition();

                    if (lastVisiblePosition == -1 ||
                            (positionStart >= (chatMessageCount - 1) &&
                                    lastVisiblePosition == (positionStart - 1))) {
                        binding.rvPost.scrollToPosition(positionStart);
                    }
                }
            });

            binding.rvPost.setAdapter(mFirebaseAdapter);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentForumBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onResume() {
        super.onResume();
        mFirebaseAdapter.startListening();
    }

    @Override
    public void onPause() {
        mFirebaseAdapter.stopListening();
        super.onPause();
    }

}