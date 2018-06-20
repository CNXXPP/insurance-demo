package com.centerm.baseproject.dto;

import com.centerm.baseproject.domain.InsuranceResponsible;
import com.centerm.constant.validate.Insert;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

public class FinalProjectDetailInfo {

    private String name; //险种名称

    @NotNull(message = "险种code不能为null", groups = {Insert.class})
    private Integer insuranceCode; //险种code

    @NotNull(message = "保额不能为null", groups = {Insert.class})
    private BigDecimal insuranceCoverage; //保额

    @NotNull(message = "首年保费不能为null", groups = {Insert.class})
    private BigDecimal firstYearPremium; //首年保费

    @NotNull(message = "缴费期间不能为null", groups = {Insert.class})
    private String paySpan; //缴费期间

    @NotNull(message = "保险期间不能为null", groups = {Insert.class})
    private String insuranceSpan; //保险期间

    private Integer isMainInsurance; //是否主险 1 是 0 否

    private String introduce; //该险种说明

    private List<InsuranceResponsibleInfo> responsibleInfoList;

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getIsMainInsurance() {
        return isMainInsurance;
    }

    public void setIsMainInsurance(Integer isMainInsurance) {
        this.isMainInsurance = isMainInsurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.paySpan = paySpan;
    }

    public String getInsuranceSpan() {
        return insuranceSpan;
    }

    public void setInsuranceSpan(String insuranceSpan) {
        this.insuranceSpan = insuranceSpan;
    }

    public List<InsuranceResponsibleInfo> getResponsibleInfoList() {
        return responsibleInfoList;
    }

    public void setResponsibleInfoList(List<InsuranceResponsibleInfo> responsibleInfoList) {
        this.responsibleInfoList = responsibleInfoList;
    }
}
