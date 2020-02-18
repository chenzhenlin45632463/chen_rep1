package com.spring.dao.impl;

import com.spring.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository(value = "ac1")
public class AccountDaoImpl implements AccountDao {
    public void accountSave() {
        System.out.println("来自accountDao的方法");
    }
}
