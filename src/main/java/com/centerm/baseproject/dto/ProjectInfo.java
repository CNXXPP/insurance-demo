package com.centerm.baseproject.dto;

import com.centerm.constant.validate.Insert;
import com.centerm.constant.validate.Select;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

public class ProjectInfo {

    private Integer id; //保险计划id

    private String projectName; //计划名称

    private Integer defaultGender; //默认性别

    private Integer defaultAge; //默认年龄

    private BigDecimal firstYearPremium; //首年保费总额

    private Integer holderMinAge; //被保人最小可选年龄

    private Integer holderMaxAge;//被保人最大可选年龄

    private Integer payerMinAge;//投保人最小可选年龄

    private Integer payerMaxAge;//投保人最大可选年龄

    private String introduce; //简介

    private List<ProjectDetailInfo> projectDetailInfoList;

    public String getIntroduce() {
        return introduce;
    }

    public Integer getDefaultAge() {
        return defaultAge;
    }

    public void setDefaultAge(Integer defaultAge) {
        this.defaultAge = defaultAge;
    }

    public Integer getDefaultGender() {
        return defaultGender;
    }

    public void setDefaultGender(Integer defaultGender) {
        this.defaultGender = defaultGender;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public List<ProjectDetailInfo> getProjectDetailInfoList() {
        return projectDetailInfoList;
    }

    public void setProjectDetailInfoList(List<ProjectDetailInfo> projectDetailInfoList) {
        this.projectDetailInfoList = projectDetailInfoList;
    }
}
