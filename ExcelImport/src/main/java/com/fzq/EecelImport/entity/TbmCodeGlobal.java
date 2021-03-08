package com.fzq.EecelImport.entity;

public class TbmCodeGlobal {
    private Integer id;

    private String rootName;

    private String name;

    private String code;

    private String unit;

    private Integer ttm1;

    private Integer ttm2;

    private Integer ttm3;

    private Integer ttm4;

    private Integer ttm5;

    private String preCode;

    private String preName;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRootName() {
        return rootName;
    }

    public void setRootName(String rootName) {
        this.rootName = rootName == null ? null : rootName.trim();
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
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

    public String getPreCode() {
        return preCode;
    }

    public void setPreCode(String preCode) {
        this.preCode = preCode == null ? null : preCode.trim();
    }

    public String getPreName() {
        return preName;
    }

    public void setPreName(String preName) {
        this.preName = preName == null ? null : preName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}