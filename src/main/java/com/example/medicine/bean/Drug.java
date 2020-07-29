package com.example.medicine.bean;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.util.Date;

public class Drug extends BaseRowModel {
    private Integer id;

    @ExcelProperty(index = 0, value = "流水号")
    private String serialUmber;
    @ExcelProperty(index = 1, value = "通用名")
    private String dosageForm;
    @ExcelProperty(index = 2, value = "剂型")
    private String dosageFormDrug;
    @ExcelProperty(index = 3, value = "规格")
    private String specifications;
    @ExcelProperty(index = 4, value = "转换系数")
    private String conversionCoefficientNo;
    @ExcelProperty(index = 5, value = "生产企业")
    private String nameOfManufacturer;
    @ExcelProperty(index = 6, value = "商品名")
    private String tradeName;
    @ExcelProperty(index = 7, value = "中标价")
    private String bidPrice;
    @ExcelProperty(index = 8, value = "单位")
    private String company;
    @ExcelProperty(index = 9, value = "通用名称")
    private String commonNamePinyin;
    @ExcelProperty(index = 10, value = "产品照片")
    private String productPhotos;
    @ExcelProperty(index = 11, value = "批准文号")
    private String approvalNumber;
    @ExcelProperty(index = 12, value = "批准文号有效期")
    private String validityPeriodOfApprovalNumber;
    @ExcelProperty(index = 13, value = "是否进口药")
    private Integer importedDrugs;
    @ExcelProperty(index = 14, value = "包装材质")
    private String packingMaterial;
    @ExcelProperty(index = 15, value = "包装单位")
    private String packagingUnit;
    @ExcelProperty(index = 16, value = "最新零售价")
    private Double latestRetailPrice;
    @ExcelProperty(index = 17, value = "零售价出处")
    private String retailPriceSource;
    @ExcelProperty(index = 18, value = "质量层次")
    private String qualityLevel;
    @ExcelProperty(index = 19, value = "质量层次")
    private String qualityLevelDescription;
    @ExcelProperty(index = 20, value = "有无药品检验报告")
    private Integer drugInspectionReport;
    @ExcelProperty(index = 21, value = "药品检验报告编号")
    private String drugInspectionReportNo;
    @ExcelProperty(index = 22, value = "药品检验报告有效期")
    private Date validityPeriodOfDrugInspectionReport;
    @ExcelProperty(index = 23, value = "产品说明")
    private String productDescription;
    @ExcelProperty(index = 24, value = "药品类别")
    private String drugCategory;
    @ExcelProperty(index = 25, value = "药品交易状态")
    private Integer drugTradeStatus;

    private Double startPrice;

    private Double endPrice;
    @ExcelProperty(index = 26, value = "采购标识")
    private Integer flag;
    @ExcelProperty(index = 27, value = "供货标识")
    private Integer supplierFlag;

    private Vendor_Information vendor_information;


    //页码
    private Integer pageNum;

    //每页条数
    private Integer pageSize;

    //起始条数
    private Integer startrow;

    //总套数
    private Integer total;

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", serialUmber='" + serialUmber + '\'' +
                ", dosageForm='" + dosageForm + '\'' +
                ", dosageFormDrug='" + dosageFormDrug + '\'' +
                ", specifications='" + specifications + '\'' +
                ", conversionCoefficientNo='" + conversionCoefficientNo + '\'' +
                ", nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", tradeName='" + tradeName + '\'' +
                ", bidPrice='" + bidPrice + '\'' +
                ", company='" + company + '\'' +
                ", commonNamePinyin='" + commonNamePinyin + '\'' +
                ", productPhotos='" + productPhotos + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", validityPeriodOfApprovalNumber='" + validityPeriodOfApprovalNumber + '\'' +
                ", importedDrugs=" + importedDrugs +
                ", packingMaterial='" + packingMaterial + '\'' +
                ", packagingUnit='" + packagingUnit + '\'' +
                ", latestRetailPrice=" + latestRetailPrice +
                ", retailPriceSource='" + retailPriceSource + '\'' +
                ", qualityLevel='" + qualityLevel + '\'' +
                ", qualityLevelDescription='" + qualityLevelDescription + '\'' +
                ", drugInspectionReport=" + drugInspectionReport +
                ", drugInspectionReportNo='" + drugInspectionReportNo + '\'' +
                ", validityPeriodOfDrugInspectionReport=" + validityPeriodOfDrugInspectionReport +
                ", productDescription='" + productDescription + '\'' +
                ", drugCategory='" + drugCategory + '\'' +
                ", drugTradeStatus=" + drugTradeStatus +
                ", startPrice=" + startPrice +
                ", endPrice=" + endPrice +
                ", flag=" + flag +
                ", supplierFlag=" + supplierFlag +
                ", vendor_information=" + vendor_information +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", startrow=" + startrow +
                ", total=" + total +
                '}';
    }

    public Integer getSupplierFlag() {
        return supplierFlag;
    }

    public void setSupplierFlag(Integer supplierFlag) {
        this.supplierFlag = supplierFlag;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Vendor_Information getVendor_information() {
        return vendor_information;
    }

    public void setVendor_information(Vendor_Information vendor_information) {
        this.vendor_information = vendor_information;
    }

    public Double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Double startPrice) {
        this.startPrice = startPrice;
    }

    public Double getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(Double endPrice) {
        this.endPrice = endPrice;
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

    public Integer getStartrow() {
        return startrow;
    }

    public void setStartrow(Integer startrow) {
        this.startrow = startrow;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

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