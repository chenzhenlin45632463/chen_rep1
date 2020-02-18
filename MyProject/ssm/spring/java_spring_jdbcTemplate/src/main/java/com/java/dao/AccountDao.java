package com.java.dao;

import com.java.model.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();

    void save(Account account);

    void delete(int id);

    void update(Account account);

    Account findOne(int id);

    void transfer();
}
