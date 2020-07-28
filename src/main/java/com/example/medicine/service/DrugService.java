package com.example.medicine.service;

import com.example.medicine.bean.Drug;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DrugService {

    List<Drug> selectAllDrug(Drug drug);
}
