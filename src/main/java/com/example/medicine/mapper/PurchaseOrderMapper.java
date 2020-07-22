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
     //按采购单查询
    List<PurchaseOrder> queryAllPurchaseOrder(
            @Param("purchaseOrderNumber") String purchaseOrderNumber,
            @Param("nameOfPurchaseOrder") String nameOfPurchaseOrder,
            @Param("nameOfHospital") String nameOfHospital,
            @Param("purchaseOrderStatus") Integer purchaseOrderStatus,
            @Param("supplierId") Integer supplierId);

    //采购单维护查询
    List<PurchaseOrder> selectAllPurchaseOrder(
            PurchaseOrder purchaseOrder);

    //采购单入库前查询
    List<PurchaseOrder> selectAllPurchaseOrderWarehousing(
            @Param("purchaseOrderNumber") String purchaseOrderNumber,
            @Param("nameOfPurchaseOrder") String nameOfPurchaseOrder,
            @Param("hospitalId") Integer hospitalId,
            @Param("purchaseOrderStatus") Integer purchaseOrderStatus);

    int countAll();

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseOrder record);

    int insertSelective(PurchaseOrder record);

    PurchaseOrder selectByPrimaryKey(Integer id);
    //采购单入库
    int updateByPrimaryKeySelective(Integer purchaseOrderStatus);

    Integer selectCount();

    int updateByPrimaryKey(PurchaseOrder record);
}
