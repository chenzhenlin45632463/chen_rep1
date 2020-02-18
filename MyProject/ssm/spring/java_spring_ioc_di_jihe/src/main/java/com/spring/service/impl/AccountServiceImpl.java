package com.spring.service.impl;

import com.spring.service.AccountService;

import java.util.*;

public class AccountServiceImpl implements AccountService {
    private List accountList;
    private Set accountSet;
    private Map<String,String> accountMap;
    private Properties accountProperties;

    public void setAccountProperties(Properties accountProperties) {
        this.accountProperties = accountProperties;
    }

    public void setAccountList(List accountList) {
        this.accountList = accountList;
    }

    public void setAccountSet(Set accountSet) {
        this.accountSet = accountSet;
    }

    public void setAccountMap(Map<String, String> accountMap) {
        this.accountMap = accountMap;
    }

    public void m1() {
        System.out.println(accountList);
        System.out.println(accountSet);
        System.out.println(accountMap);
        System.out.println(accountProperties);
    }

    public void m2(){
        System.out.println("来自AccountService中的m2");
    }
}
