package com.example.medicine.bean;

public class PurchaseDrugVO {
    private Integer purchaseId;

    private Integer id;

    private String purchaseOrderNumber;

    private String nameOfPurchaseOrder;

    private int hospitalId;


    private Integer drugInformationId;


    /**
     * 采购量
     */
    private Integer purchaseVolume;
    /**
     * 采购金额
     */
    private Integer purchaseAmount;
    /**
     * 入库量
     */
    private Integer storageVolume;

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


    //页码
    private Integer pageNum=1;

    //每页条数
    private Integer pageSize=10;

    //起始条数
    private Integer startRow;

    public Integer getDrugInformationId() {
        return drugInformationId;
    }

    public void setDrugInformationId(Integer drugInformationId) {
        this.drugInformationId = drugInformationId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public String getNameOfPurchaseOrder() {
        return nameOfPurchaseOrder;
    }

    public void setNameOfPurchaseOrder(String nameOfPurchaseOrder) {
        this.nameOfPurchaseOrder = nameOfPurchaseOrder;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getPurchaseVolume() {
        return purchaseVolume;
    }

    public void setPurchaseVolume(Integer purchaseVolume) {
        this.purchaseVolume = purchaseVolume;
    }

    public Integer getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Integer purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Integer getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(Integer storageVolume) {
        this.storageVolume = storageVolume;
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

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }
}