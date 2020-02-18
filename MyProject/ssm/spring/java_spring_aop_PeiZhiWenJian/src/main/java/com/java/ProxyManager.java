package com.java;

public class ProxyManager {

    public  void before(){
        System.out.println("开启事务");
    }

    public  void after(){
        System.out.println("提交事务");
    }

    public  void returningException(){
        System.out.println("出现异常，事务回滚");
    }

    public  void finalReturning(){
        System.out.println("最终操作");
    }
}
