package com.example.medicine.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Hospital_Transaction_Details {

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

    private String returnStatus;

    private Integer statementOfAccountId;

    private Integer settlementVolume;

    private Double settlementAmount;

    private Integer settlementStatus;

    private Integer pageNum = 1;

    //每页条数
    private Integer pageSize = 10;

    //起始条数
    private Integer startRow;

    //总套数
    private Integer total;

    private  Drug drug;

    private PurchaseOrder po;

    private HospitalInformationMaintenanceForm himf;

    private Vendor_Information vi;

    private HospitalProcurementOfDrugs hpod;

    private Drug drug;

    private Vendor_Information vendor_information;

    private HospitalInformationMaintenanceForm hospitalInformationMaintenanceForm;

    private PurchaseOrderDetails purchaseOrderDetails;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date endTime;

    private Integer pageNum;

    private Integer pageSize;

    private Integer pageStart;

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

    public Integer getPageStart() {
        return pageStart;
    }

    public void setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
    }

    public PurchaseOrderDetails getPurchaseOrderDetails() {
        return purchaseOrderDetails;
    }

    public void setPurchaseOrderDetails(PurchaseOrderDetails purchaseOrderDetails) {
        this.purchaseOrderDetails = purchaseOrderDetails;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Vendor_Information getVendor_information() {
        return vendor_information;
    }

    @Override
    public String toString() {
        return "Hospital_Transaction_Details{" +
                "hospitalTransactionDetailsId=" + hospitalTransactionDetailsId +
                ", purchaseOrderId=" + purchaseOrderId +
                ", drugInformationId=" + drugInformationId +
                ", supplierId=" + supplierId +
                ", bidPrice=" + bidPrice +
                ", transactionPrice=" + transactionPrice +
                ", purchaseVolume='" + purchaseVolume + '\'' +
                ", purchasingStatus='" + purchasingStatus + '\'' +
                ", storageVolume='" + storageVolume + '\'' +
                ", purchaseAmount='" + purchaseAmount + '\'' +
                ", returnOrderId=" + returnOrderId +
                ", returnOrderNumber='" + returnOrderNumber + '\'' +
                ", returnGoods='" + returnGoods + '\'' +
                ", warehousingAmount='" + warehousingAmount + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", drugBatchNumber='" + drugBatchNumber + '\'' +
                ", validityPeriodOfDrug=" + validityPeriodOfDrug +
                ", warehousing=" + warehousing +
                ", reasonForReturn='" + reasonForReturn + '\'' +
                ", returnStatus='" + returnStatus + '\'' +
                ", statementOfAccountId=" + statementOfAccountId +
                ", settlementVolume='" + settlementVolume + '\'' +
                ", settlementAmount='" + settlementAmount + '\'' +
                ", settlementStatus='" + settlementStatus + '\'' +
                ", drug=" + drug +
                ", vendor_information=" + vendor_information +
                ", hospitalInformationMaintenanceForm=" + hospitalInformationMaintenanceForm +
                ", purchaseOrderDetails=" + purchaseOrderDetails +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", pageStart=" + pageStart +
                '}';
    }

    public void setVendor_information(Vendor_Information vendor_information) {
        this.vendor_information = vendor_information;
    }

    public HospitalInformationMaintenanceForm getHospitalInformationMaintenanceForm() {
        return hospitalInformationMaintenanceForm;
    }

    public void setHospitalInformationMaintenanceForm(HospitalInformationMaintenanceForm hospitalInformationMaintenanceForm) {
        this.hospitalInformationMaintenanceForm = hospitalInformationMaintenanceForm;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

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

    public PurchaseOrder getPo() {
        return po;
    }

    public void setPo(PurchaseOrder po) {
        this.po = po;
    }

    public HospitalInformationMaintenanceForm getHimf() {
        return himf;
    }

    public void setHimf(HospitalInformationMaintenanceForm himf) {
        this.himf = himf;
    }

    public Vendor_Information getVi() {
        return vi;
    }

    public void setVi(Vendor_Information vi) {
        this.vi = vi;
    }

    public HospitalProcurementOfDrugs getHpod() {
        return hpod;
    }

    public void setHpod(HospitalProcurementOfDrugs hpod) {
        this.hpod = hpod;
    }

    public Integer getSettlementVolume() {
        return settlementVolume;
    }

    public void setSettlementVolume(Integer settlementVolume) {
        this.settlementVolume = settlementVolume;
    }

    public Double getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(Double settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }
}