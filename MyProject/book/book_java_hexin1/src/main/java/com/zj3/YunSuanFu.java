package com.zj3;

import org.junit.jupiter.api.Test;

/**
 * 运算符
 */
public class YunSuanFu {

    /**
     * 测试整数、浮点数被0除
     */
    @Test
    public void test(){
//        System.out.println(2/0);//java.lang.ArithmeticException: / by zero
        System.out.println(2.0/0);//Infinity无穷大
        System.out.println(0/2);//0
        System.out.println(0/2.0);//0.0
        int a=1;
//        System.out.println(4++);//报错，基本数字不能使用“++”运算符
        System.out.println(a++);
    }
}
