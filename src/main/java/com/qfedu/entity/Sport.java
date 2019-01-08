package com.qfedu.entity;

public class Sport {
    private Integer sId;

    private String sInfo;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsInfo() {
        return sInfo;
    }

    public void setsInfo(String sInfo) {
        this.sInfo = sInfo == null ? null : sInfo.trim();
    }
}