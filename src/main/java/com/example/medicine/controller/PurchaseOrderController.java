package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.medicine.bean.DrugItems;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.service.PurchaseOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("PurchaseOrder")
public class PurchaseOrderController {

  @Autowired
  private PurchaseOrderService purchaseOrderService;

    @ResponseBody
    @RequestMapping(value = "findAllPurchaseOrder",produces = {"application/json;charset=utf-8"})
    public String findAllPurchaseOrder(@RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                       PurchaseOrder purchaseOrder){
        System.out.println(purchaseOrder.getPurchaseOrderNumber());
        PageInfo<PurchaseOrder> pageInfo=purchaseOrderService.selectAllPurchaseOrder(pageNum,5, purchaseOrder);
        JSONObject obj = new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",pageInfo.getPages());
        obj.put("data",pageInfo.getList());
        return obj.toString();
    }
    @ResponseBody
    @RequestMapping(value = "addAllPurchaseOrder",produces = {"application/json;charset=utf-8"})
    public int insert(String  purchaseOrders){
        PurchaseOrder purchaseOrder = null;
        if(purchaseOrders!=null && purchaseOrders!=""){
            JSON parse = (JSON) JSON.parse(purchaseOrders);
            purchaseOrder = JSON.toJavaObject(parse, PurchaseOrder.class);
        }
        int i = purchaseOrderService.insert(purchaseOrder);
        return i;
    }
    @ResponseBody
    @RequestMapping(value = "updateAllPurchaseOrder",produces = {"application/json;charset=utf-8"})
    public int updateDrugItem(String purchaseOrders){
            PurchaseOrder purchaseOrder = null;
        if(purchaseOrders!=null && purchaseOrders!=""){
            JSON parse = (JSON) JSON.parse(purchaseOrders);
            purchaseOrder = JSON.toJavaObject(parse, PurchaseOrder.class);
        }
        int i = purchaseOrderService.update(purchaseOrder);
        return i;
    }

}
