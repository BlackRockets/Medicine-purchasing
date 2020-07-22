package com.example.medicine.service;

import com.example.medicine.bean.Drug;

import java.util.List;

public interface DrugService {
    List<Drug> selectAllDrugs(Drug record);

    int selectCount(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drug record);

    int deleteByPrimaryKey(Integer id);

    List<Drug> selectAllDrugsNo();

    List<String> selectDrugCategory();

    List<Drug> findAllPurchaseingDrugs(Drug record);

    int selectPurchaseingDrugsCount(Drug record);

    int deletePurchaseDrugs(Integer[] integers);

    List<Drug> selectPurchaseDrugs(List<Integer> integers);

    int updatePurchaseDrugs(List<Drug> integers);
}
