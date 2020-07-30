package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Hospital_Transaction_Details;
import com.example.medicine.service.HospitalTransationDetailsOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalTransationDetailsOrderServiceImpl implements HospitalTransationDetailsOrderService {
    @Override
    public List<Hospital_Transaction_Details> selectAll(Hospital_Transaction_Details hospital) {
        return null;
    }

    @Override
    public int scount(Hospital_Transaction_Details hospital) {
        return 0;
    }
}
