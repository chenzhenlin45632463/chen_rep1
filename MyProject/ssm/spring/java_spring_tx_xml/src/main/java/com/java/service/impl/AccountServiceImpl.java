package com.java.service.impl;

import com.java.dao.AccountDao;
import com.java.model.Account;
import com.java.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "accountService")
@Transactional(readOnly = true,propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void transfer() {
        accountDao.transfer();
    }

    public List<Account> findAll() {
        List<Account> list = accountDao.findAll();
        return list;
    }

}
