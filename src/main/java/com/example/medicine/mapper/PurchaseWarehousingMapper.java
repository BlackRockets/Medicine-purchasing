package com.example.medicine.mapper;

import com.example.medicine.bean.HospitalTransactionPurchaseOrderWarehousingTable;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.service.PurchaseWarehousing;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PurchaseWarehousingMapper {


    //采购单入库前查询
    List<PurchaseOrder> selectAllPurchaseOrderWarehousing(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);
}
