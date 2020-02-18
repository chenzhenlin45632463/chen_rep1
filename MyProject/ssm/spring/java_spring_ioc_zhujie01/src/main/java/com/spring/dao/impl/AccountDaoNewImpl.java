package com.spring.dao.impl;

import com.spring.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository(value = "ac2")
public class AccountDaoNewImpl implements AccountDao {
    public void accountSave() {
        System.out.println("来自的new方法");
    }
}
