package com.spring.spring_boot_quick_demo.controller;

import com.spring.spring_boot_quick_demo.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BootController {

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public Person getPerson(){
//        System.out.println(person);
        return person;
    }
}
