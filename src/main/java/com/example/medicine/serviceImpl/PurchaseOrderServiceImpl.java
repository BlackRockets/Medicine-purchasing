package com.example.medicine.serviceImpl;

import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.mapper.PurchaseOrderMapper;
import com.example.medicine.service.PurchaseOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;


    @Override
    public PageInfo<PurchaseOrder> selectAllPurchaseOrder(Integer pageNum,Integer pageSize,String purchaseOrderNumber, String nameOfPurchaseOrder, String nameOfHospital, Integer purchaseOrderStatus, Integer supplierId) {
        PageHelper.startPage(pageNum,pageSize);
        List<PurchaseOrder> purchaseOrders=purchaseOrderMapper.selectAllPurchaseOrder(purchaseOrderNumber,purchaseOrderNumber,nameOfHospital,purchaseOrderStatus,supplierId);
        PageInfo<PurchaseOrder> info=new PageInfo<>(purchaseOrders);
        return info;

    }
}
