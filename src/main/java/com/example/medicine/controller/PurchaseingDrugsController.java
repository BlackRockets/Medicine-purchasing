package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.Drug;
import com.example.medicine.serviceImpl.DrugServiceImpl;
import com.example.medicine.serviceImpl.HospitalProcurementOfDrugsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "purchaseingDrugs")
public class PurchaseingDrugsController {

    @Autowired
    DrugServiceImpl drugService;

    @Autowired
    HospitalProcurementOfDrugsServiceImpl hospitalProcurementOfDrugsService;

    @ResponseBody
    @RequestMapping(value = "findAllPurchaseingDrugs",produces = {"application/json;charset=utf-8"})
    public String findAllPurchaseingDrugs(@RequestParam("page")Integer page, @RequestParam("limit")Integer limit, Drug drug){


        drug.setPageNum(page);
        drug.setPageSize(limit);
        List<Drug> drugs = drugService.findAllPurchaseingDrugs(drug);
        int count = drugService.selectPurchaseingDrugsCount(drug);
        Map<String,Object> resultMap = new HashMap();
        resultMap.put("data",drugs);
        //状态码，成功0，失败1
        resultMap.put("code",0);
        //提示消息
        resultMap.put("msg","");
        //分页总条数
        resultMap.put("count",count);

        return JSON.toJSONString(resultMap);
    }

    @ResponseBody
    @RequestMapping(value = "delPurchaseingDrugs",produces = {"application/json;charset=utf-8"})
    public String delPurchaseingDrugs(@RequestParam("drugs")Integer[] drugs){
        List<Integer> integers = Arrays.asList(drugs);

        //先批量查询
        List<Drug> selectDrugs = drugService.selectPurchaseDrugs(integers);
        //先批量修改
        int update = drugService.updatePurchaseDrugs(selectDrugs);
        //先批量天极爱按
        int insert = hospitalProcurementOfDrugsService.insertBatch(selectDrugs);

        Map<String,Object> resultMap = new HashMap();
        resultMap.put("counts",drugs.length);
        resultMap.put("successCount",insert);
        resultMap.put("errorCount",(drugs.length-insert));

        return JSON.toJSONString(resultMap);
    }

    @ResponseBody
    @RequestMapping(value = "findPurchaseingDrugs",produces = {"application/json;charset=utf-8"})
    public String findPurchaseingDrugs(Integer id){
        Drug drug = drugService.selectByPrimaryKey(id);
        return JSON.toJSONString(drug);
    }

}
