package com.example.medicine.service;

import com.example.medicine.bean.HospitalTransactionPurchaseOrderWarehousingTable;
import com.example.medicine.bean.PurchaseOrder;

import java.util.List;

public interface PurchaseWarehousingService  {

//采购单入库前查询

    List<PurchaseOrder> selectAllPurchaseOrderWarehousing(HospitalTransactionPurchaseOrderWarehousingTable hospitalTransactionPurchaseOrderWarehousingTable);

}
