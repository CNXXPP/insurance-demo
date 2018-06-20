package com.centerm.baseproject.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FinalProjectDetail implements Serializable {
    private Integer id;

    private String masterProjectId;

    private Integer insuranceCode;

    private BigDecimal insuranceCoverage;

    private BigDecimal firstYearPremium;

    private String paySpan;

    private String insuranceSpan;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMasterProjectId() {
        return masterProjectId;
    }

    public void setMasterProjectId(String masterProjectId) {
        this.masterProjectId = masterProjectId == null ? null : masterProjectId.trim();
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

    public BigDecimal getFirstYearPremium() {
        return firstYearPremium;
    }

    public void setFirstYearPremium(BigDecimal firstYearPremium) {
        this.firstYearPremium = firstYearPremium;
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
        sb.append(", insuranceCode=").append(insuranceCode);
        sb.append(", insuranceCoverage=").append(insuranceCoverage);
        sb.append(", firstYearPremium=").append(firstYearPremium);
        sb.append(", paySpan=").append(paySpan);
        sb.append(", insuranceSpan=").append(insuranceSpan);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}