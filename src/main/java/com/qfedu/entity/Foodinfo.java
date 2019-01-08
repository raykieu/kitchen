package com.qfedu.entity;

public class Foodinfo {
    private Integer fId;

    private Integer mId;

    private Double fPrice;

    private String fInfo;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Double getfPrice() {
        return fPrice;
    }

    public void setfPrice(Double fPrice) {
        this.fPrice = fPrice;
    }

    public String getfInfo() {
        return fInfo;
    }

    public void setfInfo(String fInfo) {
        this.fInfo = fInfo == null ? null : fInfo.trim();
    }
}