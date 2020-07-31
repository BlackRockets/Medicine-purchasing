package com.example.medicine.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 采购单药品明细表(PurchaseOrderDetails)实体类
 *
 * @author makejava
 * @since 2020-07-27 14:59:24
 */
public class PurchaseOrderDetails implements Serializable {
    private static final long serialVersionUID = -96662031884541429L;
    /**
     * id
     */
    private Integer id;
    /**
     * 采购单id
     */
    private Integer purchaseOrderId;
    /**
     * 采购单编号
     */
    private String purchaseOrderNumber;
    /**
     * 采购单名称
     */
    private String nameOfPurchaseOrder;
    /**
     * 建单时间
     */
    private Date orderCreationTime;
    /**
     * 提交时间
     */
    private Date submissionTime;
    /**
     * 审核时间
     */
    private Date auditTime;
    /**
     * 采购量
     */
    private Integer purchaseVolume;
    /**
     * 采购金额
     */
    private Integer purchaseAmount;
    /**
     * 采购状态(存储数据字典：1、未确认送货 2、已发货、3、已入库 4 无法供货 5
     * 到期未供货)
     */
    private Integer purchasingStatus;
    /**
     * 入库量
     */
    private Integer storageVolume;
    /**
     * 入库金额
     */
    private Integer warehousingAmount;
    /**
     * 退货量
     */
    private Integer returnQuantity;


    private Integer drugInformationId;


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

    public Date getOrderCreationTime() {
        return orderCreationTime;
    }

    public void setOrderCreationTime(Date orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getPurchaseVolume() {
        return purchaseVolume;
    }

    public void setPurchaseVolume(Integer purchaseVolume) {
        this.purchaseVolume = purchaseVolume;
    }

    public Integer getpurchaseAmount() { return purchaseAmount; }

    public void setpurchaseAmount(Integer purchaseAmount) { this.purchaseAmount = purchaseAmount;
    }

    public Integer getPurchasingStatus() {
        return purchasingStatus;
    }

    public void setPurchasingStatus(Integer purchasingStatus) {
        this.purchasingStatus = purchasingStatus;
    }

    public Integer getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(Integer storageVolume) {
        this.storageVolume = storageVolume;
    }

    public Integer getWarehousingAmount() {
        return warehousingAmount;
    }

    public void setWarehousingAmount(Integer warehousingAmount) {
        this.warehousingAmount = warehousingAmount;
    }

    public Integer getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(Integer returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Integer purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Integer getDrugInformationId() {
        return drugInformationId;
    }

    public void setDrugInformationId(Integer drugInformationId) {
        this.drugInformationId = drugInformationId;
    }
}