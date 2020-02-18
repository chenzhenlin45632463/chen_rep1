package com.springboot.spring_boot30.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {

    @RequestMapping("/success")
    public String MyMethod(Map<String,Object>map){
        map.put("users", Arrays.asList("叶南晓","关玉卿","费龙潭"));
        map.put("name","铁面飞龙");
        return "success";
    }
}
