package com.example.medicine.serviceImpl;

import com.example.medicine.bean.DrugItems;
import com.example.medicine.mapper.DrugItemsMapper;
import com.example.medicine.service.DrugItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugItemServiceImpl implements DrugItemService {
    @Autowired
    private  DrugItemsMapper drugItemsMapper;
    @Override
    public List<DrugItems> selectAllDrugItems(DrugItems drugItemsdto) {
        //页码
        Integer pageNum = drugItemsdto.getPageNum();
        //每页条数
        Integer pageSize = drugItemsdto.getPageSize();
        //起始条数
        Integer startrow = (pageNum-1)*pageSize;
        drugItemsdto.setStartrow(startrow);
        //查询出来的数据
        List<DrugItems> drugItems = drugItemsMapper.selectDrugItems(drugItemsdto);
        return drugItems;
    }
}
