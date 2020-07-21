package com.example.medicine.service;

import com.example.medicine.bean.PurchaseOrder;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Results;

import java.util.List;
import java.util.Map;

public interface PurchaseOrderService {


     PageInfo<PurchaseOrder> selectAllPurchaseOrder(
                                                    Integer pageNum,
                                                    Integer pageSize,
                                                    String purchaseOrderNumber,
                                                    String nameOfPurchaseOrder,
                                                    String nameOfHospital,
                                                    Integer purchaseOrderStatus,
                                                    Integer supplierId);

}
