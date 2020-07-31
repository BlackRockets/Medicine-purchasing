package com.example.medicine.serviceImpl;

import com.example.medicine.bean.*;
import com.example.medicine.common.ReturnUtil;
import com.example.medicine.mapper.DrugMapper;
import com.example.medicine.mapper.Hospital_Return_Order_DetailMapper;
import com.example.medicine.mapper.Hospital_Return_Order_VOMapper;
import com.example.medicine.mapper.Hospital_Transaction_Return_FormMapper;
import com.example.medicine.service.ReturnOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReturnOrderServiceImpl implements ReturnOrderService {
    @Autowired
    private Hospital_Transaction_Return_FormMapper returnOrderMapper;
    @Autowired
    private DrugMapper drugMapper;
    @Autowired
    private Hospital_Return_Order_DetailMapper hospital_return_order_detailMapper;
    @Autowired
    private Hospital_Return_Order_VOMapper hospitalReturnOrderVoMapper;



    @Override
    public List<Hospital_Transaction_Return_Form> findAllReturnOrder(Hospital_Transaction_Return_Form returnOrder) {
        //页码
        Integer pageNum = returnOrder.getPageNum();
        //每页条数
        Integer pageSize = returnOrder.getPageSize();
        //起始条数
        if(pageNum!=null && pageSize!=null){
            Integer startrow = (pageNum-1)*pageSize;
            returnOrder.setStartRow(startrow);
        }
        return returnOrderMapper.selectAllReturnOrder(returnOrder);
    }

    @Override
    public Integer selectCount(Hospital_Transaction_Return_Form returnOrder) {
        return returnOrderMapper.selectCount(returnOrder);
    }

    //保存退货单
    @Override
    public int saveReturnOrder(Hospital_Transaction_Return_Form returnOrder) {
        //添加之后获取自增主键
        returnOrderMapper.insertSelective(returnOrder);
        Integer returnOrderId = returnOrder.getReturnOrderId();
        return returnOrderId;
    }

    @Override
    public String findByReturnOrderId(Hospital_Transaction_Return_Form returnOrder) {
        //页码
        Integer pageNum = returnOrder.getPageNum();
        //每页条数
        Integer pageSize = returnOrder.getPageSize();
        //起始条数
        if(pageNum!=null && pageSize!=null){
            Integer startrow = (pageNum-1)*pageSize;
            returnOrder.setStartRow(startrow);
        }
        ReturnUtil returnUtil = new ReturnUtil();
        List<DrugVO> drugVOS = hospitalReturnOrderVoMapper.selectByReturnOrderId(returnOrder);
        int total = hospitalReturnOrderVoMapper.selectCount(returnOrder);
        return returnUtil.getData(drugVOS,total);
    }

    //删除退货单
    @Override
    public int deleteReturnOrder(String[] returnOrderId) {
        return returnOrderMapper.deleteReturnOrder(returnOrderId);
    }

    @Override
    public int deleteMedicine(String[] ids) {
        return hospital_return_order_detailMapper.deleteById(ids);
    }

    @Override
    public void saveReturnCount(List<Hospital_Return_Order_Detail>  returnOrderDetail) {
        for (Hospital_Return_Order_Detail return_order_detail : returnOrderDetail) {
            hospital_return_order_detailMapper.updateByPrimaryKeySelective(return_order_detail);
        }
    }

    @Override
    public String findDrug(Hospital_Transaction_Return_Form returnOrder) {
        //页码
        Integer pageNum = returnOrder.getPageNum();
        //每页条数
        Integer pageSize = returnOrder.getPageSize();
        //起始条数
        if(pageNum!=null && pageSize!=null){
            Integer startrow = (pageNum-1)*pageSize;
            returnOrder.setStartRow(startrow);
        }
        ReturnUtil returnUtil = new ReturnUtil();
        List<PurchaseDrugVO> purchaseDrugVOS = hospitalReturnOrderVoMapper.selectPurchaseDrug(returnOrder);
        int total = hospitalReturnOrderVoMapper.selectPurchaseDrugCount(returnOrder);
        return returnUtil.getData(purchaseDrugVOS,total);
    }

    @Override
    public void addDrugToReturnOrder(List<Hospital_Return_Order_Detail> returnOrder) {
        for (Hospital_Return_Order_Detail detail : returnOrder) {
            hospital_return_order_detailMapper.insertSelective(detail);
        }
    }

    @Override
    public  String findConfirmReturnOrder(Hospital_Transaction_Return_Form returnOrder) {
        //页码
        Integer pageNum = returnOrder.getPageNum();
        //每页条数
        Integer pageSize = returnOrder.getPageSize();
        //起始条数
        if(pageNum!=null && pageSize!=null){
            Integer startrow = (pageNum-1)*pageSize;
            returnOrder.setStartRow(startrow);
        }
        ReturnUtil returnUtil = new ReturnUtil();
        List<DrugVO> drugVOS = hospitalReturnOrderVoMapper.selectConfirmReturnOrder(returnOrder);
        int total = hospitalReturnOrderVoMapper.selectConfirmReturnOrderCount(returnOrder);
        return returnUtil.getData(drugVOS,total);
    }

    @Override
    public int confirmReturnOrder(List<DrugVO> record) {
        return hospital_return_order_detailMapper.updateById(record);
    }


}
