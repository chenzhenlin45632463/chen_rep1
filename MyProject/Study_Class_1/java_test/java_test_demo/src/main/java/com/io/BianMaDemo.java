package com.io;

import java.util.Arrays;

public class BianMaDemo {
    public static void main(String[] args) {
        String name = "我是我的陈巍";
        byte[] bytes = name.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes.length);
    }
}
