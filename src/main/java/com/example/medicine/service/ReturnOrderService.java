package com.example.medicine.service;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.Hospital_Transaction_Return_Form;

import java.util.List;

public interface ReturnOrderService {
    List<Hospital_Transaction_Return_Form> findAllReturnOrder(Hospital_Transaction_Return_Form returnOrder);

    Integer selectCount(Hospital_Transaction_Return_Form returnOrder);

    //保存退货单
    int saveReturnOrder(Hospital_Transaction_Return_Form returnOrder);

    //查询每个退货单的药品
    List<Drug> findByReturnOrderId(Hospital_Transaction_Return_Form returnOrder);
}
