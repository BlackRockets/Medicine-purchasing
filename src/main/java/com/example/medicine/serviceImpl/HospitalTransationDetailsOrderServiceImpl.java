package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Hospital_Transaction_Details;
import com.example.medicine.mapper.HospitalTransationDetailsOrderMapper;
import com.example.medicine.service.HospitalTransationDetailsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalTransationDetailsOrderServiceImpl implements HospitalTransationDetailsOrderService {

    @Autowired
    HospitalTransationDetailsOrderMapper hospitalTransationDetailsOrderMapper;

    @Override
    public List<Hospital_Transaction_Details> selectAll(Hospital_Transaction_Details hospital) {
        int i = (hospital.getPageNum() - 1) * hospital.getPageSize();
        hospital.setPageStart(i);
        List<Hospital_Transaction_Details> hospital_transaction_details = hospitalTransationDetailsOrderMapper.selectAll(hospital);
        return hospital_transaction_details;
    }

    @Override
    public int scount(Hospital_Transaction_Details hospital) {
        int scount = hospitalTransationDetailsOrderMapper.scount(hospital);
        return scount;
    }
}
