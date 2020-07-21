package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.DrugItems;
import com.example.medicine.mapper.DrugItemsMapper;
import com.example.medicine.service.DrugItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/drugItem")
public class DrugItemsController {
    @Autowired
    private DrugItemService drugItemService;
    @Autowired
    private DrugItemsMapper drugItemsMapper;
    @ResponseBody
    @RequestMapping(value = "findAllDrugItems",produces = {"application/json;charset=utf-8"})
    public String findAllDrugItems (@RequestParam Integer page,@RequestParam Integer limit, DrugItems drugItemsdto){
        drugItemsdto.setPageNum(page);
        drugItemsdto.setPageSize(limit);
        List<DrugItems> drugItems = drugItemService.selectAllDrugItems(drugItemsdto);
        //查询总条数
        Integer total = drugItemsMapper.selectCount();

        Map<String,Object> resultMap = new HashMap();

        //状态码，成功0，失败1
        resultMap.put("code","0");
        //提示消息
        resultMap.put("msg","");
        //数据（表格填充数据）
        resultMap.put("data",drugItems);
        //分页总条数
        resultMap.put("count",total);

        String drugItemList = JSON.toJSONString(resultMap);
        return drugItemList;
    }


@RequestMapping(value = "aaa")
    public String aaa(){
        return "123";
    }


}
