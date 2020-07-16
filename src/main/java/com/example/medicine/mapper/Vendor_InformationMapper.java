package com.example.medicine.mapper;

import com.example.medicine.bean.Vendor_Information;

public interface Vendor_InformationMapper {
    int deleteByPrimaryKey(Integer supplierId);

    int insert(Vendor_Information record);

    int insertSelective(Vendor_Information record);

    Vendor_Information selectByPrimaryKey(Integer supplierId);

    int updateByPrimaryKeySelective(Vendor_Information record);

    int updateByPrimaryKey(Vendor_Information record);
}