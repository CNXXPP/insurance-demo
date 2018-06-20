package com.centerm.baseproject.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InsuranceProjectDetail implements Serializable {
    private Integer id;

    private Integer masterProjectId;

    private Integer pId;

    private Integer insuranceCode;

    private BigDecimal insuranceCoverage;

    private Integer isNecessary;

    private Integer isSelected;

    private BigDecimal firstYearPremium;

    private Integer paySpan;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMasterProjectId() {
        return masterProjectId;
    }

    public void setMasterProjectId(Integer masterProjectId) {
        this.masterProjectId = masterProjectId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(Integer insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public BigDecimal getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(BigDecimal insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }

    public Integer getIsNecessary() {
        return isNecessary;
    }

    public void setIsNecessary(Integer isNecessary) {
        this.isNecessary = isNecessary;
    }

    public Integer getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }

    public BigDecimal getFirstYearPremium() {
        return firstYearPremium;
    }

    public void setFirstYearPremium(BigDecimal firstYearPremium) {
        this.firstYearPremium = firstYearPremium;
    }

    public Integer getPaySpan() {
        return paySpan;
    }

    public void setPaySpan(Integer paySpan) {
        this.paySpan = paySpan;
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
        sb.append(", masterProjectId=").append(masterProjectId);
        sb.append(", pId=").append(pId);
        sb.append(", insuranceCode=").append(insuranceCode);
        sb.append(", insuranceCoverage=").append(insuranceCoverage);
        sb.append(", isNecessary=").append(isNecessary);
        sb.append(", isSelected=").append(isSelected);
        sb.append(", firstYearPremium=").append(firstYearPremium);
        sb.append(", paySpan=").append(paySpan);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}