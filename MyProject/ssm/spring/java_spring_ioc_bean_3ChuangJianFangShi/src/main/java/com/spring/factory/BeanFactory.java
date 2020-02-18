package com.spring.factory;

import com.spring.service.AccountService;
import com.spring.service.impl.AccountServiceImpl;

public class BeanFactory {

    public AccountService getAccountService(){

        return new AccountServiceImpl();
    }

    public static AccountService getAgain(){
        return new AccountServiceImpl();
    }
}
