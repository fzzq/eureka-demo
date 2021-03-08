package com.fzq.EecelImport.entity;

public class ProjTbmCode {
    private Integer id;

    private String code;

    private String plcAddr;

    private String tbmid;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPlcAddr() {
        return plcAddr;
    }

    public void setPlcAddr(String plcAddr) {
        this.plcAddr = plcAddr == null ? null : plcAddr.trim();
    }

    public String getTbmid() {
        return tbmid;
    }

    public void setTbmid(String tbmid) {
        this.tbmid = tbmid == null ? null : tbmid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}