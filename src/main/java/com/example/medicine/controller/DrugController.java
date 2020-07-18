package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.Drug;
import com.example.medicine.bean.DrugItems;
import com.example.medicine.service.DrugItemService;
import com.example.medicine.serviceImpl.DrugServiceImpl;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "drug")
public class DrugController {

    @Autowired
    DrugServiceImpl drugService;

    @Autowired
    DrugItemService drugItemService;

    @ResponseBody
    @RequestMapping(value = "findAllDrugs",produces = {"application/json;charset=utf-8"})
    public String findAllDrugs(@RequestParam("page")Integer page,@RequestParam("limit")Integer limit,Drug drug){
        drug.setPageNum(page);
        drug.setPageSize(limit);
        System.out.println(drug);
        List<Drug> drugs = drugService.selectAllDrugs(drug);
        for (Drug drug1 : drugs) {
            System.out.println(drug1);
        }
        int count = drugService.selectCount();
        Map<String,Object> resultMap = new HashMap();
        resultMap.put("data",drugs);
        //状态码，成功0，失败1
        resultMap.put("code",0);
        //提示消息
        resultMap.put("msg","");
        //分页总条数
        resultMap.put("count",count);
        String drugList = JSON.toJSONString(resultMap);

        return drugList;
    }

    @ResponseBody
    @RequestMapping(value = "addDrug",produces = {"application/json;charset=utf-8"})
    public String addDrug(@RequestBody Drug drug){
        Map<String,Object> resultMap = new HashMap();
       /* List<DrugItems> drugItems = drugItemService.selectDrugItemsNo();
        for (DrugItems drugItem : drugItems) {
            if (drug.getDosageForm().equals(drugItem.getDosageForm())){
                resultMap.put("msg",0);
                resultMap.put("drug",drug);
                return JSON.toJSONString(resultMap);
            }
        }*/
        int i = drugService.insertSelective(drug);
        if (i == 1){
            resultMap.put("msg",1);
        }else {
            resultMap.put("msg",2);
        }
        return JSON.toJSONString(resultMap);
    }


    @ResponseBody
    @RequestMapping(value = "editDrug",produces = {"application/json;charset=utf-8"})
    public String editDrug(Integer id){
        Drug drug = drugService.selectByPrimaryKey(id);
        return JSON.toJSONString(drug);
    }



    @ResponseBody
    @RequestMapping(value = "editDrugData",produces = {"application/json;charset=utf-8"})
    public String editDrugData(@RequestBody Drug drug){
        Map<String,Object> resultMap = new HashMap();
        /*List<DrugItems> drugItems = drugItemService.selectDrugItemsNo();
        for (DrugItems drugItem : drugItems) {
            if (drug.getDosageForm().equals(drugItem.getDosageForm())){
                resultMap.put("msg",0);
                resultMap.put("drug",drug);
                return JSON.toJSONString(resultMap);
            }
        }*/
        int i = drugService.updateByPrimaryKeySelective(drug);
        if (i == 1){
            resultMap.put("msg",1);
        }else {
            resultMap.put("msg",2);
        }
        return JSON.toJSONString(resultMap);
    }

    @ResponseBody
    @RequestMapping(value = "delDrug",produces = {"application/json;charset=utf-8"})
    public String delDrug(Integer id){
        Map<String,Object> resultMap = new HashMap();
        int i = drugService.deleteByPrimaryKey(id);
        if (i == 1){
            resultMap.put("msg",1);
        }else {
            resultMap.put("msg",2);
        }
        return JSON.toJSONString(resultMap);
    }

    @ResponseBody
    @RequestMapping(value = "searchDrug",produces = {"application/json;charset=utf-8"})
    public String searchDrug(Integer id){
        Drug drug = drugService.selectByPrimaryKey(id);
        return JSON.toJSONString(drug);
    }


}
