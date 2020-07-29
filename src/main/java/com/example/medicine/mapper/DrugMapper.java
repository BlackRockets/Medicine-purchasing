package com.example.medicine.mapper;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.Hospital_Return_Order_Detail;
import com.example.medicine.bean.Hospital_Transaction_Return_Form;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DrugMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);

    List<Drug> selectByReturnOrderId(Hospital_Transaction_Return_Form returnOrder);
}