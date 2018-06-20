package com.centerm.baseproject.dto;

import com.centerm.constant.validate.Insert;
import com.centerm.constant.validate.Update;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class FinalProjectInfo {

    //private Integer projectId; //计划id


    private String holderName; //被保人姓名

    @NotNull(message = "被保人性别不能为null", groups = {Insert.class})
    private Integer holderGender; //被保人性别 0 男 1 女

    @NotNull(message = "被保人年龄不能为null", groups = {Insert.class})
    private Integer holderAge; //被保人年龄

    private String holderBirthday; //'出生日期 格式 ：1999-01-01'

    private String receiverName; //收件人名称

    private Integer receiverGender;//收件人性别

    //@NotNull(message = "缴费期间不能为null", groups = {Insert.class})
    private String paySpan; //缴费期间

    //@NotNull(message = "保险期间不能为null", groups = {Insert.class})
    private String insuranceSpan; //保险期间

    @NotNull(message = "首年保费(总额)不能为null", groups = {Insert.class})
    private BigDecimal firstYearPremium; //首年保费(总额)

    private Set<String> responsibleSet; //保险责任集合

    @NotNull(message = "保险计划详情不能为null", groups = {Insert.class})
    private List<FinalProjectDetailInfo> finalProjectDetailInfoList;

    public Set<String> getResponsibleSet() {
        return responsibleSet;
    }

    public void setResponsibleSet(Set<String> responsibleSet) {
        this.responsibleSet = responsibleSet;
    }

    public List<FinalProjectDetailInfo> getFinalProjectDetailInfoList() {
        return finalProjectDetailInfoList;
    }

    public void setFinalProjectDetailInfoList(List<FinalProjectDetailInfo> finalProjectDetailInfoList) {
        this.finalProjectDetailInfoList = finalProjectDetailInfoList;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
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
        this.holderBirthday = holderBirthday;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public Integer getReceiverGender() {
        return receiverGender;
    }

    public void setReceiverGender(Integer receiverGender) {
        this.receiverGender = receiverGender;
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

    public BigDecimal getFirstYearPremium() {
        return firstYearPremium;
    }

    public void setFirstYearPremium(BigDecimal firstYearPremium) {
        this.firstYearPremium = firstYearPremium;
    }

    @Override
    public String toString() {
        return "FinalProjectInfo{" +
                "holderName='" + holderName + '\'' +
                ", holderGender=" + holderGender +
                ", holderAge=" + holderAge +
                ", holder_birthday='" + holderBirthday + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverGender='" + receiverGender + '\'' +
                ", paySpan='" + paySpan + '\'' +
                ", insuranceSpan='" + insuranceSpan + '\'' +
                ", firstYearPremium=" + firstYearPremium +
                ", finalProjectDetailInfoList=" + finalProjectDetailInfoList.toString() +
                '}';
    }
}
