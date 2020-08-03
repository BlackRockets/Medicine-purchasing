package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.HospitalInformationMaintenanceForm;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.mapper.PurchaseOrderMapper;
import com.example.medicine.service.PurchaseOrderService;
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
@RequestMapping("PurchaseOrderReview")
public class PurchaseOrderReviewController {
    @Autowired
    private PurchaseOrderService purchaseOrderService;
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    @ResponseBody
    @RequestMapping(value = "findAllPurchaseOrderReview", produces = {"application/json;charset=utf-8"})
    public String findAllPurchaseOrder(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit, PurchaseOrder purchaseOrder,
                                       HospitalInformationMaintenanceForm himf) {
        if (page != null && limit != null) {
            purchaseOrder.setPageNum(page);
            purchaseOrder.setPageSize(limit);
            purchaseOrder.setHimf(himf);
        }

        Integer total = purchaseOrderMapper.selectCount(purchaseOrder);
        List<PurchaseOrder> purchaseOrders = purchaseOrderService.selectAllPurchaseOrderReview(purchaseOrder);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", "0");
        //提示消息
        resultMap.put("msg", "");
        //数据（表格填充数据）
        resultMap.put("data", purchaseOrders);
        //分页总条数
        resultMap.put("count", total);

        String purchaseOrderList = JSON.toJSONString(resultMap);
        return purchaseOrderList;
    }
    @ResponseBody
    @RequestMapping(value = "updatePurchaseOrderReview", produces = {"application/json;charset=utf-8"})
    public int update(String purchaseOrders) {
        PurchaseOrder purchaseOrder = null;
        if (purchaseOrders != null && purchaseOrders != "") {
            JSON parse = (JSON) JSON.parse(purchaseOrders);
            purchaseOrder = JSON.toJavaObject(parse, PurchaseOrder.class);
        }
        int i = purchaseOrderService.update(purchaseOrder);
        return i;
    }
    @ResponseBody
    @RequestMapping(value = "pass", produces = {"application/json;charset=utf-8"})
    public String pass(@RequestParam("ids1") Integer[] ids1){
        List<Integer> Integers= Arrays.asList(ids1);
        int i= purchaseOrderService.pass(Integers);
        return JSON.toJSONString(i);
    }
    @ResponseBody
    @RequestMapping(value = "notPass", produces = {"application/json;charset=utf-8"})
    public String notPass(@RequestParam("ids2") Integer[] ids2){
        List<Integer> Integers= Arrays.asList(ids2);
        int i= purchaseOrderService.notPass(Integers);
        return JSON.toJSONString(i);
    }
}
