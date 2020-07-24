package com.example.medicine.mapper;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.SupplierDrugListControl;

import java.util.List;

public interface SupplierDrugListControlMapper {
    List<SupplierDrugListControl> selectAllDrugs(SupplierDrugListControl supplier);

    Integer selectCount(SupplierDrugListControl supplier);

    SupplierDrugListControl selectSupplierDrugListControl(Integer id);
}
