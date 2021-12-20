package com.example.springSetting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonContoller {
    @RequestMapping(value = "/")
    public ModelAndView Home() throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("test", "테스트 내용입니다.");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
