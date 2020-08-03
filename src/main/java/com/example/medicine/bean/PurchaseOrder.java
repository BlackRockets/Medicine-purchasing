package com.example.medicine.bean;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.util.Date;
import java.util.List;

public class PurchaseOrder extends BaseRowModel {
    @ExcelProperty(index = 0,value = "编号Id")
    private int purchaseId;
    @ExcelProperty(index = 1,value = "采购单编号")
    private String purchaseOrderNumber;
    @ExcelProperty(index = 2,value = "采购单名称")
    private Date orderCreationTime;
    @ExcelProperty(index = 3,value = "采购单医院")
    private String nameOfPurchaseOrder;
    @ExcelProperty(index = 4,value = "医院ID")
    private int hospitalId;
    @ExcelProperty(index = 5,value = "联系人")
    private String contacts;
    @ExcelProperty(index = 6,value = "联系电话")
    private String contactNumber;
    @ExcelProperty(index = 7,value = "建单时间")
    private Date orderModifiedTime;
    @ExcelProperty(index = 8,value = "最近修改时间")
    private Date lastModifiedTime;
    @ExcelProperty(index = 9,value = "提交时间")
    private Date submissionTime;
    @ExcelProperty(index = 10,value = "备注")
    private String remarks;
    @ExcelProperty(index = 11,value = "采购单状态")
    private String purchaseOrderStatus;
    @ExcelProperty(index = 12,value = "审核人")
    private String reviewer;
    @ExcelProperty(index = 13,value = "审核意见")
    private String auditOpinion;
    @ExcelProperty(index = 14,value = "审核时间")
    private Date auditTime;

    private PurchaseOrderDetails pod;

    private Hospital_Transaction_Details htd;

    private Drug drug;

    private HospitalInformationMaintenanceForm himf;

    private HospitalProcurementOfDrugs hpod;

    private Vendor_Information vi;

    private SupplierDrugListControl sdc;

    private Integer recoreds;

    private Integer pageNum = 1;

    //每页条数
    private Integer pageSize = 10;

    //起始条数
    private Integer startRow;

    //总套数
    private Integer total;

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Date getOrderCreationTime() {
        return orderCreationTime;
    }

    public void setOrderCreationTime(Date orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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

    public Hospital_Transaction_Details getHtd() {
        return htd;
    }

    public void setHtd(Hospital_Transaction_Details htd) {
        this.htd = htd;
    }

    public Integer getRecoreds() {
        return recoreds;
    }

    public void setRecoreds(Integer recoreds) {
        this.recoreds = recoreds;
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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public PurchaseOrderDetails getPod() {
        return pod;
    }

    public void setPod(PurchaseOrderDetails pod) {
        this.pod = pod;
    }

    public HospitalInformationMaintenanceForm getHimf() {
        return himf;
    }

    public void setHimf(HospitalInformationMaintenanceForm himf) {
        this.himf = himf;
    }

    public HospitalProcurementOfDrugs getHpod() {
        return hpod;
    }

    public void setHpod(HospitalProcurementOfDrugs hpod) {
        this.hpod = hpod;
    }

    public Vendor_Information getVi() {
        return vi;
    }

    public void setVi(Vendor_Information vi) {
        this.vi = vi;
    }

    public SupplierDrugListControl getSdc() {
        return sdc;
    }

    public void setSdc(SupplierDrugListControl sdc) {
        this.sdc = sdc;
    }
}
