package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.*;
import com.example.medicine.service.HospitalTransationDetailsOrderService;
import com.example.medicine.serviceImpl.HospitalTransationDetailsOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value = "hospitalTransationDetailsOrder")
public class HospitalTransationDetailsOrderController {

    @Autowired
    HospitalTransationDetailsOrderServiceImpl hospitalTransationDetailsOrderService;


    @ResponseBody
    @RequestMapping(value = "hospitalTransationDetailsOrderFindAll",produces = {"application/json;charset=utf-8"})
    public String hospitalTransationDetailsOrderFindAll(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, Hospital_Transaction_Details hospital, Drug drug, Vendor_Information ven, HospitalInformationMaintenanceForm hos, PurchaseOrderDetails pur){
        hospital.setPageNum(page);
        hospital.setPageSize(limit);
        hospital.setDrug(drug);
        hospital.setVendor_information(ven);
        hospital.setHospitalInformationMaintenanceForm(hos);
        hospital.setPurchaseOrderDetails(pur);
        List<Hospital_Transaction_Details> hospitals = hospitalTransationDetailsOrderService.selectAll(hospital);
        int scount = hospitalTransationDetailsOrderService.scount(hospital);
        HashMap<Object, Object> resultMap = new HashMap<>();
        resultMap.put("code",0);
        resultMap.put("count",scount);
        resultMap.put("msg","");
        resultMap.put("data",hospitals);

        return JSON.toJSONString(resultMap);
    }
}
