package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.medicine.bean.*;
import com.example.medicine.mapper.Hospital_Transaction_DetailsMapper;
import com.example.medicine.service.HospitalTransationDetailsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("HospitalTransationDetials")
public class HospitalTransationDetailsController {

    @Autowired
    private HospitalTransationDetailsService hospitalTransationDetailsService;

    @Autowired
    private Hospital_Transaction_DetailsMapper hospital_transaction_detailsMapper;
    @ResponseBody
    @RequestMapping(value = "findAllHospitalTransationDetials",produces = {"application/json;charset=utf-8"})
    public String findAllHospitalTransationDetails(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit,
                                                   Hospital_Transaction_Details hospital_transaction_details, Drug drug, Vendor_Information vi,PurchaseOrder po,HospitalInformationMaintenanceForm himf) {
            if (page != null && limit != null) {
                hospital_transaction_details.setPageNum(page);
                hospital_transaction_details.setPageSize(limit);
                hospital_transaction_details.setDrug(drug);
                hospital_transaction_details.setVi(vi);
                hospital_transaction_details.setPo(po);
                hospital_transaction_details.setHimf(himf);
            }

            Integer total = hospital_transaction_detailsMapper.selectCount(hospital_transaction_details);
            List<Hospital_Transaction_Details> hospital_transaction_details1 = hospitalTransationDetailsService.selectAllHospitalTransationDetials(hospital_transaction_details);

            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("code", "0");
            //提示消息
            resultMap.put("msg", "");
            //数据（表格填充数据）
            resultMap.put("data", hospital_transaction_details1);
            //分页总条数
            resultMap.put("count", total);

            String List = JSON.toJSONString(resultMap);
            return List;
        }
    }