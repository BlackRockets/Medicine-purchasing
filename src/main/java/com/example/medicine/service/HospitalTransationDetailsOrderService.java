package com.example.medicine.service;

import com.example.medicine.bean.Hospital_Transaction_Details;

import java.util.List;

public interface HospitalTransationDetailsOrderService {
    List<Hospital_Transaction_Details> selectAll(Hospital_Transaction_Details hospital);

    int scount(Hospital_Transaction_Details hospital);
}
