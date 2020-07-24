package com.example.medicine.mapper;

import com.example.medicine.bean.Drug;

import java.util.List;

public interface CancelTheSupplyMapper {
    List<Drug> selectAllDrugs(Drug record);

    Integer selectCount(Drug record);

    List<Drug> selectBatch(List<Integer> list);

    int updateBatch(List<Drug> list);

    Drug selectById(Integer id);
}
