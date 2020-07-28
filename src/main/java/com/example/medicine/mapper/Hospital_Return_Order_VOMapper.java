package com.example.medicine.mapper;

import com.example.medicine.bean.DrugVO;
import com.example.medicine.bean.Hospital_Return_Order_Detail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Hospital_Return_Order_VOMapper {
    List<DrugVO> selectByReturnOrderId();
}