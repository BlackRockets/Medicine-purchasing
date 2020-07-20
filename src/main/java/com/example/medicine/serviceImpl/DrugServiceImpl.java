package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Drug;
import com.example.medicine.mapper.DrugMapper;
import com.example.medicine.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {
    @Autowired
    DrugMapper drugMapper;

    @Override
    public List<Drug> selectAllDrugs(Drug record) {
        Integer pageStart=(record.getPageNum()-1)*record.getPageSize();
        record.setPageNum(pageStart);
        List<Drug> drugs = drugMapper.selectAllDrugs(record);
        return drugs;
    }

    @Override
    public int selectCount(Drug recond) {
        int count = drugMapper.selectCount(recond);
        return count;
    }

    @Override
    public int insertSelective(Drug record) {
        int i = drugMapper.insertSelective(record);
        return i;
    }

    @Override
    public Drug selectByPrimaryKey(Integer id) {
        Drug drug = drugMapper.selectByPrimaryKey(id);
        return drug;
    }

    @Override
    public int updateByPrimaryKeySelective(Drug record) {
        int i = drugMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = drugMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public List<Drug> selectAllDrugsNo() {
        List<Drug> drugs = drugMapper.selectAllDrugsNo();
        return drugs;
    }
}
