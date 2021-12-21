package com.example.springSetting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonContoller {
    @RequestMapping(value = "/home")
    public String Home() throws Exception{
        return "Hello World";
    }
}
