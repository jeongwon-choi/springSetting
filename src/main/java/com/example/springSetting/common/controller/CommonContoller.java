package com.example.springSetting.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CommonContoller {
    @RequestMapping(value = "/")
    public String Home(){
        return "index";
    }
}
