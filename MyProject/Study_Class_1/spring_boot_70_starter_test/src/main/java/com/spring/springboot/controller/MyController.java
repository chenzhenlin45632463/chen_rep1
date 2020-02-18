package com.spring.springboot.controller;

import com.chenwei.starte.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        String hello = myService.sayHelloChenWei("陈巍");
        return hello;
    }
}
