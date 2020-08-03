package com.example.medicine.service;

import com.example.medicine.bean.*;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface PurchaseOrderService {

    //按采购单查询

    List<PurchaseOrder> queryAllPurchaseOrder(PurchaseOrder purchaseOrder);

    //采购单处理查询
    List<PurchaseOrder> selectAllPurchaseOrderProcessing(PurchaseOrder purchaseOrder);

    //采购单审核查询

    List<PurchaseOrder> selectAllPurchaseOrderReview(PurchaseOrder purchaseOrder);
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

    //批量删除
    int deleteAll(List<Integer> list);
    //选择发货
    int deliver(List<Integer> ids);
    //无法供货
    int unSupply(List<Integer> ids);
    //入库
    int warehousing(List list);
    //采购单审核同过
    int pass(List<Integer> ids);
    //采购单审核不通过
    int notPass(List<Integer> ids);

    //导入发货清单
    void doImport(MultipartFile file);

    //提交采购单
    int submitPurchaseOrder(Integer purchaseId);

    //保存采购量
    void savePurchaseCount(List<PurchaseOrderDetails> purchaseOrderDetail);
    //删除采购单中的药品
    int deleteDrug(String[] ids);
    //添加药品到退货单
    void insertDrug(List<PurchaseOrderDetails> purchaseOrderDetails);



}
