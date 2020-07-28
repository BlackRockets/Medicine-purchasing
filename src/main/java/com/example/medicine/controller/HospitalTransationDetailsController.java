package com.example.medicine.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.medicine.bean.Hospital_Transaction_Details;
import com.example.medicine.service.HospitalTransationDetailsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("HospitalTransationDetials")
public class HospitalTransationDetailsController {

    @Autowired
    private HospitalTransationDetailsService hospitalTransationDetailsService;
    @ResponseBody
    @RequestMapping(value = "findAllHospitalTransationDetials",produces = {"application/json;charset=utf-8"})
    public String findAllHospitalTransationDetails(@RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                       Hospital_Transaction_Details hospital_transaction_details){
        PageInfo<Hospital_Transaction_Details> pageInfo=hospitalTransationDetailsService.selectAllHospitalTransationDetials(pageNum,5, hospital_transaction_details);
        JSONObject obj = new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",pageInfo.getPages());
        obj.put("data",pageInfo.getList());
        return obj.toString();
    }

}
