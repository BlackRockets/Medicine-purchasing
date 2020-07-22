package com.example.medicine.service;

import com.example.medicine.bean.DrugItems;

import java.util.List;

public interface DrugItemService {
    //起始加载数据

    List<DrugItems> selectAllDrugItems(DrugItems drugItemsdto);
    List<DrugItems>  selectDrugItemsNo();


}
