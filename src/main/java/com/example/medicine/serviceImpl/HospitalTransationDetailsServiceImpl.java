package com.example.medicine.serviceImpl;

import com.example.medicine.bean.Hospital_Transaction_Details;
import com.example.medicine.bean.PurchaseOrder;
import com.example.medicine.mapper.Hospital_Transaction_DetailsMapper;
import com.example.medicine.service.HospitalTransationDetailsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HospitalTransationDetailsServiceImpl implements HospitalTransationDetailsService {

@Autowired
private Hospital_Transaction_DetailsMapper hospital_transaction_detailsMapper;

    @Override
    public List<Hospital_Transaction_Details> selectAllHospitalTransationDetials(Hospital_Transaction_Details hospital_transaction_details) {
        Integer pageNum=hospital_transaction_details.getPageNum();
        Integer pageSize=hospital_transaction_details.getPageSize();
        if(pageNum!=null && pageSize!=null){
            Integer startrow = (pageNum-1)*pageSize;
            hospital_transaction_details.setStartRow(startrow);
        }

        //查询出来的数据
        List<Hospital_Transaction_Details> hospital_transaction_details1 = hospital_transaction_detailsMapper.selectAllHospitalTransationDetials(hospital_transaction_details);
        return hospital_transaction_details1;
    }
}
