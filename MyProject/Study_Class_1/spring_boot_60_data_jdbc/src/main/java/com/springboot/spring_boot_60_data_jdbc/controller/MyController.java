package com.springboot.spring_boot_60_data_jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @RequestMapping(name = "/query",method = RequestMethod.GET)
    @GetMapping("/query")
    public Map<String,Object> map(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from chenwei");
        Map<String, Object> map = maps.get(0);
        return map;
    }
}
