package com.example.medicine.mapper;

import com.example.medicine.bean.Hospital_Return_Order_Detail;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.bean.PurchaseOrderDetails;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PurchaseOrderDetailsMapper {
    //添加采购药品
    int insertSelective(PurchaseOrderDetails record);

    int deleteById(String[] ids);

    int updateByPrimaryKeySelective(PurchaseOrderDetails record);

}
