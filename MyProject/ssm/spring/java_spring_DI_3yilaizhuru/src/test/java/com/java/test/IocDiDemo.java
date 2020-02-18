package com.java.test;

import com.spring.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class IocDiDemo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.m1();
//        accountService.m2();
        Date day = (Date) ac.getBean("day");

        System.out.println(day);
    }
}
