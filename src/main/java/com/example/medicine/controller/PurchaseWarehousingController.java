package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.service.PurchaseOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("PurchaseWarehousing")
public class PurchaseWarehousingController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @ResponseBody
    @RequestMapping(value = "findAllPurchaseOrder", produces = {"application/json;charset=utf-8"})
    public String findAllPurchaseOrder(@RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                       String purchaseOrderNumber, String nameOfPurchaseOrder,
                                       Integer hospitalId, Integer purchaseOrderStatus) {
        PageInfo<PurchaseOrder> pageInfo = purchaseOrderService.selectAllPurchaseOrderWarehousing(pageNum, 5, purchaseOrderNumber, nameOfPurchaseOrder, hospitalId, purchaseOrderStatus);
        JSONObject obj = new JSONObject();
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count", pageInfo.getPages());
        obj.put("data", pageInfo.getList());
        return obj.toString();
    }

    @ResponseBody
    @RequestMapping(value = "updateAllPurchaseOrder", produces = {"application/json;charset=utf-8"})
    public String updatePurchaseStatus(Integer purchaseOrderStatus) {
       int i=purchaseOrderService.updatePurchaseStatus(purchaseOrderStatus);
       return JSON.toJSONString(i);
    }
}
