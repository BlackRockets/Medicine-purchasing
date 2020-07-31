package com.example.medicine.service;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.HospitalProcurementOfDrugs;

import java.util.List;

public interface HospitalProcurementOfDrugsService {

    List<HospitalProcurementOfDrugs> selectAll(Drug drug);

    int selectCount(Drug drug);

    HospitalProcurementOfDrugs selectById(Integer id);

    int insertBatch(List<Drug> drug);

    int updateBatch(List<Drug> list);

    int deleteBatch(List<Integer> integers);
}
