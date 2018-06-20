package com.centerm.baseproject.dto;

import com.alibaba.fastjson.JSONArray;

import java.math.BigDecimal;
import java.util.List;

public class ProjectDetailInfo {

    private Integer insuranceCode; //险种id

    private Integer pCode; //父险种id(保额、缴费年限、保费同父险种)

    private String name;//险种名称

    private Integer defaultCoverage; //险种默认保额，若为0 ，说明可自定义保额

    private BigDecimal insuranceCoverage; //保额

    private BigDecimal firstYearPremium; //首年保费

    private BigDecimal premiumFactorPerAge; //年龄增加1岁保费增加的额度(原保费百分比)

    private BigDecimal femalePremium; //女性保费：若保额可自定义则该保费值为保额百分比，否则为保费（最小投保年龄，趸交）

    private BigDecimal manPremium;  //男性保费：若保额可自定义则该保费值为保额百分比，否则为保费（最小投保年龄，趸交）

    private Integer paySpan; //缴费年限

    private JSONArray expire; //保障年限：75（岁） +30（30年）

    private Integer isNecessary; //是否必选 1：必选 0：非必选

    private Integer isSelected; //是否已选 1：已选 0：未选

    private Integer templateType; //该险种模板类型

    private List<Integer> paySpanList; //该险种可选缴费年限

    public Integer getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }

    public Integer getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(Integer insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public Integer getpCode() {
        return pCode;
    }

    public void setpCode(Integer pCode) {
        this.pCode = pCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPaySpanList() {
        return paySpanList;
    }

    public void setPaySpanList(List<Integer> paySpanList) {
        this.paySpanList = paySpanList;
    }

    public JSONArray getExpire() {
        return expire;
    }

    public void setExpire(JSONArray expire) {
        this.expire = expire;
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

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public Integer getDefaultCoverage() {
        return defaultCoverage;
    }

    public void setDefaultCoverage(Integer defaultCoverage) {
        this.defaultCoverage = defaultCoverage;
    }

    public BigDecimal getPremiumFactorPerAge() {
        return premiumFactorPerAge;
    }

    public void setPremiumFactorPerAge(BigDecimal premiumFactorPerAge) {
        this.premiumFactorPerAge = premiumFactorPerAge;
    }

    public Integer getIsNecessary() {
        return isNecessary;
    }

    public void setIsNecessary(Integer isNecessary) {
        this.isNecessary = isNecessary;
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

    public Integer getPaySpan() {
        return paySpan;
    }

    public void setPaySpan(Integer paySpan) {
        this.paySpan = paySpan;
    }
}
