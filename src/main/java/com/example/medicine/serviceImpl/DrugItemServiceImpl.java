package com.example.medicine.serviceImpl;

import com.example.medicine.bean.DrugItems;
import com.example.medicine.common.EasyExcelUtil;
import com.example.medicine.mapper.DrugItemsMapper;
import com.example.medicine.service.DrugItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

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
        if(pageNum!=null && pageSize!=null){
            Integer startrow = (pageNum-1)*pageSize;
            drugItemsdto.setStartrow(startrow);
        }

        //查询出来的数据
        List<DrugItems> drugItems = drugItemsMapper.selectDrugItems(drugItemsdto);
        return drugItems;
    }

    @Override
    public List<DrugItems> selectDrugItemsNo() {
        List<DrugItems> drugItems = drugItemsMapper.selectDrugItemsNo();
        return drugItems;
    }

    @Override
    public int addAllDrugItem(DrugItems drugItems) {
        int insert = drugItemsMapper.insert(drugItems);
        return insert;
    }

    @Override
    public int updateDrugItem(DrugItems drugItems) {
        int insert = drugItemsMapper.updateByPrimaryKeySelective(drugItems);
        return insert;
    }

    @Override
    public void doImport(MultipartFile file) {
        List<Object> obj = null;
        try{
            obj = EasyExcelUtil.readExcel(file, new DrugItems(), 1, 1);
        }catch(IOException e) {
            e.printStackTrace();
        }
        for (Object object : obj) {
            DrugItems drugItems = (DrugItems)object;
            String statu = drugItems.getStatu();
            Short status = 1;
            Short status1 = 0;
            if("正常".equals(statu)){
                drugItems.setStatus(status);
            }else{
                drugItems.setStatus(status1);
            }
            drugItemsMapper.insert(drugItems);
        }

    }
}
