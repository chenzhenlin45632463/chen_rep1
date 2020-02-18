package com.java.test;

import com.java.model.Account;
import com.java.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class TxAnnotationDemo {

    @Autowired
    private AccountService accountService;

    @Test
    public void transfer(){
        System.out.println(accountService);
        accountService.transfer();
    }

    @Test
    public void findAll(){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
