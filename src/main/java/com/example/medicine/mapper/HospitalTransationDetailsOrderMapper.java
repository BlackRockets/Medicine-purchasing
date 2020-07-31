package com.example.medicine.mapper;

import com.example.medicine.bean.Hospital_Transaction_Details;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalTransationDetailsOrderMapper {

    List<Hospital_Transaction_Details> selectAll(Hospital_Transaction_Details hospital);

    int scount(Hospital_Transaction_Details hospital);
}
