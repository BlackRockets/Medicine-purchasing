package com.example.medicine.service;

import com.example.medicine.bean.Hospital_Return_Order_Detail;
import com.example.medicine.bean.Hospital_Transaction_Return_Form;
import com.example.medicine.common.ReturnUtil;

import java.util.List;

public interface ReturnOrderService {
    List<Hospital_Transaction_Return_Form> findAllReturnOrder(Hospital_Transaction_Return_Form returnOrder);

    Integer selectCount(Hospital_Transaction_Return_Form returnOrder);

    //保存退货单
    int saveReturnOrder(Hospital_Transaction_Return_Form returnOrder);

    //查询每个退货单的药品
    String findByReturnOrderId(Hospital_Transaction_Return_Form returnOrder);

    //删除退货单
    int deleteReturnOrder(String[] returnOrderId);

    //删除退货单中的药品
    int deleteMedicine(String[] ids);

    //保存退货量
    void saveReturnCount(List<Hospital_Return_Order_Detail> returnOrderDetail);

}
