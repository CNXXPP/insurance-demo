package com.centerm.baseproject.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InsuranceProjectMaster implements Serializable {
    private Integer id;

    private Integer defaultGender;

    private Integer defaultAge;

    private String projectName;

    private BigDecimal firstYearPremium;

    private Integer holderMinAge;

    private Integer holderMaxAge;

    private Integer payerMinAge;

    private Integer payerMaxAge;

    private Integer isAttach;

    private String introduce;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDefaultGender() {
        return defaultGender;
    }

    public void setDefaultGender(Integer defaultGender) {
        this.defaultGender = defaultGender;
    }

    public Integer getDefaultAge() {
        return defaultAge;
    }

    public void setDefaultAge(Integer defaultAge) {
        this.defaultAge = defaultAge;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public BigDecimal getFirstYearPremium() {
        return firstYearPremium;
    }

    public void setFirstYearPremium(BigDecimal firstYearPremium) {
        this.firstYearPremium = firstYearPremium;
    }

    public Integer getHolderMinAge() {
        return holderMinAge;
    }

    public void setHolderMinAge(Integer holderMinAge) {
        this.holderMinAge = holderMinAge;
    }

    public Integer getHolderMaxAge() {
        return holderMaxAge;
    }

    public void setHolderMaxAge(Integer holderMaxAge) {
        this.holderMaxAge = holderMaxAge;
    }

    public Integer getPayerMinAge() {
        return payerMinAge;
    }

    public void setPayerMinAge(Integer payerMinAge) {
        this.payerMinAge = payerMinAge;
    }

    public Integer getPayerMaxAge() {
        return payerMaxAge;
    }

    public void setPayerMaxAge(Integer payerMaxAge) {
        this.payerMaxAge = payerMaxAge;
    }

    public Integer getIsAttach() {
        return isAttach;
    }

    public void setIsAttach(Integer isAttach) {
        this.isAttach = isAttach;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
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
        sb.append(", defaultGender=").append(defaultGender);
        sb.append(", defaultAge=").append(defaultAge);
        sb.append(", projectName=").append(projectName);
        sb.append(", firstYearPremium=").append(firstYearPremium);
        sb.append(", holderMinAge=").append(holderMinAge);
        sb.append(", holderMaxAge=").append(holderMaxAge);
        sb.append(", payerMinAge=").append(payerMinAge);
        sb.append(", payerMaxAge=").append(payerMaxAge);
        sb.append(", isAttach=").append(isAttach);
        sb.append(", introduce=").append(introduce);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}