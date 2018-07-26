package com.gengar.icebreaker.ui.chat;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;
import com.gengar.icebreaker.R;
import com.gengar.icebreaker.data.User;
import com.gengar.icebreaker.ui.utils.ImageUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChatViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.user_alias)
    TextView mUserAlias;

    @BindView(R.id.user_status)
    TextView mUserStatus;

    @BindView(R.id.user_avatar)
    ImageView mUserAvatar;

    public ChatViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bind(final User user, RequestManager glide){
        mUserAlias.setText(user.getmAlias());
        mUserStatus.setText(user.getmStatus());

        if(!TextUtils.isEmpty(user.getmPhoto())){
            ImageUtils.loadImage(glide,mUserAvatar,user.getmPhoto());
        }
    }
}
