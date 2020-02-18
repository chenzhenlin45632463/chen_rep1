package com.spring.high.springboot.controller;

import com.spring.high.springboot.service.AsyncService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AsyncController {

    @Resource
    private AsyncService asyncService;

    @RequestMapping(value = "/async")
    public String async(){
        asyncService.async();
        return "success";
    }
}
