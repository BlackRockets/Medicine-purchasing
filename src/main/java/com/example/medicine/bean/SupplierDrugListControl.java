package com.example.medicine.bean;


public class SupplierDrugListControl {
    private Integer supplierDrugListControlId;

    private String opinionsOfSupervisionOrganization;

    private Integer enterpriseId;

    private Integer drugInformationId;

    private Integer supervisionOrganizationControlStatus;

    private Drug drug;

    private Vendor_Information vendor_information;

    private Integer pageNum;

    private Integer pageSize;

    private Integer pageStart;

    @Override
    public String toString() {
        return "SupplierDrugListControl{" +
                "supplierDrugListControlId=" + supplierDrugListControlId +
                ", opinionsOfSupervisionOrganization='" + opinionsOfSupervisionOrganization + '\'' +
                ", enterpriseId=" + enterpriseId +
                ", drugInformationId=" + drugInformationId +
                ", supervisionOrganizationControlStatus=" + supervisionOrganizationControlStatus +
                ", drug=" + drug +
                ", vendor_information=" + vendor_information +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", pageStart=" + pageStart +
                '}';
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

    public Integer getPageStart() {
        return pageStart;
    }

    public void setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
    }

    public Integer getSupplierDrugListControlId() {
        return supplierDrugListControlId;
    }

    public void setSupplierDrugListControlId(Integer supplierDrugListControlId) {
        this.supplierDrugListControlId = supplierDrugListControlId;
    }

    public String getOpinionsOfSupervisionOrganization() {
        return opinionsOfSupervisionOrganization;
    }

    public void setOpinionsOfSupervisionOrganization(String opinionsOfSupervisionOrganization) {
        this.opinionsOfSupervisionOrganization = opinionsOfSupervisionOrganization;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getDrugInformationId() {
        return drugInformationId;
    }

    public void setDrugInformationId(Integer drugInformationId) {
        this.drugInformationId = drugInformationId;
    }

    public Integer getSupervisionOrganizationControlStatus() {
        return supervisionOrganizationControlStatus;
    }

    public void setSupervisionOrganizationControlStatus(Integer supervisionOrganizationControlStatus) {
        this.supervisionOrganizationControlStatus = supervisionOrganizationControlStatus;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Vendor_Information getVendor_information() {
        return vendor_information;
    }

    public void setVendor_information(Vendor_Information vendor_information) {
        this.vendor_information = vendor_information;
    }
}
