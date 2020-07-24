package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.SupplierDrugListControl;
import com.example.medicine.mapper.SupplierDrugListControlMapper;
import com.example.medicine.service.SupplierDrugListControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierDrugListControlServiceImpl implements SupplierDrugListControlService {
    @Autowired
    SupplierDrugListControlMapper supplierDrugListControlMapper;

    @Override
    public List<SupplierDrugListControl> selectAllDrugs(SupplierDrugListControl supplier) {
        int i = (supplier.getPageNum() - 1) * supplier.getPageSize();
        supplier.setPageStart(i);
        List<SupplierDrugListControl> drugs = supplierDrugListControlMapper.selectAllDrugs(supplier);
        return drugs;
    }

    @Override
    public Integer selectCount(SupplierDrugListControl supplier) {
        Integer integer = supplierDrugListControlMapper.selectCount(supplier);
        return integer;
    }

    @Override
    public SupplierDrugListControl selectSupplierDrugListControl(Integer id) {
        SupplierDrugListControl supplierDrugListControl = supplierDrugListControlMapper.selectSupplierDrugListControl(id);
        return supplierDrugListControl;
    }
}
