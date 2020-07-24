package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.Drug;
import com.example.medicine.serviceImpl.CancelTheSupplyServiceImpl;
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
@RequestMapping(value = "cancelTheSupply")
public class CancelTheSupplyController {
    @Autowired
    CancelTheSupplyServiceImpl cancelTheSupplyService;

    @ResponseBody
    @RequestMapping(value = "selectCancelTheSupplyFindAll",produces = {"application/json;charset=utf-8"})
    public String selectCancelTheSupplyFindAll(@RequestParam("page")Integer page, @RequestParam("limit")Integer limit, Drug drug){
       drug.setPageNum(page);
       drug.setPageSize(limit);
        List<Drug> drugs = cancelTheSupplyService.selectAllDrugs(drug);
        Integer integer = cancelTheSupplyService.selectCount(drug);
        HashMap<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data",drugs);
        resultMap.put("code",0);
        resultMap.put("count",integer);
        resultMap.put("msg","");

        return JSON.toJSONString(resultMap);
    }
    @ResponseBody
    @RequestMapping(value = "delCancelTheSupply",produces = {"application/json;charset=utf-8"})
    public String delCancelTheSupply(@RequestParam("drugs")Integer[] drugs){
        List<Integer> integers = Arrays.asList(drugs);
        List<Drug> selectDrugs = cancelTheSupplyService.selectBatch(integers);
        int i = cancelTheSupplyService.updateBatch(selectDrugs);
        Map<String,Object> resultMap = new HashMap();
        resultMap.put("counts",integers.size());
        resultMap.put("successCount",i);
        resultMap.put("errorCount",integers.size()-1);

        return JSON.toJSONString(resultMap);
    }


}
