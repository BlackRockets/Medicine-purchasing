package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.medicine.bean.Drug;
import com.example.medicine.bean.HospitalTransactionPurchaseOrderWarehousingTable;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.bean.PurchaseOrderDetails;
import com.example.medicine.mapper.PurchaseOrderMapper;
import com.example.medicine.mapper.PurchaseWarehousingMapper;
import com.example.medicine.service.PurchaseOrderService;
import com.example.medicine.service.PurchaseWarehousingService;
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
@RequestMapping("PurchaseWarehousing")
public class PurchaseWarehousingController {

    @Autowired
    private PurchaseWarehousingService purchaseWarehousingService;

    @Autowired
    private PurchaseWarehousingMapper purchaseWarehousingMapper;

    @ResponseBody
    @RequestMapping(value = "findAllPurchaseOrder", produces = {"application/json;charset=utf-8"})
    public String findAllPurchaseOrder(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit,
                                       HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable,
                                       Drug drug, PurchaseOrder po, PurchaseOrderDetails pod) {
        if (page != null && limit != null) {
            hospitalTransactionPurchaseOrderWarehousingTable.setPageNum(page);
            hospitalTransactionPurchaseOrderWarehousingTable.setPageSize(limit);
            hospitalTransactionPurchaseOrderWarehousingTable.setDrug(drug);
            hospitalTransactionPurchaseOrderWarehousingTable.setPo(po);
            hospitalTransactionPurchaseOrderWarehousingTable.setPod(pod);
        }

        List<HospitalTransactionPurchaseOrderWarehousingTable> hospitalTransactionPurchaseOrderWarehousingTables = purchaseWarehousingService.selectAllPurchaseOrderWarehousing(hospitalTransactionPurchaseOrderWarehousingTable);
        Integer total = purchaseWarehousingMapper.selectCount(hospitalTransactionPurchaseOrderWarehousingTable);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", "0");
        //提示消息
        resultMap.put("msg", "");
        //数据（表格填充数据）
        resultMap.put("data", hospitalTransactionPurchaseOrderWarehousingTables);
        //分页总条数
        resultMap.put("count", total);

        String List = JSON.toJSONString(resultMap);
        return List;
    }

    @ResponseBody
    @RequestMapping(value = "Warehousing", produces = {"application/json;charset=utf-8"})
    public int Warehousing(String hospitalTransactionPurchaseOrderWarehousingTables) {
        HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable = null;
        if (hospitalTransactionPurchaseOrderWarehousingTables != null && hospitalTransactionPurchaseOrderWarehousingTables != "") {
            JSON parse = (JSON) JSON.parse(hospitalTransactionPurchaseOrderWarehousingTables);
            hospitalTransactionPurchaseOrderWarehousingTable = JSON.toJavaObject(parse, HospitalTransactionPurchaseOrderWarehousingTable.class);
        }
        int i = purchaseWarehousingService.insert(hospitalTransactionPurchaseOrderWarehousingTable);
        return i;
    }

}
