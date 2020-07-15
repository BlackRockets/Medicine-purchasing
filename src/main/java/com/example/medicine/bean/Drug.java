package com.example.medicine.bean;

import java.util.Date;

public class Drug {
    private Integer id;

    private String serialUmber;

    private String dosageForm;

    private String dosageFormDrug;

    private String specifications;

    private String conversionCoefficientNo;

    private String nameOfManufacturer;

    private String tradeName;

    private String bidPrice;

    private String company;

    private String commonNamePinyin;

    private String productPhotos;

    private String approvalNumber;

    private String validityPeriodOfApprovalNumber;

    private Integer importedDrugs;

    private String packingMaterial;

    private String packagingUnit;

    private Double latestRetailPrice;

    private String retailPriceSource;

    private String qualityLevel;

    private String qualityLevelDescription;

    private Integer drugInspectionReport;

    private String drugInspectionReportNo;

    private Date validityPeriodOfDrugInspectionReport;

    private String productDescription;

    private String drugCategory;

    private Integer drugTradeStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialUmber() {
        return serialUmber;
    }

    public void setSerialUmber(String serialUmber) {
        this.serialUmber = serialUmber == null ? null : serialUmber.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getDosageFormDrug() {
        return dosageFormDrug;
    }

    public void setDosageFormDrug(String dosageFormDrug) {
        this.dosageFormDrug = dosageFormDrug == null ? null : dosageFormDrug.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getConversionCoefficientNo() {
        return conversionCoefficientNo;
    }

    public void setConversionCoefficientNo(String conversionCoefficientNo) {
        this.conversionCoefficientNo = conversionCoefficientNo == null ? null : conversionCoefficientNo.trim();
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer == null ? null : nameOfManufacturer.trim();
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName == null ? null : tradeName.trim();
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice == null ? null : bidPrice.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCommonNamePinyin() {
        return commonNamePinyin;
    }

    public void setCommonNamePinyin(String commonNamePinyin) {
        this.commonNamePinyin = commonNamePinyin == null ? null : commonNamePinyin.trim();
    }

    public String getProductPhotos() {
        return productPhotos;
    }

    public void setProductPhotos(String productPhotos) {
        this.productPhotos = productPhotos == null ? null : productPhotos.trim();
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getValidityPeriodOfApprovalNumber() {
        return validityPeriodOfApprovalNumber;
    }

    public void setValidityPeriodOfApprovalNumber(String validityPeriodOfApprovalNumber) {
        this.validityPeriodOfApprovalNumber = validityPeriodOfApprovalNumber == null ? null : validityPeriodOfApprovalNumber.trim();
    }

    public Integer getImportedDrugs() {
        return importedDrugs;
    }

    public void setImportedDrugs(Integer importedDrugs) {
        this.importedDrugs = importedDrugs;
    }

    public String getPackingMaterial() {
        return packingMaterial;
    }

    public void setPackingMaterial(String packingMaterial) {
        this.packingMaterial = packingMaterial == null ? null : packingMaterial.trim();
    }

    public String getPackagingUnit() {
        return packagingUnit;
    }

    public void setPackagingUnit(String packagingUnit) {
        this.packagingUnit = packagingUnit == null ? null : packagingUnit.trim();
    }

    public Double getLatestRetailPrice() {
        return latestRetailPrice;
    }

    public void setLatestRetailPrice(Double latestRetailPrice) {
        this.latestRetailPrice = latestRetailPrice;
    }

    public String getRetailPriceSource() {
        return retailPriceSource;
    }

    public void setRetailPriceSource(String retailPriceSource) {
        this.retailPriceSource = retailPriceSource == null ? null : retailPriceSource.trim();
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel == null ? null : qualityLevel.trim();
    }

    public String getQualityLevelDescription() {
        return qualityLevelDescription;
    }

    public void setQualityLevelDescription(String qualityLevelDescription) {
        this.qualityLevelDescription = qualityLevelDescription == null ? null : qualityLevelDescription.trim();
    }

    public Integer getDrugInspectionReport() {
        return drugInspectionReport;
    }

    public void setDrugInspectionReport(Integer drugInspectionReport) {
        this.drugInspectionReport = drugInspectionReport;
    }

    public String getDrugInspectionReportNo() {
        return drugInspectionReportNo;
    }

    public void setDrugInspectionReportNo(String drugInspectionReportNo) {
        this.drugInspectionReportNo = drugInspectionReportNo == null ? null : drugInspectionReportNo.trim();
    }

    public Date getValidityPeriodOfDrugInspectionReport() {
        return validityPeriodOfDrugInspectionReport;
    }

    public void setValidityPeriodOfDrugInspectionReport(Date validityPeriodOfDrugInspectionReport) {
        this.validityPeriodOfDrugInspectionReport = validityPeriodOfDrugInspectionReport;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public String getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(String drugCategory) {
        this.drugCategory = drugCategory == null ? null : drugCategory.trim();
    }

    public Integer getDrugTradeStatus() {
        return drugTradeStatus;
    }

    public void setDrugTradeStatus(Integer drugTradeStatus) {
        this.drugTradeStatus = drugTradeStatus;
    }
}