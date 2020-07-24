package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.Drug;
import com.example.medicine.serviceImpl.SelectSuppliersServiceImpl;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "selectSuppliers")
public class SelectSuppliersContriller {

    @Autowired
    SelectSuppliersServiceImpl selectSuppliersService;

    @ResponseBody
    @RequestMapping(value = "selectSuppliersFindAll",produces = {"application/json;charset=utf-8"})
    public String selectSuppliersFindAll(@RequestParam("page")Integer page, @RequestParam("limit")Integer limit, Drug drug){
        drug.setPageNum(page);
        drug.setPageSize(limit);
        System.out.println(drug);
        List<Drug> drugs = selectSuppliersService.selectAllDrugs(drug);
        Integer count = selectSuppliersService.selectCount(drug);
        HashMap<Object, Object> resultMap = new HashMap<>();
        resultMap.put("code",0);
        resultMap.put("data",drugs);
        resultMap.put("msg","");
        resultMap.put("count",count);

        return JSON.toJSONString(resultMap);
    }

    @ResponseBody
    @RequestMapping(value = "delSuppliersFindAll",produces = {"application/json;charset=utf-8"})
    public String delSuppliersFindAll(@RequestParam("drugs")Integer[] drugs){
        List<Integer> integers = Arrays.asList(drugs);
        List<Drug> selectDrugs = selectSuppliersService.selectBatch(integers);
        int i = selectSuppliersService.updateBatch(selectDrugs);

        Map<String,Object> resultMap = new HashMap();
        resultMap.put("counts",integers.size());
        resultMap.put("successCount",i);
        resultMap.put("errorCount",(integers.size()-i));

        return JSON.toJSONString(resultMap);

    }
    @ResponseBody
    @RequestMapping(value = "selectSuppliersById",produces = {"application/json;charset=utf-8"})
    public String selectSuppliersById(Integer id){
        Drug drug = selectSuppliersService.selectById(id);
        System.out.println(drug);
        return JSON.toJSONString(drug);
    }
}
