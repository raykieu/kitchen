package com.qfedu.entity;

import java.util.Date;

public class Attendance {
    private Integer qId; //签到Id

    private String qMark; //签到信息

    private Integer qCount; //总签到数

    private Integer qContinuesign; //七天连续签到

    private Date qCreatetime; //创建时间

    private Date qUpdatetime; //更新时间

    private Double qMoney; //签到奖金

    private Integer qUid;

    public Integer getqUid() {
        return qUid;
    }

    public void setqUid(Integer qUid) {
        this.qUid = qUid;
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqMark() {
        return qMark;
    }

    public void setqMark(String qMark) {
        this.qMark = qMark == null ? null : qMark.trim();
    }

    public Integer getqCount() {
        return qCount;
    }

    public void setqCount(Integer qCount) {
        this.qCount = qCount;
    }

    public Integer getqContinuesign() {
        return qContinuesign;
    }

    public void setqContinuesign(Integer qContinuesign) {
        this.qContinuesign = qContinuesign;
    }

    public Date getqCreatetime() {
        return qCreatetime;
    }

    public void setqCreatetime(Date qCreatetime) {
        this.qCreatetime = qCreatetime;
    }

    public Date getqUpdatetime() {
        return qUpdatetime;
    }

    public void setqUpdatetime(Date qUpdatetime) {
        this.qUpdatetime = qUpdatetime;
    }

    public Double getqMoney() {
        return qMoney;
    }

    public void setqMoney(Double qMoney) {
        this.qMoney = qMoney;
    }
}