package com.example.medicine.bean;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class DrugItems extends BaseRowModel {

    private Integer id;

    @ExcelProperty(index = 0,value = "药品品目号")
    private String itemNumber;
    @ExcelProperty(index = 1,value = "通用名")
    private String commonName;
    @ExcelProperty(index = 2,value = "剂型")
    private String dosageForm;
    @ExcelProperty(index = 3,value = "规格")
    private String specifications;
    @ExcelProperty(index = 4,value = "药品类别")
    private String drugCategory;
    @ExcelProperty(index = 5,value = "单位")
    private String company;
    @ExcelProperty(index = 6,value = "转换系数")
    private String conversionCoefficientNo;

    private Short status;
    @ExcelProperty(index = 7,value = "状态")
    private String statu;

    //页码
    private Integer pageNum=1;

    //每页条数
    private Integer pageSize=10;

    //起始条数
    private Integer startrow;

    //总套数
    private Integer total;

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getStartrow() {
        return startrow;
    }

    public void setStartrow(Integer startrow) {
        this.startrow = startrow;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber == null ? null : itemNumber.trim();
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName == null ? null : commonName.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(String drugCategory) {
        this.drugCategory = drugCategory == null ? null : drugCategory.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getConversionCoefficientNo() {
        return conversionCoefficientNo;
    }

    public void setConversionCoefficientNo(String conversionCoefficientNo) {
        this.conversionCoefficientNo = conversionCoefficientNo == null ? null : conversionCoefficientNo.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}