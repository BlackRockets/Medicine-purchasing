package com.example.medicine.service;

import com.example.medicine.bean.Hospital_Transaction_Details;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface HospitalTransationDetailsService {


    List<Hospital_Transaction_Details> selectAllHospitalTransationDetials(
            Hospital_Transaction_Details hospital_transaction_details);
}
