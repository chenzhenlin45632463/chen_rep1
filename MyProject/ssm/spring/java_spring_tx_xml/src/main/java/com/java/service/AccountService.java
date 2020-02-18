package com.java.service;

import com.java.model.Account;

import java.util.List;

public interface AccountService {

    public void transfer();

    public List<Account> findAll();
}
