package com.gengar.icebreaker.ui.chat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.RequestManager;
import com.gengar.icebreaker.R;
import com.gengar.icebreaker.data.User;

import java.util.ArrayList;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private RequestManager mGlide;
    private List<User> mUsers = new ArrayList<>();

    public ChatAdapter(RequestManager mGlide, List<User> users) {
        this.mGlide = mGlide;
        mUsers = users;
    }

    public ChatAdapter(RequestManager mGlide) {
        this.mGlide = mGlide;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_view_holder,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ChatViewHolder)holder).bind(mUsers.get(position),mGlide);
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public void setUsers(List<User> users) {
        mUsers = users;
        notifyDataSetChanged();
    }

    public void addUser(User user){
        mUsers.add(user);
        notifyItemChanged(mUsers.size()-1);
    }
}
