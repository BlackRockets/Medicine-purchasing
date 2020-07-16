package com.example.medicine;

import com.example.medicine.bean.DrugItems;
import com.example.medicine.mapper.DrugItemsMapper;
import jdk.nashorn.internal.ir.CallNode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

class MedicineApplicationTests {
    @Autowired
    private DrugItemsMapper drugItemsMapper;
    @Test
    void contextLoads() {

    }
    
}
