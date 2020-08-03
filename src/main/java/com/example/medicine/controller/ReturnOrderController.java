package com.example.medicine.controller;


import com.alibaba.fastjson.JSON;
import com.example.medicine.bean.Drug;
import com.example.medicine.bean.DrugVO;
import com.example.medicine.bean.Hospital_Return_Order_Detail;
import com.example.medicine.bean.Hospital_Transaction_Return_Form;
import com.example.medicine.common.ReturnUtil;
import com.example.medicine.service.ReturnOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("returnOrder")
public class ReturnOrderController {

    @Autowired
    private ReturnOrderService returnOrderService;

    @ResponseBody
    @RequestMapping(value = "findAllReturnOrder",produces = {"application/json;charset=utf-8"})
    public String findAllReturnOrder(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer limit,
                                     Hospital_Transaction_Return_Form returnOrder){
        if(page!=null && limit!=null){
            returnOrder.setPageNum(page);
            returnOrder.setPageSize(limit);
        }
        List<Hospital_Transaction_Return_Form> returnOrders = returnOrderService.findAllReturnOrder(returnOrder);
        Integer returnOrderStatus = 1;
        for (Hospital_Transaction_Return_Form order : returnOrders) {
            if(returnOrderStatus.equals(order.getReturnOrderStatus())){
                order.setReturnOrderStatu("未提交");
            }else {
                order.setReturnOrderStatu("已提交");
            }
        }
        Integer total = returnOrderService.selectCount(returnOrder);
        ReturnUtil returnUtil = new ReturnUtil();
        String data = returnUtil.getData(returnOrders, total);
        return data;
    }


    @ResponseBody
    @RequestMapping(value = "saveReturnOrder",produces = {"application/json;charset=utf-8"})
    public String saveReturnOrder(@RequestParam String returnOrder){
        JSON parse = (JSON) JSON.parse(returnOrder);
        Hospital_Transaction_Return_Form returnOrder1 = JSON.toJavaObject(parse, Hospital_Transaction_Return_Form.class);
        String s = returnOrderService.saveReturnOrder(returnOrder1);
        return s;
    }

    //获取每个退货单中的药品
    @ResponseBody
    @RequestMapping(value = "findDrugByReturnOrderId",produces = {"application/json;charset=utf-8"})
    public String findDrugByReturnOrderId(Hospital_Transaction_Return_Form returnOrder){
        String data = returnOrderService.findByReturnOrderId(returnOrder);
        return data;
    }

    //删除退货单
    @ResponseBody
    @RequestMapping(value = "deleteReturnOrder",produces = {"application/json;charset=utf-8"})
    public int deleteReturnOrder(String[] ids){
        return returnOrderService.deleteReturnOrder(ids);
    }

    //提交退货单
    @ResponseBody
    @RequestMapping(value = "submitReturnOrder",produces = {"application/json;charset=utf-8"})
    public int submitReturnOrder(@RequestParam String returnOrderId){
        Integer integer = Integer.valueOf(returnOrderId);
        return returnOrderService.submitReturnOrder(integer);
    }


    //删除退货单药品
    @ResponseBody
    @RequestMapping(value = "deleteReturnMedicine",produces = {"application/json;charset=utf-8"})
    public int deleteReturnMedicine(String[] ids){
        return returnOrderService.deleteMedicine(ids);
    }

    //保存退货量
    @ResponseBody
    @RequestMapping(value = "saveReturnCount",produces = {"application/json;charset=utf-8"})
    public int saveReturnCount(@RequestBody List<Hospital_Return_Order_Detail> returnOrderDetail){
        returnOrderService.saveReturnCount(returnOrderDetail);
        return 1;
    }

    //查询所有已经入库药品
    @ResponseBody
    @RequestMapping(value = "findDrug",produces = {"application/json;charset=utf-8"})
    public String findDrug(Hospital_Transaction_Return_Form returnOrder){
        return returnOrderService.findDrug(returnOrder);
    }

    //添加药品到退货单
    @ResponseBody
    @RequestMapping(value = "addDrugToReturnOrder",produces = {"application/json;charset=utf-8"})
    public int addDrugToReturnOrder(@RequestBody List<Hospital_Return_Order_Detail> returnOrderDetail){
        returnOrderService.addDrugToReturnOrder(returnOrderDetail);
        return 1;
    }

    //查询未确认退货
    @ResponseBody
    @RequestMapping(value = "findConfirmReturnOrder",produces = {"application/json;charset=utf-8"})
    public String findConfirmReturnOrder(Hospital_Transaction_Return_Form returnOrder){
        return returnOrderService.findConfirmReturnOrder(returnOrder);
    }

    //确认退货
    @ResponseBody
    @RequestMapping(value = "confirmReturnOrder",produces = {"application/json;charset=utf-8"})
    public int confirmReturnOrder(@RequestBody List<DrugVO> record){
        return returnOrderService.confirmReturnOrder(record);
    }
}
