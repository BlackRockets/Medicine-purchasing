package com.example.medicine.mapper;

import com.example.medicine.bean.DrugVO;
import com.example.medicine.bean.Hospital_Return_Order_Detail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Hospital_Return_Order_DetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hospital_Return_Order_Detail record);

    int insertSelective(Hospital_Return_Order_Detail record);

    Hospital_Return_Order_Detail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hospital_Return_Order_Detail record);

    int updateByPrimaryKey(Hospital_Return_Order_Detail record);

    int deleteById(String[] ids);

    int updateById(List<DrugVO> record);

}