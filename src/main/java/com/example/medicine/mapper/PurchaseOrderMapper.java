package com.example.medicine.mapper;

import com.example.medicine.bean.PurchaseOrder;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface PurchaseOrderMapper {

    List<PurchaseOrder> queryAllPurchaseOrder(
            @Param("purchaseOrderNumber") String purchaseOrderNumber,
            @Param("nameOfPurchaseOrder") String nameOfPurchaseOrder,
            @Param("nameOfHospital") String nameOfHospital,
            @Param("purchaseOrderStatus") Integer purchaseOrderStatus,
            @Param("supplierId") Integer supplierId);
    List<PurchaseOrder> selectAllPurchaseOrder(
            @Param("purchaseOrderNumber") String purchaseOrderNumber,
            @Param("nameOfPurchaseOrder") String nameOfPurchaseOrder,
            @Param("hospitalId") Integer hospitalId,
            @Param("purchaseOrderStatus") Integer purchaseOrderStatus);

    int countAll();

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseOrder record);

    int insertSelective(PurchaseOrder record);

    PurchaseOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PurchaseOrder record);

    Integer selectCount();

    int updateByPrimaryKey(PurchaseOrder record);
}
