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
    List<PurchaseOrder> queryAllPurchaseOrder(PurchaseOrder purchaseOrder);

    //按采购单查询
    List<PurchaseOrder> selectAllPurchaseOrderProcessing(PurchaseOrder purchaseOrder);

    //采购单审核查询
    List<PurchaseOrder> selectAllPurchaseOrderReview(PurchaseOrder purchaseOrder);

    //采购单维护查询
    List<PurchaseOrder> selectAllPurchaseOrder(
            PurchaseOrder purchaseOrder);

    //采购单入库前查询
    List<PurchaseOrder> selectAllPurchaseOrderWarehousing(PurchaseOrder purchaseOrder);

    int countAll();

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseOrder record);

    int insertSelective(PurchaseOrder record);

    PurchaseOrder selectByPrimaryKey(Integer id);

    //采购单入库
    int updateByPrimaryKeySelective(PurchaseOrder purchaseOrder);

    Integer selectCount(PurchaseOrder purchaseOrder);

    int updateByPrimaryKey(PurchaseOrder record);

    int deliver(Integer[] ids);
}
