package com.java.test;

import com.spring.service.AccountService;
import com.spring.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.HashMap;
import java.util.Map;

public class IocZhuJieDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        AccountService accountService = (AccountService) ac.getBean("account");
        AccountService accountService = new AccountServiceImpl();
        accountService.saveAccount();
        ac.close();
    }

    @Test
    public void testMap(){
        Map map = new HashMap();
        map.put(new Object(),new Object());
        AccountService o = (AccountService) map.get("黑心人");
    }
    @Test
    public void testScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService a1 = (AccountService) ac.getBean("account");
        AccountService a2 = (AccountService) ac.getBean("account");

        System.out.println(a1==a2);
    }
}
