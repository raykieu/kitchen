package com.qfedu.entity;

public class Option {
    private Integer oId;

    private String oA;

    private String oB;

    private String oC;

    private String oD;

    private String oE;

    private Integer cId;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getoA() {
        return oA;
    }

    public void setoA(String oA) {
        this.oA = oA == null ? null : oA.trim();
    }

    public String getoB() {
        return oB;
    }

    public void setoB(String oB) {
        this.oB = oB == null ? null : oB.trim();
    }

    public String getoC() {
        return oC;
    }

    public void setoC(String oC) {
        this.oC = oC == null ? null : oC.trim();
    }

    public String getoD() {
        return oD;
    }

    public void setoD(String oD) {
        this.oD = oD == null ? null : oD.trim();
    }

    public String getoE() {
        return oE;
    }

    public void setoE(String oE) {
        this.oE = oE == null ? null : oE.trim();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}