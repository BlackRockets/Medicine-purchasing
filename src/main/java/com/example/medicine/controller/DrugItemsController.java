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
    public String findAllDrugItems (@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer limit, @RequestParam(required = false) String drugItemsDTO){
        DrugItems drugItemsDTO1;
        if(drugItemsDTO!=null && drugItemsDTO!=""){
            JSON parse = (JSON) JSON.parse(drugItemsDTO);
            drugItemsDTO1 = JSON.toJavaObject(parse, DrugItems.class);
        }else{
            drugItemsDTO1 = new DrugItems();
        }


        if(page!=null && limit!=null){
            drugItemsDTO1.setPageNum(page);
            drugItemsDTO1.setPageSize(limit);
        }

        List<DrugItems> drugItems = drugItemService.selectAllDrugItems(drugItemsDTO1);
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

    @ResponseBody
    @RequestMapping("addAllDrugItem")
    public int addAllDrugItem(String drugItems){
        DrugItems drugItems1 = null;
        if(drugItems!=null && drugItems!=""){
            JSON parse = (JSON) JSON.parse(drugItems);
            drugItems1 = JSON.toJavaObject(parse, DrugItems.class);
        }
        int i = drugItemService.addAllDrugItem(drugItems1);
        return i;
    }


}
