package com.example.medicine.mapper;

import com.example.medicine.bean.Hospital_Transaction_Details;

public interface Hospital_Transaction_DetailsMapper {
    int insert(Hospital_Transaction_Details record);

    int insertSelective(Hospital_Transaction_Details record);
}