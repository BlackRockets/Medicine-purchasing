package com.example.medicine.service;

import com.example.medicine.bean.HospitalTransactionPurchaseOrderWarehousingTable;

import java.util.List;

public interface PurchaseWarehousingService  {

//采购单入库前查询

    List<HospitalTransactionPurchaseOrderWarehousingTable> selectAllPurchaseOrderWarehousing(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);

    //入库
    int warehousing(List list);
    int update(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);

    int insert(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);
}
