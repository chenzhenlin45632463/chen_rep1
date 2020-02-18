package com.java.test;

import com.java.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemo2 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop-method2.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.findAllAccount();
        accountService.saveAccount();
        accountService.deleteAccount();
        accountService.updateccount();
    }
}
