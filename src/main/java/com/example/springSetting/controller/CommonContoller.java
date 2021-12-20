package com.example.springSetting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonContoller {
    @RequestMapping(value = "/")
    public String Home() throws Exception{
        return "index";
    }
}
