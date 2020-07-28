package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Drug;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.mapper.DrugMapper;
import com.example.medicine.service.DrugService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrupServiceImpl implements DrugService {

@Autowired
private DrugMapper drugMapper;

    @Override
    public List<Drug> selectAllDrug( Drug drug) {
        Integer pageNum = drug.getPageNum();
        Integer pageSize = drug.getPageSize();
        if (pageNum != null && pageSize != null) {
            Integer startrow = (pageNum - 1) * pageSize;
            drug.setStartrow(startrow);
        }
        List<Drug> drugs = drugMapper.selectAllDrug(drug);
        return drugs;
    }
}
