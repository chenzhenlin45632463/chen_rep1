package com.java.dao.impl;

import com.java.dao.AccountDao;
import com.java.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository(value = "accountDao")
public class AccountDaoImpl implements AccountDao {


    @Autowired
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }


    public List<Account> findAll() {
        List<Account> accounts = template.query("select * from account", new AccountRowMapper());
        return accounts;
    }

    public void save(Account account) {
        template.update("INSERT INTO account (NAME,balance) VALUES (?,?)",account.getName(),account.getBalance());
    }

    public void delete(int id) {
        template.update("DELETE  from account where id = ?",id);
    }

    public void update(Account account) {

        template.update("update account set NAME = ?,balance = ? WHERE id = ?",account.getName(),account.getBalance(),account.getId());
    }

    public Account findOne(int id) {
        List<Account> accounts = template.query("select * from account where id = ?", new AccountRowMapper(), id);

        if (accounts.size()<1){//容器中一无所有
            return new Account();
        }
        return accounts.get(0);
    }

    public void transfer() {

        Account  zwj = findOne(1);//张无忌
        Account lhc = findOne(2);//令狐冲

        zwj.setBalance(zwj.getBalance()-500);
        update(zwj);
        int i = 5/0;
        lhc.setBalance(lhc.getBalance()+500);
        update(lhc);
    }


    public class AccountRowMapper implements RowMapper {

        public Account mapRow(ResultSet resultSet, int i) throws SQLException {
            Account account = new Account();
            account.setId(resultSet.getInt("id"));
            account.setName(resultSet.getString("name"));
            account.setBalance(resultSet.getInt("balance"));

            return account;
        }
    }
}

