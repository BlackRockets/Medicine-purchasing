package com.example.medicine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("aa")
public class UserController {

    @RequestMapping("ss")
    public String user (){
        return "returnOrder";
    }

}
