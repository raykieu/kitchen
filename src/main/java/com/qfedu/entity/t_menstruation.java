package com.qfedu.entity;

import java.util.Date;

public class t_menstruation {
    private Long mid;

    private Integer menstrualCycle;

    private Integer menstrualDays;

    private Date recently;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Integer getMenstrualCycle() {
        return menstrualCycle;
    }

    public void setMenstrualCycle(Integer menstrualCycle) {
        this.menstrualCycle = menstrualCycle;
    }

    public Integer getMenstrualDays() {
        return menstrualDays;
    }

    public void setMenstrualDays(Integer menstrualDays) {
        this.menstrualDays = menstrualDays;
    }

    public Date getRecently() {
        return recently;
    }

    public void setRecently(Date recently) {
        this.recently = recently;
    }
}