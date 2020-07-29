package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Hospital_Transaction_Details;
import com.example.medicine.mapper.Hospital_Transaction_DetailsMapper;
import com.example.medicine.service.HospitalTransationDetailsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HospitalTransationDetailsServiceImpl implements HospitalTransationDetailsService {

@Autowired
private Hospital_Transaction_DetailsMapper hospital_transaction_detailsMapper;
    @Override
    public PageInfo<Hospital_Transaction_Details> selectAllHospitalTransationDetials(Integer pageNum, Integer pageSize, Hospital_Transaction_Details hospital_transaction_details) {
        PageHelper.startPage(pageNum, pageSize);
        List<Hospital_Transaction_Details> hospitalTransactionDetails = hospital_transaction_detailsMapper.selectAllHospitalTransationDetials(hospital_transaction_details);
        PageInfo<Hospital_Transaction_Details> info = new PageInfo<>(hospitalTransactionDetails);
        return info;
    }
}
