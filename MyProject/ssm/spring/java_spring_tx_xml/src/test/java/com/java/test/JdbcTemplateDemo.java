package com.java.test;

import com.java.dao.AccountDao;
import com.java.model.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateDemo {
    private AccountDao accountDao;
    private ClassPathXmlApplicationContext ac;

    @Before
    public void init(){
         ac=new ClassPathXmlApplicationContext("bean.xml");
         accountDao = (AccountDao) ac.getBean("accountDao");
        System.out.println("初始化获取了容器及dao对象:"+accountDao);
    }


    @Test
    public void findAll(){
        List<Account> list = accountDao.findAll();
        for (Account account : list) {

            System.out.println(account);
        }
    }

    @Test
    public void save(){
        Account account = new Account();
        account.setName("杨宇轩");
        account.setBalance(3789);
        accountDao.save(account);
    }

    @Test
    public void delete(){
        accountDao.delete(5);
    }

    @Test
    public void update(){
        Account account = new Account();
        account.setId(6);
        account.setName("萧峰");
        account.setBalance(4659);
        accountDao.update(account);
    }

    @Test
    public void findOne(){
        Account account = accountDao.findOne(5);
        System.out.println(account);
    }

    @Test
    public void transfer(){
        accountDao.transfer();
    }

    @After
    public void destroy(){
        ac.close();//释放资源
        System.out.println("结尾释放了资源");
    }
}
