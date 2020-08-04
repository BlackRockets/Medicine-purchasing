package com.example.medicine.bean;

import java.io.Serializable;

/**
 * 医院信息(HospitalInformationMaintenanceForm)实体类
 *
 * @author makejava
 * @since 2020-07-26 15:35:36
 */
public class HospitalInformationMaintenanceForm implements Serializable {
    private static final long serialVersionUID = -23815717913820669L;
    /**
    * 编号 id
    */
    private Integer maintenanceTableId;
    /**
    * 医院名称
    */
    private String nameOfHospital;
    /**
    * 通讯地址
    */
    private String postalAddress;
    /**
    * 邮政编码
    */
    private Integer postalCode;
    /**
    * 所属地区
    */
    private String region;
    /**
    * 医院级别
    */
    private String hospitalLevel;
    /**
    * 床位数
    */
    private String numberOfBeds;
    /**
    * 是否非营利性医疗机构
    */
    private String profitMedicalInstitution;
    /**
    * 院办电话
    */
    private String hospitalOfficeTelephone;
    /**
    * 院办传真
    */
    private String faxOfHospitalOffice;
    /**
    * 药剂科电话
    */
    private String pharmacyTelephone;
    /**
    * 医院类型
    */
    private String typeOfHospital;
    /**
    * 上年度药品收入
    */
    private String drugRevenueOfLastYear;
    /**
    * 上年度业务收入
    */
    private String businessIncomeOfLastYear;


    public Integer getMaintenanceTableId() {
        return maintenanceTableId;
    }

    public void setMaintenanceTableId(Integer maintenanceTableId) {
        this.maintenanceTableId = maintenanceTableId;
    }

    public String getNameOfHospital() {
        return nameOfHospital;
    }

    public void setNameOfHospital(String nameOfHospital) {
        this.nameOfHospital = nameOfHospital;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public String getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(String numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getProfitMedicalInstitution() {
        return profitMedicalInstitution;
    }

    public void setProfitMedicalInstitution(String profitMedicalInstitution) {
        this.profitMedicalInstitution = profitMedicalInstitution;
    }

    public String getHospitalOfficeTelephone() {
        return hospitalOfficeTelephone;
    }

    public void setHospitalOfficeTelephone(String hospitalOfficeTelephone) {
        this.hospitalOfficeTelephone = hospitalOfficeTelephone;
    }

    public String getFaxOfHospitalOffice() {
        return faxOfHospitalOffice;
    }

    public void setFaxOfHospitalOffice(String faxOfHospitalOffice) {
        this.faxOfHospitalOffice = faxOfHospitalOffice;
    }

    public String getPharmacyTelephone() {
        return pharmacyTelephone;
    }

    public void setPharmacyTelephone(String pharmacyTelephone) {
        this.pharmacyTelephone = pharmacyTelephone;
    }

    public String getTypeOfHospital() {
        return typeOfHospital;
    }

    public void setTypeOfHospital(String typeOfHospital) {
        this.typeOfHospital = typeOfHospital;
    }

    public String getDrugRevenueOfLastYear() {
        return drugRevenueOfLastYear;
    }

    public void setDrugRevenueOfLastYear(String drugRevenueOfLastYear) {
        this.drugRevenueOfLastYear = drugRevenueOfLastYear;
    }

    public String getBusinessIncomeOfLastYear() {
        return businessIncomeOfLastYear;
    }

    public void setBusinessIncomeOfLastYear(String businessIncomeOfLastYear) {
        this.businessIncomeOfLastYear = businessIncomeOfLastYear;
    }

}