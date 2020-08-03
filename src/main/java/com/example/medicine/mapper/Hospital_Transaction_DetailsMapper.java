package com.example.medicine.mapper;

import com.example.medicine.bean.Hospital_Transaction_Details;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public interface Hospital_Transaction_DetailsMapper {

        List<Hospital_Transaction_Details> selectAllHospitalTransationDetials(Hospital_Transaction_Details hospital_transaction_details);

        int insert(Hospital_Transaction_Details record);

        int insertSelective(Hospital_Transaction_Details record);

        int selectCount(Hospital_Transaction_Details hospital_transaction_details);

        int deliver(List<Integer> list);

        int unSupply(List<Integer> list);

        }