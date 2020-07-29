package com.example.medicine.service;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.Hospital_Transaction_Return_Form;
import com.example.medicine.bean.PurchaseOrder;

import com.github.pagehelper.PageInfo;

import java.util.List;


public interface PurchaseOrderService {

    //按采购单查询

    List<PurchaseOrder> queryAllPurchaseOrder(PurchaseOrder purchaseOrder);

    //采购单维护查询

    List<PurchaseOrder> selectAllPurchaseOrder(PurchaseOrder purchaseOrder);

    //添加采购单
    int insert(PurchaseOrder purchaseOrder);

    //修改采购单
    int update(PurchaseOrder purchaseOrder);

    //采购单入库
    int updatePurchaseStatus(PurchaseOrder purchaseOrder);

    //查询每个采购单的药品
    List<Drug> findByPurchaseOrderId(PurchaseOrder purchaseOrder);
}
