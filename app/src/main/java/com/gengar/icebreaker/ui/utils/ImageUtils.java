package com.gengar.icebreaker.ui.utils;

import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.gengar.icebreaker.R;

public class ImageUtils {
    public static void loadImage(RequestManager glide, ImageView imageView, String url){
        glide.load(url)
                .centerCrop()
                .crossFade()
                .placeholder(R.drawable.ic_profile)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }

}
