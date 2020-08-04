package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.Drug;
import com.example.medicine.bean.SupplierDrugListControl;
import com.example.medicine.bean.Vendor_Information;
import com.example.medicine.serviceImpl.SupplierDrugListControlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping(value = "supplierDrugListControl")
public class SupplierDrugListControlController {
    @Autowired
    SupplierDrugListControlServiceImpl supplierDrugListControlService;

    @ResponseBody
    @RequestMapping(value = "supplierDrugListControlFindAll",produces = {"application/json;charset=utf-8"})
    public String SupplierDrugListControlFindAll(@RequestParam("page")Integer page, @RequestParam("limit")Integer limit, SupplierDrugListControl supplier, Drug drug, Vendor_Information vendor){
        supplier.setPageNum(page);
        supplier.setPageSize(limit);
        supplier.setDrug(drug);
        supplier.setVendor_information(vendor);
        List<SupplierDrugListControl> drugs = supplierDrugListControlService.selectAllDrugs(supplier);
        Integer integer = supplierDrugListControlService.selectCount(supplier);
        HashMap<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data",drugs);
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count",integer);
        return JSON.toJSONString(resultMap);

    }

    @ResponseBody
    @RequestMapping(value = "selectSupplierDrugListControl",produces = {"application/json;charset=utf-8"})
    public String selectSupplierDrugListControl(Integer id){
        SupplierDrugListControl supplierDrugListControl = supplierDrugListControlService.selectSupplierDrugListControl(id);
        return JSON.toJSONString(supplierDrugListControl);
    }

    @ResponseBody
    @RequestMapping(value = "supplierDrugListControlUpdate",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String updateSuppliersFindAll(@RequestBody List<SupplierDrugListControl> drugs){
        System.out.println(drugs);
        int i = supplierDrugListControlService.updateStatus(drugs);
        HashMap<Object, Object> resultMap = new HashMap<>();
        resultMap.put("successCount",i);
        resultMap.put("errorCount",drugs.size()-i);
        resultMap.put("count",drugs.size());
        return JSON.toJSONString(resultMap);

    }

}
