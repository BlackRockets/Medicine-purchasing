package com.example.medicine.mapper;

import com.example.medicine.bean.DrugVO;
import com.example.medicine.bean.Hospital_Return_Order_Detail;
import com.example.medicine.bean.Hospital_Transaction_Return_Form;
import com.example.medicine.bean.PurchaseDrugVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Hospital_Return_Order_VOMapper {
    List<DrugVO> selectByReturnOrderId(Hospital_Transaction_Return_Form returnOrder);

    int selectCount(Hospital_Transaction_Return_Form returnOrder);

    List<PurchaseDrugVO> selectPurchaseDrug(Hospital_Transaction_Return_Form returnOrder);

    int selectPurchaseDrugCount(Hospital_Transaction_Return_Form returnOrder);

}