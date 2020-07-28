package com.example.medicine.service;

import com.example.medicine.bean.Hospital_Transaction_Details;
import com.github.pagehelper.PageInfo;

public interface HospitalTransationDetailsService {


    PageInfo<Hospital_Transaction_Details> selectAllHospitalTransationDetials(
            Integer pageNum,
            Integer pageSize,
            Hospital_Transaction_Details hospital_transaction_details);
}
