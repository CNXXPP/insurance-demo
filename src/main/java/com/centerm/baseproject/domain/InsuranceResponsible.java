package com.centerm.baseproject.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class InsuranceResponsible implements Serializable {
    private String id;

    private Integer insuranceCode;

    private String name;

    private BigDecimal premiumFactor;

    private String description;

    private String responsibleType;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(Integer insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPremiumFactor() {
        return premiumFactor;
    }

    public void setPremiumFactor(BigDecimal premiumFactor) {
        this.premiumFactor = premiumFactor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getResponsibleType() {
        return responsibleType;
    }

    public void setResponsibleType(String responsibleType) {
        this.responsibleType = responsibleType == null ? null : responsibleType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", insuranceCode=").append(insuranceCode);
        sb.append(", name=").append(name);
        sb.append(", premiumFactor=").append(premiumFactor);
        sb.append(", description=").append(description);
        sb.append(", responsibleType=").append(responsibleType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}