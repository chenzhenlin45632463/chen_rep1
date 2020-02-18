package com.test.trycatch;

import com.test.trycatch.model.User;

public class TryCatchDemo {

    public static void main(String[] args) {
        User user = new User();
        try {
            user.setUsername("陈镇霖");
            user.setPassword("45632463");
            user.setEmail("czl@.com");
//            int i = 2 / 0;
            user.setAddress("四川");

        } catch (Exception e) {
            user.setNumber("9527");
            user.setAge(39);
        }
        System.out.println(user);
    }
}
