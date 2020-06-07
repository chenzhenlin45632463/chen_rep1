package com.day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

/**
 * 测试字符串（不是字符）与数字的相加减
 */
public class LeiXingJiaJian {

    @Test
    public void test(){

        /**
         * 数字和字符是AscII表转换的值相加，而数字和字符串是字符拼接
         */
        int i = 1;
        System.out.println(i+'d');
        System.out.println("=======================");
        String a = i+"a";
        System.out.println(a);
    }

    @Test
    public void test2(){

        byte b = 1;
        short a = 1;
        System.out.println(a+"&&"+b);
        byte c = 2;
        byte d = 4;
        int f = c+d;
        System.out.println(f);
    }
}
