package com.spring.high.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/buy")
    public String buyTicket(String name){
        String ticket = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name+"买了一张 "+ticket+"票";
    }
}
