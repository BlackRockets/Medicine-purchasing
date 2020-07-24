package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Drug;
import com.example.medicine.mapper.CancelTheSupplyMapper;
import com.example.medicine.service.CancelTheSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancelTheSupplyServiceImpl implements CancelTheSupplyService {
    @Autowired
    CancelTheSupplyMapper cancelTheSupplyMapper;


    @Override
    public List<Drug> selectAllDrugs(Drug record) {
        int pageStart = (record.getPageNum() - 1) * record.getPageSize();
        record.setPageNum(pageStart);
        List<Drug> drugs = cancelTheSupplyMapper.selectAllDrugs(record);
        return drugs;
    }

    @Override
    public Integer selectCount(Drug record) {
        Integer integer = cancelTheSupplyMapper.selectCount(record);
        return integer;
    }

    @Override
    public List<Drug> selectBatch(List<Integer> list) {
        List<Drug> drugs = cancelTheSupplyMapper.selectBatch(list);
        return drugs;
    }

    @Override
    public int updateBatch(List<Drug> list) {
        int i = cancelTheSupplyMapper.updateBatch(list);
        return i;
    }

    @Override
    public Drug selectById(Integer id) {
        Drug drug = cancelTheSupplyMapper.selectById(id);
        return drug;
    }
}
