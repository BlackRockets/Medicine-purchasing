package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.medicine.bean.*;
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
@RequestMapping("queryPurchaseOrder")
public class QueryByPurchaseOrderController {
    @Autowired
    private PurchaseOrderService purchaseOrderService;
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    @ResponseBody
    @RequestMapping(value = "findAllPurchaseOrder", produces = {"application/json;charset=utf-8"})

    public String findAllPurchaseOrder(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit, PurchaseOrder purchaseOrder,
                                       PurchaseOrderDetails pod, Drug drug, HospitalInformationMaintenanceForm himf, Vendor_Information vi) {
        if (page != null && limit != null) {
            purchaseOrder.setPageNum(page);
            purchaseOrder.setPageSize(limit);
            purchaseOrder.setHimf(himf);
            purchaseOrder.setPod(pod);
            purchaseOrder.setDrug(drug);
            purchaseOrder.setVi(vi);
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


}
