package com.example.medicine.bean;

import java.util.Date;

public class PurchaseOrder01 {

    private int purchaseId;

    public Date getOrderCreationTime() {
        return orderCreationTime;
    }

    public void setOrderCreationTime(Date orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    private String purchaseOrderNumber;

    private Date orderCreationTime;

    private String nameOfPurchaseOrder;

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

    public Integer getBeginNum() {
        return beginNum;
    }

    public void setBeginNum(Integer beginNum) {
        this.beginNum = beginNum;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    private  int hospitalId;

    private String contacts;

    private String contactNumber;


    private Integer pageNum;

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    private Integer pageSize;

    private Integer beginNum;

    private Integer total;

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
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

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }


    public Date getOrderModifiedTime() {
        return orderModifiedTime;
    }

    public void setOrderModifiedTime(Date orderModifiedTime) {
        this.orderModifiedTime = orderModifiedTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPurchaseOrderStatus() {
        return purchaseOrderStatus;
    }

    public void setPurchaseOrderStatus(String purchaseOrderStatus) {
        this.purchaseOrderStatus = purchaseOrderStatus;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    private Date orderModifiedTime;

    private Date lastModifiedTime;

    private Date submissionTime;

    private String remarks;

    private String purchaseOrderStatus;

    private String reviewer;

    public Hospital_Transaction_Details getHospital_transaction_details() {
        return hospital_transaction_details;
    }

    public void setHospital_transaction_details(Hospital_Transaction_Details hospital_transaction_details) {
        this.hospital_transaction_details = hospital_transaction_details;
    }

    private String auditOpinion;

    private Date auditTime;

    private Hospital_Transaction_Details hospital_transaction_details;

    private Integer hospitalTransactionDetailsId;

    private Integer purchaseOrderId;

    private Integer drugInformationId;

    private Integer supplierId;

    private Double bidPrice;

    private Double transactionPrice;

    private String purchaseVolume;

    private String purchasingStatus;

    private String storageVolume;

    private String purchaseAmount;

    private Integer returnOrderId;

    private String returnOrderNumber;

    private String returnGoods;

    private String warehousingAmount;

    private String invoiceNumber;

    private String drugBatchNumber;

    private Date validityPeriodOfDrug;

    private Date warehousing;

    private String reasonForReturn;

    public Integer getHospitalTransactionDetailsId() {
        return hospitalTransactionDetailsId;
    }

    public void setHospitalTransactionDetailsId(Integer hospitalTransactionDetailsId) {
        this.hospitalTransactionDetailsId = hospitalTransactionDetailsId;
    }

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Integer getDrugInformationId() {
        return drugInformationId;
    }

    public void setDrugInformationId(Integer drugInformationId) {
        this.drugInformationId = drugInformationId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Double getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(Double transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    public String getPurchaseVolume() {
        return purchaseVolume;
    }

    public void setPurchaseVolume(String purchaseVolume) {
        this.purchaseVolume = purchaseVolume;
    }

    public String getPurchasingStatus() {
        return purchasingStatus;
    }

    public void setPurchasingStatus(String purchasingStatus) {
        this.purchasingStatus = purchasingStatus;
    }

    public String getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(String storageVolume) {
        this.storageVolume = storageVolume;
    }

    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Integer getReturnOrderId() {
        return returnOrderId;
    }

    public void setReturnOrderId(Integer returnOrderId) {
        this.returnOrderId = returnOrderId;
    }

    public String getReturnOrderNumber() {
        return returnOrderNumber;
    }

    public void setReturnOrderNumber(String returnOrderNumber) {
        this.returnOrderNumber = returnOrderNumber;
    }

    public String getReturnGoods() {
        return returnGoods;
    }

    public void setReturnGoods(String returnGoods) {
        this.returnGoods = returnGoods;
    }

    public String getWarehousingAmount() {
        return warehousingAmount;
    }

    public void setWarehousingAmount(String warehousingAmount) {
        this.warehousingAmount = warehousingAmount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDrugBatchNumber() {
        return drugBatchNumber;
    }

    public void setDrugBatchNumber(String drugBatchNumber) {
        this.drugBatchNumber = drugBatchNumber;
    }

    public Date getValidityPeriodOfDrug() {
        return validityPeriodOfDrug;
    }

    public void setValidityPeriodOfDrug(Date validityPeriodOfDrug) {
        this.validityPeriodOfDrug = validityPeriodOfDrug;
    }

    public Date getWarehousing() {
        return warehousing;
    }

    public void setWarehousing(Date warehousing) {
        this.warehousing = warehousing;
    }

    public String getReasonForReturn() {
        return reasonForReturn;
    }

    public void setReasonForReturn(String reasonForReturn) {
        this.reasonForReturn = reasonForReturn;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Integer getStatementOfAccountId() {
        return statementOfAccountId;
    }

    public void setStatementOfAccountId(Integer statementOfAccountId) {
        this.statementOfAccountId = statementOfAccountId;
    }

    public String getSettlementVolume() {
        return settlementVolume;
    }

    public void setSettlementVolume(String settlementVolume) {
        this.settlementVolume = settlementVolume;
    }

    public String getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(String settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public String getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(String settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    private String returnStatus;

    private Integer statementOfAccountId;

    private String settlementVolume;

    private String settlementAmount;

    private String settlementStatus;


}
