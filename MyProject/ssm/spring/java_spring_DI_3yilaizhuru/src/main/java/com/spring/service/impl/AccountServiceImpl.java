package com.spring.service.impl;

import com.spring.service.AccountService;

import java.util.Date;

public class AccountServiceImpl implements AccountService {
    private String name;
    private Integer age;
    private Date born;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    /*public AccountServiceImpl(String name, Integer age, Date born) {
        this.name = name;
        this.age = age;
        this.born = born;
    }*/

    public void m1() {
        System.out.println("AccountService的"+name+","+age+","+born);
    }

    public void m2(){
        System.out.println("来自AccountService中的m2");
    }
}
