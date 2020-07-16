package com.example.medicine;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.medicine.*")
@MapperScan("com.example.medicine.mapper")
public class MedicineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicineApplication.class, args);
    }

}
