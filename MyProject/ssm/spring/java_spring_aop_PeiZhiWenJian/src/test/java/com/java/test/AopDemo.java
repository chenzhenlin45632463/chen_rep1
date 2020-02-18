package com.java.test;

import com.java.ProxyManager;
import com.java.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemo {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("aop-method1.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");
        ProxyManager proxyManager = (ProxyManager) ac.getBean("proxyManager");

//        proxyManager.after();
        accountService.saveAccount();
        //        accountService.findAllAccount();
    }
}
