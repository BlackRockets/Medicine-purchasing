package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Drug;
import com.example.medicine.mapper.SelectSuppliersMapper;
import com.example.medicine.service.SelectSuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectSuppliersServiceImpl implements SelectSuppliersService {

    @Autowired
    SelectSuppliersMapper selectSuppliersMapper;

    @Override
    public List<Drug> selectAllDrugs(Drug record) {
        int pageStart=(record.getPageNum()-1)*record.getPageSize();
        record.setPageNum(pageStart);
        List<Drug> drugs = selectSuppliersMapper.selectAllDrugs(record);
        return drugs;
    }

    @Override
    public Integer selectCount(Drug record) {
        Integer integer = selectSuppliersMapper.selectCount(record);
        return integer;
    }

    @Override
    public List<Drug> selectBatch(List<Integer> list) {
        List<Drug> drugs = selectSuppliersMapper.selectBatch(list);
        return drugs;
    }

    @Override
    public int updateBatch(List<Drug> list) {
        int i = selectSuppliersMapper.updateBatch(list);
        return i;
    }

    @Override
    public Drug selectById(Integer id) {
        Drug drug = selectSuppliersMapper.selectById(id);
        return drug;
    }
}
