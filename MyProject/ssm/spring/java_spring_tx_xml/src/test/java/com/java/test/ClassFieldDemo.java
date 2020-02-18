package com.java.test;

import com.java.model.User;

import java.lang.reflect.Field;

public class ClassFieldDemo {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setUsername("东方教主");
        Class<User> userClass = User.class;
        Field username = userClass.getDeclaredField("username");
        username.setAccessible(true);
        System.out.println(username.get(user));
    }
}
