package com.fzq.EecelImport.entity;

public class TbmInfo {
    private Integer id;

    private String code;

    private String tbmModel;

    private Integer tbmType;

    private Double diameter;

    private Double deviceLen;

    private Double deviceWeight;

    private Double devicePower;

    private String cutterSpeed;

    private Integer motorNum;

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

    public String getTbmModel() {
        return tbmModel;
    }

    public void setTbmModel(String tbmModel) {
        this.tbmModel = tbmModel == null ? null : tbmModel.trim();
    }

    public Integer getTbmType() {
        return tbmType;
    }

    public void setTbmType(Integer tbmType) {
        this.tbmType = tbmType;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getDeviceLen() {
        return deviceLen;
    }

    public void setDeviceLen(Double deviceLen) {
        this.deviceLen = deviceLen;
    }

    public Double getDeviceWeight() {
        return deviceWeight;
    }

    public void setDeviceWeight(Double deviceWeight) {
        this.deviceWeight = deviceWeight;
    }

    public Double getDevicePower() {
        return devicePower;
    }

    public void setDevicePower(Double devicePower) {
        this.devicePower = devicePower;
    }

    public String getCutterSpeed() {
        return cutterSpeed;
    }

    public void setCutterSpeed(String cutterSpeed) {
        this.cutterSpeed = cutterSpeed == null ? null : cutterSpeed.trim();
    }

    public Integer getMotorNum() {
        return motorNum;
    }

    public void setMotorNum(Integer motorNum) {
        this.motorNum = motorNum;
    }
}