package com.java.test;

import com.java.model.User;
import org.junit.Test;

import java.lang.reflect.Method;

public class ClassMethodDemo {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        User user = new User();
        Method test = userClass.getDeclaredMethod("test");
        test.setAccessible(true);
        test.invoke(user);
    }

    @Test
    public void test() throws Exception {
        Class<User> userClass = User.class;
        User user = new User();
        Method other = userClass.getDeclaredMethod("other", String.class, Integer.class);
        other.invoke(user, "陈冠希", 35);
    }
}
