package com.gengar.icebreaker.ui.chat;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.gengar.icebreaker.R;
import com.gengar.icebreaker.ui.chat.discovery_fragment.DiscoveryFragment;
import com.gengar.icebreaker.ui.chat.recent_chat_fragmetn.RecentChatFragment;


public class ChatFragmentAdapter extends FragmentPagerAdapter {

    Context mContext;
    public ChatFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DiscoveryFragment();
            case 1:
                return new RecentChatFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getResources().getString(R.string.discovery_fragment_title);
            case 1:
                return mContext.getResources().getString(R.string.recent_chat_fragment_title);
            default:
                return "Hello, Friend";
        }
    }
}
