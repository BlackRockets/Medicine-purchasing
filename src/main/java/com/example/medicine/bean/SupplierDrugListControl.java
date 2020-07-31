package com.example.medicine.bean;

import java.io.Serializable;

/**
 * 供应商药品目录控制表(SupplierDrugListControl)实体类
 *
 * @author makejava
 * @since 2020-07-30 15:32:59
 */
public class SupplierDrugListControl implements Serializable {
    private static final long serialVersionUID = 882391445219195046L;
    /**
     * 编号 id
     */
    private Integer supplierDrugListControlId;
    /**
     * 监督机构意见
     */
    private String opinionsOfSupervisionOrganization;
    /**
     * 供货商(企)业id
     */
    private Integer enterpriseId;
    /**
     * 药品信息id
     */
    private Integer drugInformationId;
    /**
     * 监督机构控制状态(1：正常 ,2：暂停)
     */
    private Integer supervisionOrganizationControlStatus;


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

}