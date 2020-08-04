package com.example.medicine.service;

import com.example.medicine.bean.DrugItems;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface DrugItemService {
    //起始加载数据

    List<DrugItems>  selectDrugItemsNo();

    List<DrugItems> selectAllDrugItems(DrugItems drugItems);

    //增加
    int addAllDrugItem(DrugItems drugItems);

    //编辑
    int updateDrugItem(DrugItems drugItems);

    //导入
    void doImport(MultipartFile file);

}
