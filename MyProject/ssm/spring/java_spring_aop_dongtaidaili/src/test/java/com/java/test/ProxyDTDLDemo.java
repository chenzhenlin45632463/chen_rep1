package com.java.test;

import com.java.service.AccountService;
import com.java.service.impl.AccountServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDTDLDemo {
    public static void main(String[] args) {
        final AccountService account = new AccountServiceImpl();

        AccountService proxyAccount = (AccountService) Proxy.newProxyInstance(account.getClass().getClassLoader(), account.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object rtValue = null;
                       /* if (method.getName().equals("saveAccount")) {
                            System.out.println("执行保存操作的日志记录");
                        }*/
                        System.out.println(method.getName()+"方法日志记录打印了");
                        rtValue = method.invoke(account, args);
                        System.out.println(method.getName()+"方法日志记录打印完毕");
                        return rtValue;
                    }
                });
        proxyAccount.saveAccount();
        proxyAccount.deleteAccount();
        proxyAccount.updateAccount();
        proxyAccount.findAllAccount();
    }
}
