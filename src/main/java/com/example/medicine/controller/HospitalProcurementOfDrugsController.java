package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.Drug;
import com.example.medicine.bean.HospitalProcurementOfDrugs;
import com.example.medicine.serviceImpl.DrugServiceImpl;
import com.example.medicine.serviceImpl.HospitalProcurementOfDrugsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "hospitalProcurementOfDrugs")
public class HospitalProcurementOfDrugsController {

    @Autowired
    HospitalProcurementOfDrugsServiceImpl hospitalProcurementOfDrugsService;

    @Autowired
    DrugServiceImpl drugService;

    @ResponseBody
    @RequestMapping(value = "findHospitalProcurementOfDrugs")
    public String findHospitalProcurementOfDrugs(@RequestParam("page")Integer page, @RequestParam("limit")Integer limit, Drug drug){
        drug.setPageNum(page);
        drug.setPageSize(limit);
        List<HospitalProcurementOfDrugs> hospitalProcurementOfDrugs = hospitalProcurementOfDrugsService.selectAll(drug);
        int count = hospitalProcurementOfDrugsService.selectCount(drug);
        Map<String,Object> resultMap = new HashMap();
        resultMap.put("data",hospitalProcurementOfDrugs);
        //状态码，成功0，失败1
        resultMap.put("code",0);
        //提示消息
        resultMap.put("msg","");
        //分页总条数
        resultMap.put("count",count);

        return JSON.toJSONString(resultMap);

    }
    @ResponseBody
    @RequestMapping(value = "selectHospitalProcurementOfDrugs",produces = {"application/json;charset=utf-8"})
    public String selectHospitalProcurementOfDrugs(@RequestParam("id") Integer id){
        HospitalProcurementOfDrugs hospitalProcurementOfDrugs = hospitalProcurementOfDrugsService.selectById(id);
        return JSON.toJSONString(hospitalProcurementOfDrugs);
    }

    @ResponseBody
    @RequestMapping(value = "delhospitalProcurementOfDrugs",produces = {"application/json;charset=utf-8"})
    public String delhospitalProcurementOfDrugs(@RequestParam("drugs")Integer[] drugs){
        List<Integer> integers = Arrays.asList(drugs);

        //先批量查询
        List<Drug> selectDrugs = drugService.selectPurchaseDrugs(integers);

       //先批量修改
        int i = hospitalProcurementOfDrugsService.updateBatch(selectDrugs);

        int i1 = hospitalProcurementOfDrugsService.deleteBatch(integers);

        Map<String,Object> resultMap = new HashMap();
        resultMap.put("counts",drugs.length);
        resultMap.put("successCount",i1);
        resultMap.put("errorCount",(drugs.length-i1));

        return JSON.toJSONString(resultMap);

    }

}
