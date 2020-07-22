package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.HospitalProcurementOfDrugs;
import com.example.medicine.mapper.HospitalProcurementOfDrugsMapper;
import com.example.medicine.service.HospitalProcurementOfDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class HospitalProcurementOfDrugsServiceImpl implements HospitalProcurementOfDrugsService {

    @Autowired
    HospitalProcurementOfDrugsMapper hospitalProcurementOfDrugsMapper;


    @Override
    public List<HospitalProcurementOfDrugs> selectAll(Drug drug) {
        Integer pageStart=(drug.getPageNum()-1)*drug.getPageSize();
        drug.setPageNum(pageStart);
        List<HospitalProcurementOfDrugs> hospitalProcurementOfDrugs = hospitalProcurementOfDrugsMapper.selectAll(drug);
        return hospitalProcurementOfDrugs;
    }



    @Override
    public int selectCount(Drug drug) {
        int count = hospitalProcurementOfDrugsMapper.selectCount(drug);
        return count;
    }

    @Override
    public HospitalProcurementOfDrugs selectById(Integer id) {
        HospitalProcurementOfDrugs hospitalProcurementOfDrugs = hospitalProcurementOfDrugsMapper.selectById(id);
        return hospitalProcurementOfDrugs;
    }

    @Override
    public int insertBatch(List<Drug> drug) {
        int i = hospitalProcurementOfDrugsMapper.insertBatch(drug);
        return i;
    }

    @Override
    public int updateBatch(List<Drug> list) {
        int i = hospitalProcurementOfDrugsMapper.updateBatch(list);
        return i;
    }

    @Override
    public int deleteBatch(List<Integer> integers) {
        int i = hospitalProcurementOfDrugsMapper.deleteBatch(integers);
        return i;
    }
}
