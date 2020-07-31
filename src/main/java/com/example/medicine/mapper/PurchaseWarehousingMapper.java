package com.example.medicine.mapper;

import com.example.medicine.bean.HospitalTransactionPurchaseOrderWarehousingTable;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.service.PurchaseWarehousing;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PurchaseWarehousingMapper {

    int update(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);
    int insert(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);
    int selectCount(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);
    //采购单入库前查询
    List<HospitalTransactionPurchaseOrderWarehousingTable> selectAllPurchaseOrderWarehousing(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);
}
