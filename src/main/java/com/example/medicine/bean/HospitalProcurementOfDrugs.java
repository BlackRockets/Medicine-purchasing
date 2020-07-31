package com.example.medicine.bean;

import java.io.Serializable;

/**
 * (HospitalProcurementOfDrugs)实体类
 *
 * @author makejava
 * @since 2020-07-29 15:37:11
 */
public class HospitalProcurementOfDrugs implements Serializable {
    private static final long serialVersionUID = 170716864764806247L;
    /**
     * id
     */
    private Integer procurementOfDrugsId;
    /**
     * 医院id
     */
    private String maintenanceTableId;
    /**
     * 药品信息id
     */
    private String informationOnDrugsId;
    /**
     * 供货商(企业)id
     */
    private String supplierId;


    public Integer getProcurementOfDrugsId() {
        return procurementOfDrugsId;
    }

    public void setProcurementOfDrugsId(Integer procurementOfDrugsId) {
        this.procurementOfDrugsId = procurementOfDrugsId;
    }

    public String getMaintenanceTableId() {
        return maintenanceTableId;
    }

    public void setMaintenanceTableId(String maintenanceTableId) {
        this.maintenanceTableId = maintenanceTableId;
    }

    public String getInformationOnDrugsId() {
        return informationOnDrugsId;
    }

    public void setInformationOnDrugsId(String informationOnDrugsId) {
        this.informationOnDrugsId = informationOnDrugsId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

}