package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.Hospital_Transaction_Return_Form;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.mapper.DrugMapper;
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
    @Autowired
    private DrugMapper drugMapper;


    @Override
    public List<PurchaseOrder> queryAllPurchaseOrder(PurchaseOrder purchaseOrder) {
        return null;
    }

    @Override
    public List<PurchaseOrder> selectAllPurchaseOrder(PurchaseOrder purchaseOrder) {
        return null;
    }


    @Override
    public int insert(PurchaseOrder purchaseOrder) {
        int insert = purchaseOrderMapper.insert(purchaseOrder);
        return insert;
    }

    @Override
    public int update(PurchaseOrder purchaseOrder) {
        int update = purchaseOrderMapper.updateByPrimaryKey(purchaseOrder);
        return update;
    }

    @Override
    public int updatePurchaseStatus(PurchaseOrder purchaseOrder) {
        int i = purchaseOrderMapper.updateByPrimaryKeySelective(purchaseOrder);
        return i;
    }

    @Override
    public List<Drug> findByPurchaseOrderId(PurchaseOrder purchaseOrder) {
        Integer pageNum = purchaseOrder.getPageNum();
        Integer pageSize = purchaseOrder.getPageSize();
        if (pageNum != null && pageSize != null) {
            Integer startrow = (pageNum - 1) * pageSize;
            purchaseOrder.setStartRow(startrow);
        }
        return drugMapper.selectByPurchaseOrderId(purchaseOrder);
    }
}
