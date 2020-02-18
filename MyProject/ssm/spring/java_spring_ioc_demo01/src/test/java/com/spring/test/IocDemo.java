package com.spring.test;

import com.spring.dao.AccountDao;
import com.spring.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        accountService.m1();
        accountDao.m1();
    }
}
