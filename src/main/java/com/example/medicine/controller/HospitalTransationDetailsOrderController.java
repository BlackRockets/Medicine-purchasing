package com.example.medicine.controller;

import com.example.medicine.bean.Drug;
import com.example.medicine.service.HospitalTransationDetailsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "hospitalTransationDetailsOrder")
public class HospitalTransationDetailsOrderController {

    @Autowired
    HospitalTransationDetailsOrderService hospitalTransationDetailsOrderService;


    @ResponseBody
    @RequestMapping(value = "hospitalTransationDetailsOrderFindAll",produces = {"application/json;charset=utf-8"})
    public String hospitalTransationDetailsOrderFindAll(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, Drug drug){





        return "";
    }
}
