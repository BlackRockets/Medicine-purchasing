package com.example.medicine.bean;

public class HospitalProcurementOfDrugs {
    private Integer procurementOfDrugsId;

    private Integer maintenanceTableId;

    private Integer informationOnDrugsId;

    private Integer supplierId;

    private Drug drug;

    private Vendor_Information  vendor_information;

    @Override
    public String toString() {
        return "HospitalProcurementOfDrugs{" +
                "procurementOfDrugsId=" + procurementOfDrugsId +
                ", maintenanceTableId=" + maintenanceTableId +
                ", informationOnDrugsId=" + informationOnDrugsId +
                ", supplierId=" + supplierId +
                ", drug=" + drug +
                ", vendor_information=" + vendor_information +
                '}';
    }

    public Integer getProcurementOfDrugsId() {
        return procurementOfDrugsId;
    }

    public void setProcurementOfDrugsId(Integer procurementOfDrugsId) {
        this.procurementOfDrugsId = procurementOfDrugsId;
    }

    public Integer getMaintenanceTableId() {
        return maintenanceTableId;
    }

    public void setMaintenanceTableId(Integer maintenanceTableId) {
        this.maintenanceTableId = maintenanceTableId;
    }

    public Integer getInformationOnDrugsId() {
        return informationOnDrugsId;
    }

    public void setInformationOnDrugsId(Integer informationOnDrugsId) {
        this.informationOnDrugsId = informationOnDrugsId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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
