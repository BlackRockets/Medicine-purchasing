package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.medicine.bean.Drug;
import com.example.medicine.bean.DrugItems;
import com.example.medicine.bean.Hospital_Transaction_Return_Form;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.common.ReturnUtil;
import com.example.medicine.mapper.PurchaseOrderMapper;
import com.example.medicine.service.PurchaseOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String findAllPurchaseOrder(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit, PurchaseOrder purchaseOrder) {
        if (page != null && limit != null) {
            purchaseOrder.setPageNum(page);
            purchaseOrder.setPageSize(limit);
        }

        Integer total = purchaseOrderMapper.selectCount(purchaseOrder);
        List<PurchaseOrder> purchaseOrders = purchaseOrderService.queryAllPurchaseOrder(purchaseOrder);

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
    public int updateDrugItem(String purchaseOrders) {
        PurchaseOrder purchaseOrder = null;
        if (purchaseOrders != null && purchaseOrders != "") {
            JSON parse = (JSON) JSON.parse(purchaseOrders);
            purchaseOrder = JSON.toJavaObject(parse, PurchaseOrder.class);
        }
        int i = purchaseOrderService.update(purchaseOrder);
        return i;
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

}
