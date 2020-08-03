package com.example.medicine.serviceImpl;

import com.example.medicine.bean.*;
import com.example.medicine.common.EasyExcelUtil;
import com.example.medicine.mapper.*;
import com.example.medicine.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;
    @Autowired
    private PurchaseOrderDetailsMapper purchaseOrderDetailsMapper;
    @Autowired
    private PurchaseWarehousingMapper purchaseWarehousingMapper;

    @Autowired
    private Hospital_Transaction_DetailsMapper hospital_transaction_detailsMapper;


    @Autowired
    private DrugMapper drugMapper;


    @Override
    public List<PurchaseOrder> queryAllPurchaseOrder(PurchaseOrder purchaseOrder) {
        Integer pageNum = purchaseOrder.getPageNum();
        Integer pageSize = purchaseOrder.getPageSize();
        if (pageNum != null && pageSize != null) {
            Integer startrow = (pageNum - 1) * pageSize;
            purchaseOrder.setStartRow(startrow);
        }

        //查询出来的数据
        List<PurchaseOrder> purchaseOrders = purchaseOrderMapper.queryAllPurchaseOrder(purchaseOrder);
        return purchaseOrders;
    }

    @Override
    public List<PurchaseOrder> selectAllPurchaseOrderProcessing(PurchaseOrder purchaseOrder) {
        Integer pageNum = purchaseOrder.getPageNum();
        Integer pageSize = purchaseOrder.getPageSize();
        if (pageNum != null && pageSize != null) {
            Integer startrow = (pageNum - 1) * pageSize;
            purchaseOrder.setStartRow(startrow);
        }

        //查询出来的数据
        List<PurchaseOrder> purchaseOrders = purchaseOrderMapper.selectAllPurchaseOrderProcessing(purchaseOrder);
        return purchaseOrders;
    }

    @Override
    public List<PurchaseOrder> selectAllPurchaseOrderReview(PurchaseOrder purchaseOrder) {
        Integer pageNum = purchaseOrder.getPageNum();
        Integer pageSize = purchaseOrder.getPageSize();
        if (pageNum != null && pageSize != null) {
            Integer startrow = (pageNum - 1) * pageSize;
            purchaseOrder.setStartRow(startrow);
        }

        //查询出来的数据
        List<PurchaseOrder> purchaseOrders = purchaseOrderMapper.selectAllPurchaseOrderReview(purchaseOrder);
        return purchaseOrders;
    }

    @Override
    public List<PurchaseOrder> selectAllPurchaseOrder(PurchaseOrder purchaseOrder) {
        Integer pageNum = purchaseOrder.getPageNum();
        Integer pageSize = purchaseOrder.getPageSize();
        if (pageNum != null && pageSize != null) {
            Integer startrow = (pageNum - 1) * pageSize;
            purchaseOrder.setStartRow(startrow);
        }

        //查询出来的数据
        List<PurchaseOrder> purchaseOrders = purchaseOrderMapper.selectAllPurchaseOrder(purchaseOrder);
        return purchaseOrders;
    }


    @Override
    public int insert(PurchaseOrder purchaseOrder) {
        int insert = purchaseOrderMapper.insert(purchaseOrder);
        return insert;
    }


    @Override
    public int update(PurchaseOrder purchaseOrder) {
        int update = purchaseOrderMapper.updateByPrimaryKey(purchaseOrder);
        return update;
    }

    @Override
    public int updatePurchaseStatus(PurchaseOrder purchaseOrder) {
        int i = purchaseOrderMapper.updateByPrimaryKeySelective(purchaseOrder);
        return i;
    }

    @Override
    public List<Drug> findByPurchaseOrderId(PurchaseOrder purchaseOrder) {
        Integer pageNum = purchaseOrder.getPageNum();
        Integer pageSize = purchaseOrder.getPageSize();
        if (pageNum != null && pageSize != null) {
            Integer startrow = (pageNum - 1) * pageSize;
            purchaseOrder.setStartRow(startrow);
        }
        return drugMapper.selectByPurchaseOrderId(purchaseOrder);
    }

    @Override
    public int deleteAll(List<Integer> list) {
        return purchaseOrderMapper.deleteAll(list);
    }

    @Override
    public int deliver(List<Integer> ids) {
        return hospital_transaction_detailsMapper.deliver(ids);
    }

    @Override
    public int unSupply(List<Integer> ids) {
        return hospital_transaction_detailsMapper.unSupply(ids);
    }

    @Override
    public int warehousing(List list) {
        return purchaseWarehousingMapper.warehousing(list);
    }

    @Override
    public int pass(List<Integer> ids) {
        return purchaseOrderMapper.pass(ids);
    }

    @Override
    public int notPass(List<Integer> ids) {
        return purchaseOrderMapper.notPass(ids);
    }

    @Override
    public void doImport(MultipartFile file) {
        List<Object> obj = null;
        try {
            obj = EasyExcelUtil.readExcel(file, new PurchaseOrder(), 1, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Object object : obj) {
            PurchaseOrder purchaseOrder = (PurchaseOrder) object;
            purchaseOrderMapper.insert(purchaseOrder);
        }
    }

    @Override
    public int submitPurchaseOrder(Integer purchaseId) {
        return purchaseOrderMapper.submitPurchaseOrder(purchaseId);
    }

    @Override
    public void savePurchaseCount(List<PurchaseOrderDetails> purchaseOrderDetail) {
        for (PurchaseOrderDetails detail : purchaseOrderDetail) {
            purchaseOrderDetailsMapper.updateByPrimaryKeySelective(detail);
        }
    }

    @Override
    public int deleteDrug(String[] ids) {
        return purchaseOrderDetailsMapper.deleteById(ids);
    }

    @Override
    public void insertDrug(List<PurchaseOrderDetails> purchaseOrderDetails) {
       for (PurchaseOrderDetails details:purchaseOrderDetails){
           purchaseOrderDetailsMapper.insertSelective(details);
       }
    }


}
