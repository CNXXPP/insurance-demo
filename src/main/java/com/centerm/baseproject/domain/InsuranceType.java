package com.centerm.baseproject.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InsuranceType implements Serializable {
    private Integer id;

    private String name;

    private Integer isSub;

    private String code;

    private String introduce;

    private Integer companyId;

    private String expire;

    private BigDecimal premiumFactorPerAge;

    private BigDecimal femalePremium;

    private BigDecimal manPremium;

    private Integer defaultCoverage;

    private Integer templateType;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

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

    public Integer getIsSub() {
        return isSub;
    }

    public void setIsSub(Integer isSub) {
        this.isSub = isSub;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire == null ? null : expire.trim();
    }

    public BigDecimal getPremiumFactorPerAge() {
        return premiumFactorPerAge;
    }

    public void setPremiumFactorPerAge(BigDecimal premiumFactorPerAge) {
        this.premiumFactorPerAge = premiumFactorPerAge;
    }

    public BigDecimal getFemalePremium() {
        return femalePremium;
    }

    public void setFemalePremium(BigDecimal femalePremium) {
        this.femalePremium = femalePremium;
    }

    public BigDecimal getManPremium() {
        return manPremium;
    }

    public void setManPremium(BigDecimal manPremium) {
        this.manPremium = manPremium;
    }

    public Integer getDefaultCoverage() {
        return defaultCoverage;
    }

    public void setDefaultCoverage(Integer defaultCoverage) {
        this.defaultCoverage = defaultCoverage;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
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
        sb.append(", name=").append(name);
        sb.append(", isSub=").append(isSub);
        sb.append(", code=").append(code);
        sb.append(", introduce=").append(introduce);
        sb.append(", companyId=").append(companyId);
        sb.append(", expire=").append(expire);
        sb.append(", premiumFactorPerAge=").append(premiumFactorPerAge);
        sb.append(", femalePremium=").append(femalePremium);
        sb.append(", manPremium=").append(manPremium);
        sb.append(", defaultCoverage=").append(defaultCoverage);
        sb.append(", templateType=").append(templateType);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}