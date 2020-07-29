package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.Drug;
import com.example.medicine.mapper.DrugMapper;
import com.example.medicine.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Drug")
public class DrupController {

    @Autowired
    private DrugService drugService;

    @Autowired
    private DrugMapper drugMapper;

    @ResponseBody
    @RequestMapping(value = "findAllDrug", produces = {"application/json;charset=utf-8"})
    public String findAllDrug(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit, Drug drug) {
        if (page != null && limit != null) {
            drug.setPageNum(page);
            drug.setPageSize(limit);
        }
            Integer total = drugMapper.selectCount(drug);

            List<Drug> drugs = drugService.selectAllDrug(drug);

            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("code", "0");
            //提示消息
            resultMap.put("msg", "");
            //数据（表格填充数据）
            resultMap.put("data", drugs);
            //分页总条数
            resultMap.put("count", total);

            String drugList = JSON.toJSONString(resultMap);
            return drugList;
        }

    }
