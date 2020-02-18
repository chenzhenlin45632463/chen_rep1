package com.spring.service.impl;

import com.spring.dao.AccountDao;
import com.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component(value = "account")
@Scope(value = "singleton")
public class AccountServiceImpl implements AccountService {

//    @Resource(name = "ac2")
    @Autowired
    @Qualifier(value = "ac2")
    private AccountDao accountDao;

    @Value(value = "78")
    private Integer word;

    public void saveAccount() {
//        System.out.println("此处创建了AccountServiceImpl");
//        accountDao.accountSave();
        System.out.println(word);
//        System.out.println(accountDao);
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }
}
