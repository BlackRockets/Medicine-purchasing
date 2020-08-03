package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.medicine.bean.*;
import com.example.medicine.common.ReturnUtil;
import com.example.medicine.mapper.PurchaseOrderMapper;
import com.example.medicine.service.PurchaseOrderService;
import com.github.pagehelper.PageInfo;
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
@RequestMapping("PurchaseOrder")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    @ResponseBody
    @RequestMapping(value = "findAllPurchaseOrder", produces = {"application/json;charset=utf-8"})
    public String findAllPurchaseOrder(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit, PurchaseOrder purchaseOrder,
                                       HospitalInformationMaintenanceForm himf) {
        if (page != null && limit != null) {
            purchaseOrder.setPageNum(page);
            purchaseOrder.setPageSize(limit);
            purchaseOrder.setHimf(himf);
        }
        Integer total = purchaseOrderMapper.selectCount(purchaseOrder);
        List<PurchaseOrder> purchaseOrders = purchaseOrderService.selectAllPurchaseOrder(purchaseOrder);

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
    @RequestMapping(value = "addAllPurchaseOrder", produces = {"application/json;charset=utf-8"})
    public int insert(String purchaseOrders) {
        PurchaseOrder purchaseOrder = null;
        if (purchaseOrders != null && purchaseOrders != "") {
            JSON parse = (JSON) JSON.parse(purchaseOrders);
            purchaseOrder = JSON.toJavaObject(parse, PurchaseOrder.class);
        }
        int i = purchaseOrderService.insert(purchaseOrder);
        return i;
    }

    @ResponseBody
    @RequestMapping(value = "updateAllPurchaseOrder", produces = {"application/json;charset=utf-8"})
    public int updatePurchaseOrder(String purchaseOrders) {
        PurchaseOrder purchaseOrder = null;
        if (purchaseOrders != null && purchaseOrders != "") {
            JSON parse = (JSON) JSON.parse(purchaseOrders);
            purchaseOrder = JSON.toJavaObject(parse, PurchaseOrder.class);
        }
        int i = purchaseOrderService.update(purchaseOrder);
        return i;
    }
    //保存采购量
    @ResponseBody
    @RequestMapping(value = "saveCount",produces = {"application/json;charset=utf-8"})
    public int savePurchaseCount(@RequestBody List<PurchaseOrderDetails> purchaseOrderDetail){
        purchaseOrderService.savePurchaseCount(purchaseOrderDetail);
        return 1;
    }
    //获取每个采购单中的药品
    @ResponseBody
    @RequestMapping(value = "findDrugByPurchaseOrderId", produces = {"application/json;charset=utf-8"})
    public String findDrugByReturnOrderId(PurchaseOrder purchaseOrder) {
        List<Drug> drugList = purchaseOrderService.findByPurchaseOrderId(purchaseOrder);
        ReturnUtil returnUtil = new ReturnUtil();
        String data = returnUtil.getData(drugList, 100);
        return data;
    }

    //批量删除采购单
    @ResponseBody
    @RequestMapping(value = "deleteAll", produces = {"application/json;charset=utf-8"})
    public String deleteAll(@RequestParam("ids") Integer[] ids) {
        List<Integer> Integers = Arrays.asList(ids);
        int i = purchaseOrderService.deleteAll(Integers);
        return JSON.toJSONString(i);
    }

    //提交采购单
    @ResponseBody
    @RequestMapping(value = "submitPurchaseOrder", produces = {"application/json;charset=utf-8"})
    public int submitPurchaseOrder(@RequestParam String purchaseId) {
        Integer integer = Integer.valueOf(purchaseId);
        return purchaseOrderService.submitPurchaseOrder(integer);
    }

    //添加药品到采购单
    @ResponseBody
    @RequestMapping(value = "insertDrug", produces = {"application/json;charset=utf-8"})
    public int insertDrug(@RequestBody List<PurchaseOrderDetails> purchaseOrderDetail) {
        purchaseOrderService.insertDrug(purchaseOrderDetail);
        return 1;
    }

    //删除采购单药品
    @ResponseBody
    @RequestMapping(value = "deleteDrug", produces = {"application/json;charset=utf-8"})
    public int deleteDrug(String[] ids) {
        return purchaseOrderService.deleteDrug(ids);
    }

}
