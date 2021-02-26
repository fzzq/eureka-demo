package com.fzq.EecelImport.entity;

public class TbmCodeClass {
    private Integer id;

    private String name;

    private String code;

    private Integer ttm1;

    private Integer ttm2;

    private Integer ttm3;

    private Integer ttm4;

    private Integer ttm5;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getTtm1() {
        return ttm1;
    }

    public void setTtm1(Integer ttm1) {
        this.ttm1 = ttm1;
    }

    public Integer getTtm2() {
        return ttm2;
    }

    public void setTtm2(Integer ttm2) {
        this.ttm2 = ttm2;
    }

    public Integer getTtm3() {
        return ttm3;
    }

    public void setTtm3(Integer ttm3) {
        this.ttm3 = ttm3;
    }

    public Integer getTtm4() {
        return ttm4;
    }

    public void setTtm4(Integer ttm4) {
        this.ttm4 = ttm4;
    }

    public Integer getTtm5() {
        return ttm5;
    }

    public void setTtm5(Integer ttm5) {
        this.ttm5 = ttm5;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "TbmCodeClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", ttm1=" + ttm1 +
                ", ttm2=" + ttm2 +
                ", ttm3=" + ttm3 +
                ", ttm4=" + ttm4 +
                ", ttm5=" + ttm5 +
                ", remark='" + remark + '\'' +
                '}';
    }
}