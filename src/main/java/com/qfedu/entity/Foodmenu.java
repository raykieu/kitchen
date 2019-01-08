package com.qfedu.entity;

public class Foodmenu {
    private Integer mId;

    private String mInfo;

    private String mMaterials;

    private String mImgurl;

    private String mText;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmInfo() {
        return mInfo;
    }

    public void setmInfo(String mInfo) {
        this.mInfo = mInfo == null ? null : mInfo.trim();
    }

    public String getmMaterials() {
        return mMaterials;
    }

    public void setmMaterials(String mMaterials) {
        this.mMaterials = mMaterials == null ? null : mMaterials.trim();
    }

    public String getmImgurl() {
        return mImgurl;
    }

    public void setmImgurl(String mImgurl) {
        this.mImgurl = mImgurl == null ? null : mImgurl.trim();
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText == null ? null : mText.trim();
    }
}