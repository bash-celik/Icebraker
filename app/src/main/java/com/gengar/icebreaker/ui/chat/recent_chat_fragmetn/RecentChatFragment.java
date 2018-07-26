package com.gengar.icebreaker.ui.chat.recent_chat_fragmetn;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gengar.icebreaker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecentChatFragment extends Fragment {


    public RecentChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recent_chat, container, false);
    }

}
