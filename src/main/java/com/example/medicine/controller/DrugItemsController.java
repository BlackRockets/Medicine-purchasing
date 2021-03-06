package com.example.medicine.controller;

import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.DrugItems;
import com.example.medicine.common.ReturnUtil;
import com.example.medicine.mapper.DrugItemsMapper;
import com.example.medicine.service.DrugItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
    public String findAllDrugItems (@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer limit,DrugItems drugItemsDTO){
        if(page!=null && limit!=null){
            drugItemsDTO.setPageNum(page);
            drugItemsDTO.setPageSize(limit);
        }

        List<DrugItems> drugItems = drugItemService.selectAllDrugItems(drugItemsDTO);
        //查询总条数
        Integer total = drugItemsMapper.selectCount(drugItemsDTO);

        ReturnUtil returnUtil = new ReturnUtil();
        String data = returnUtil.getData(drugItems, total);

        return data;
    }

    @ResponseBody
    @RequestMapping(value = "addAllDrugItem",produces = {"application/json;charset=utf-8"})
    public int addAllDrugItem(String drugItems){
        DrugItems drugItems1 = null;
        if(drugItems!=null && drugItems!=""){
            JSON parse = (JSON) JSON.parse(drugItems);
            drugItems1 = JSON.toJavaObject(parse, DrugItems.class);
        }
        int i = drugItemService.addAllDrugItem(drugItems1);
        return i;
    }

    @ResponseBody
    @RequestMapping(value = "updateDrugItem",produces = {"application/json;charset=utf-8"})
    public int updateDrugItem(String drugItems){
        DrugItems drugItems2 = null;
        if(drugItems!=null && drugItems!=""){
            JSON parse = (JSON) JSON.parse(drugItems);
            drugItems2 = JSON.toJavaObject(parse, DrugItems.class);
        }
        int i = drugItemService.updateDrugItem(drugItems2);
        return i;
    }


    @ResponseBody
    @RequestMapping("doImport")
    public String doImport(@RequestParam("file") MultipartFile file){
        System.out.println(file);
        drugItemService.doImport(file);
        return "success";
    }

}
