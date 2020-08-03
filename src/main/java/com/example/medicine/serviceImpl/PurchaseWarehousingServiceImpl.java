package com.example.medicine.serviceImpl;

import com.example.medicine.bean.HospitalTransactionPurchaseOrderWarehousingTable;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.mapper.PurchaseWarehousingMapper;
import com.example.medicine.service.PurchaseWarehousing;
import com.example.medicine.service.PurchaseWarehousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseWarehousingServiceImpl implements PurchaseWarehousingService {


    @Autowired
    private PurchaseWarehousingMapper purchaseWarehousingMapper;

    @Override
    public List<HospitalTransactionPurchaseOrderWarehousingTable> selectAllPurchaseOrderWarehousing(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable) {
        Integer pageNum = hospitalTransactionPurchaseOrderWarehousingTable.getPageNum();
        Integer pageSize = hospitalTransactionPurchaseOrderWarehousingTable.getPageSize();
        if (pageNum != null && pageSize != null) {
            Integer startrow = (pageNum - 1) * pageSize;
            hospitalTransactionPurchaseOrderWarehousingTable.setStartRow(startrow);
        }
        List<HospitalTransactionPurchaseOrderWarehousingTable> hospitalTransactionPurchaseOrderWarehousingTables = purchaseWarehousingMapper.selectAllPurchaseOrderWarehousing(hospitalTransactionPurchaseOrderWarehousingTable);
        return hospitalTransactionPurchaseOrderWarehousingTables;
    }

    @Override
    public int warehousing(List list) {
        return purchaseWarehousingMapper.warehousing(list);
    }

    @Override
    public int update(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable) {
        int i =purchaseWarehousingMapper.update(hospitalTransactionPurchaseOrderWarehousingTable);
        return i;
    }

    @Override
    public int insert(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable) {
        int i=purchaseWarehousingMapper.insert(hospitalTransactionPurchaseOrderWarehousingTable);
        return i;
    }

}
