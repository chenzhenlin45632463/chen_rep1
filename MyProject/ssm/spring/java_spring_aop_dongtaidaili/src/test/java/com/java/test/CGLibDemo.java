package com.java.test;

import com.java.service.AccountService;
import com.java.service.impl.AccountServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibDemo {
    public static void main(String[] args) {
       final AccountService account = new AccountServiceImpl();

        AccountService accountService = (AccountService) Enhancer.create(account.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                System.out.println(method.getName() + "方法开始了日志打印");
                Object rtValue = method.invoke(account, objects);
                System.out.println(method.getName() + "方法结束了");
                return rtValue;
            }
        });
        accountService.findAllAccount();
        accountService.saveAccount();
        accountService.updateAccount();
        accountService.deleteAccount();
    }
}
