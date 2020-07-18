package com.example.medicine.mapper;

import com.example.medicine.bean.DrugItems;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugItemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugItems record);

    int insertSelective(DrugItems record);

    DrugItems selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugItems record);

    int updateByPrimaryKey(DrugItems record);

    //查询所有的药品品目
    List<DrugItems> selectDrugItems(DrugItems drugItemsdto);

    //查询总条数
    Integer selectCount();


}