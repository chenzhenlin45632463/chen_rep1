package com.java.test;

import com.java.model.User;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class ClassConstructorDemo {

    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;

        Constructor<User> constructor = userClass.getConstructor();
        User user = constructor.newInstance();
        System.out.println(user);
    }

    @Test
    public void test() throws Exception {
        Class<User> userClass = User.class;
        Constructor<User> constructor = userClass.getConstructor(String.class, String.class, Integer.class, String.class);
        User user = constructor.newInstance("陈巍", "18381121942", 24, "cw@163.com");
        System.out.println(user);
    }
}
