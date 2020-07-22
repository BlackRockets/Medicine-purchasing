package com.example.medicine.service;

import com.example.medicine.bean.PurchaseOrder;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Results;

import java.util.List;
import java.util.Map;

public interface PurchaseOrderService {

     //按采购单查询
     PageInfo<PurchaseOrder> queryAllPurchaseOrder(
                                                    Integer pageNum,
                                                    Integer pageSize,
                                                    String purchaseOrderNumber,
                                                    String nameOfPurchaseOrder,
                                                    String nameOfHospital,
                                                    Integer purchaseOrderStatus,
                                                    Integer supplierId);
     //采购单维护查询
     PageInfo<PurchaseOrder> selectAllPurchaseOrder(
             Integer pageNum,
             Integer pageSize,
             PurchaseOrder purchaseOrder);

     //采购单入库前查询
     PageInfo<PurchaseOrder> selectAllPurchaseOrderWarehousing(
             Integer pageNum,
             Integer pageSize,
             String purchaseOrderNumber,
             String nameOfPurchaseOrder,
             Integer hospitalId,
             Integer purchaseOrderStatus);
      //添加采购单
     int insert(PurchaseOrder purchaseOrder);
     //修改采购单
     int update(PurchaseOrder purchaseOrder);

     //采购单入库
     int updatePurchaseStatus(Integer purchaseOrderStatus);
}
