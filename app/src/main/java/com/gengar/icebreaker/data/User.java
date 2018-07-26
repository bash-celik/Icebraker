package com.gengar.icebreaker.data;

public class User {
    private String mAlias;
    private String mPhoto;
    private String mStatus;

    public User(String mAlias, String mStatus) {
        this.mAlias = mAlias;
        this.mStatus = mStatus;
    }

    public String getmAlias() {
        return mAlias;
    }

    public void setmAlias(String mAlias) {
        this.mAlias = mAlias;
    }

    public String getmPhoto() {
        return mPhoto;
    }

    public void setmPhoto(String mPhoto) {
        this.mPhoto = mPhoto;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }
}
