package com.example.medicine.bean;

import java.util.Date;

public class DrugVO {
    private Integer id;

    private Integer purchaseOrderId;

    private String nameOfPurchaseOrder;

    private String serialUmber;

    private String dosageForm;

    private String tradeName;

    private String bidPrice;

    private String approvalNumber;

    private String validityPeriodOfApprovalNumber;

    private String dosageFormDrug;

    private String specifications;

    private String company;

    private String qualityLevelDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getNameOfPurchaseOrder() {
        return nameOfPurchaseOrder;
    }

    public void setNameOfPurchaseOrder(String nameOfPurchaseOrder) {
        this.nameOfPurchaseOrder = nameOfPurchaseOrder;
    }

    public String getSerialUmber() {
        return serialUmber;
    }

    public void setSerialUmber(String serialUmber) {
        this.serialUmber = serialUmber;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getValidityPeriodOfApprovalNumber() {
        return validityPeriodOfApprovalNumber;
    }

    public void setValidityPeriodOfApprovalNumber(String validityPeriodOfApprovalNumber) {
        this.validityPeriodOfApprovalNumber = validityPeriodOfApprovalNumber;
    }

    public String getDosageFormDrug() {
        return dosageFormDrug;
    }

    public void setDosageFormDrug(String dosageFormDrug) {
        this.dosageFormDrug = dosageFormDrug;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getQualityLevelDescription() {
        return qualityLevelDescription;
    }

    public void setQualityLevelDescription(String qualityLevelDescription) {
        this.qualityLevelDescription = qualityLevelDescription;
    }
}