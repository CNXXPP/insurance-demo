package com.centerm.baseproject.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinalProjectMaster implements Serializable {
    private String id;

    private String holderName;

    private Integer holderGender;

    private Integer holderAge;

    private String holderBirthday;

    private String receiverName;

    private Integer receiverGender;

    private Integer projectId;

    private String paySpan;

    private String insuranceSpan;

    private BigDecimal firstYearPremium;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName == null ? null : holderName.trim();
    }

    public Integer getHolderGender() {
        return holderGender;
    }

    public void setHolderGender(Integer holderGender) {
        this.holderGender = holderGender;
    }

    public Integer getHolderAge() {
        return holderAge;
    }

    public void setHolderAge(Integer holderAge) {
        this.holderAge = holderAge;
    }

    public String getHolderBirthday() {
        return holderBirthday;
    }

    public void setHolderBirthday(String holderBirthday) {
        this.holderBirthday = holderBirthday == null ? null : holderBirthday.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public Integer getReceiverGender() {
        return receiverGender;
    }

    public void setReceiverGender(Integer receiverGender) {
        this.receiverGender = receiverGender;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getPaySpan() {
        return paySpan;
    }

    public void setPaySpan(String paySpan) {
        this.paySpan = paySpan == null ? null : paySpan.trim();
    }

    public String getInsuranceSpan() {
        return insuranceSpan;
    }

    public void setInsuranceSpan(String insuranceSpan) {
        this.insuranceSpan = insuranceSpan == null ? null : insuranceSpan.trim();
    }

    public BigDecimal getFirstYearPremium() {
        return firstYearPremium;
    }

    public void setFirstYearPremium(BigDecimal firstYearPremium) {
        this.firstYearPremium = firstYearPremium;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", holderName=").append(holderName);
        sb.append(", holderGender=").append(holderGender);
        sb.append(", holderAge=").append(holderAge);
        sb.append(", holderBirthday=").append(holderBirthday);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverGender=").append(receiverGender);
        sb.append(", projectId=").append(projectId);
        sb.append(", paySpan=").append(paySpan);
        sb.append(", insuranceSpan=").append(insuranceSpan);
        sb.append(", firstYearPremium=").append(firstYearPremium);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}