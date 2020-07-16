package com.example.medicine.bean;

public class DrugItems {
    private Integer id;

    private String itemNumber;

    private String commonName;

    private String dosageForm;

    private String specifications;

    private String drugCategory;

    private String company;

    private String conversionCoefficientNo;

    private Short status;

    //页码
    private Integer pageNum;

    //每页条数
    private Integer pageSize;

    //起始条数
    private Integer startrow;

    //总套数
    private Integer total;

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