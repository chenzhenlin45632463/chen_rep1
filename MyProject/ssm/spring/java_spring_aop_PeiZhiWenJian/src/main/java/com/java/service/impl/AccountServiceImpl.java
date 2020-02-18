package com.java.service.impl;

import com.java.service.AccountService;

public class AccountServiceImpl implements AccountService {
    public void findAllAccount() {

        System.out.println("查询所有的账户");

    }

    public void saveAccount() {

        System.out.println("保存该账户");
//        int i = 1/0;
        System.out.println("保存操作执行完成");
    }

    public void deleteAccount() {
        System.out.println("删除/注销账户");
//        int i = 1/0;
        System.out.println("删除/注销账户完成");
    }

    public void updateccount() {
        System.out.println("修改账户");
    }
}
