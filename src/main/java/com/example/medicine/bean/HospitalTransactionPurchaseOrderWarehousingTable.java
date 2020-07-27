package com.example.medicine.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 医院交易采购单入库表(HospitalTransactionPurchaseOrderWarehousingTable)实体类
 *
 * @author makejava
 * @since 2020-07-18 13:44:36
 */
public class HospitalTransactionPurchaseOrderWarehousingTable implements Serializable {
    private static final long serialVersionUID = -52154792641546835L;
    /**
     * 编号 id
     */
    private Integer purchaseOrderStockInTableId;
    /**
     * 采购单id
     */
    private Integer purchaseOrderId;
    /**
     * 药品信息id
     */
    private Integer drugInformationId;
    /**
     * 入库量
     */
    private String storageVolume;
    /**
     * 入库金额
     */
    private String warehousingAmount;
    /**
     * 发票号或入库单号
     */
    private String invoiceUmber;
    /**
     * 药品批号
     */
    private String drugBatchNumber;
    /**
     * 药品有效期
     */
    private Date validityPeriodOfDrug;
    /**
     * 入库时间
     */
    private Date storageTime;


    public Integer getPurchaseOrderStockInTableId() {
        return purchaseOrderStockInTableId;
    }

    public void setPurchaseOrderStockInTableId(Integer purchaseOrderStockInTableId) {
        this.purchaseOrderStockInTableId = purchaseOrderStockInTableId;
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

    public String getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(String storageVolume) {
        this.storageVolume = storageVolume;
    }

    public String getWarehousingAmount() {
        return warehousingAmount;
    }

    public void setWarehousingAmount(String warehousingAmount) {
        this.warehousingAmount = warehousingAmount;
    }

    public String getInvoiceUmber() {
        return invoiceUmber;
    }

    public void setInvoiceUmber(String invoiceUmber) {
        this.invoiceUmber = invoiceUmber;
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

    public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

}