package com.gengar.icebreaker.ui.base;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.gengar.icebreaker.R;
import com.gengar.icebreaker.data.User;
import com.gengar.icebreaker.ui.chat.ChatAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    @BindView(R.id.recycler)
    RecyclerView mRecycler;

    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discovery,container,false);
        ButterKnife.bind(this,view);
        setAdapter(mRecycler);
        loadUsers(mockUsers());
        return view;
    }

    protected void setAdapter(RecyclerView recyclerView){
        recyclerView.setAdapter(new ChatAdapter(Glide.with(this)));
        setLayoutManager(recyclerView);
    }
    protected void setLayoutManager(RecyclerView recyclerView){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    protected void loadUsers(List<User> list){
        ((ChatAdapter)mRecycler.getAdapter()).setUsers(list);
    }

    private List<User> mockUsers(){
        List<User> users = new ArrayList<>();

        users.add(new User("gengar",getString(R.string.user_status)));
        users.add(new User("baneizalfe",getString(R.string.user_status)));
        users.add(new User("baneizpola",getString(R.string.user_status)));
        users.add(new User("acanik84",getString(R.string.user_status)));
        users.add(new User("maksa",getString(R.string.user_status)));

        return users;
    }
}
