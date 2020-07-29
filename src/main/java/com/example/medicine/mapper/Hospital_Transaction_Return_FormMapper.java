package com.example.medicine.mapper;

import com.example.medicine.bean.Hospital_Transaction_Return_Form;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Hospital_Transaction_Return_FormMapper {
    int insert(Hospital_Transaction_Return_Form record);

    int insertSelective(Hospital_Transaction_Return_Form record);

    List<Hospital_Transaction_Return_Form> selectAllReturnOrder(Hospital_Transaction_Return_Form record);

    int selectCount(Hospital_Transaction_Return_Form record);

    int deleteReturnOrder(String[] returnOrderId);

    int submitReturnOrder(Integer returnOrderId);
}