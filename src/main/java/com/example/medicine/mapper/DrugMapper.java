package com.example.medicine.mapper;

import com.example.medicine.bean.Drug;

import java.util.List;

public interface DrugMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);

    List<Drug> selectAllDrugs(Drug record);

    int selectCount(Drug record);

    List<Drug> selectAllDrugsNo();

}