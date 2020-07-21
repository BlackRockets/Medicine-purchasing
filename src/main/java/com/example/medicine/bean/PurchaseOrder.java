package com.example.medicine.bean;

import java.util.Date;
import java.util.List;

public class PurchaseOrder {

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

    public Integer getRecoreds() {
        return recoreds;
    }

    public void setRecoreds(Integer recoreds) {
        this.recoreds = recoreds;
    }

    private Date auditTime;

    private Hospital_Transaction_Details hospital_transaction_details;

    private Integer recoreds;



}
