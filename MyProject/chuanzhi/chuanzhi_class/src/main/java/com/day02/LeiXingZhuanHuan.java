package com.day02;

import org.junit.jupiter.api.Test;

/**
 * 测试各种整型和各种浮点型相加等运算的结果
 */
public class LeiXingZhuanHuan {

    @Test
    public void test() {
        //整型浮点型相加转换结果为浮点型
        int a = 1;
        float b = 3;
        float c = a+b;
        double d = a+b;
        System.out.println("float："+c+"\n"+"double："+d);
        System.out.println(" r的用法");
        System.out.println("float："+c+"\r"+"double："+d);
    }

    @Test
    public void test2(){
//        int a = (int) 4.0+1.0;这种方式根本不行，直接显红
        int a = (int) 4.0+(int)1.2;
        System.out.println(a);
        int b = (int)3.6;
        System.out.println(b);

        double c = 1.3;
        float d = (float) 1.2;
        int f = (int)(c+d);
        System.out.println(f);

        System.out.println(37+'d');
    }
}
