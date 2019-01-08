package com.qfedu.entity;

public class Menutypetbl {
    private Integer mId;

    private String mName;

    private Integer mFlag;

    private Integer mParent;

    private Integer mType;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmFlag() {
        return mFlag;
    }

    public void setmFlag(Integer mFlag) {
        this.mFlag = mFlag;
    }

    public Integer getmParent() {
        return mParent;
    }

    public void setmParent(Integer mParent) {
        this.mParent = mParent;
    }

    public Integer getmType() {
        return mType;
    }

    public void setmType(Integer mType) {
        this.mType = mType;
    }
}