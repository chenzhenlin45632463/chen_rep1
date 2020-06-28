package com.zj3;

import org.junit.jupiter.api.Test;

/**
 * 测试数学函数Math类的各种方法
 */
public class MathHanShu {

    //sqrt函数：求数值的平方根
    @Test
    public void test() {
        System.out.println(Math.sqrt(2));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(8));
//        1.4142135623730951
//        2.0
//        2.8284271247461903
    }

    //pow函数：求出数值的n次幂
    @Test
    public void test1() {
        int n = 3;
        System.out.println(Math.pow(3, n));//27.0
        System.out.println(Math.pow(5, n));//125.0
    }

    //round函数：四舍五入取近似值
    @Test
    public void test2() {
        System.out.println(Math.round(2.36));//2
        System.out.println(Math.round(2.4));//2
        System.out.println(Math.round(2.5));//3
        System.out.println(Math.round(2.1034));//2
    }

    //标识π和e的近似值
    @Test
    public void test3() {
        System.out.println(Math.PI);//π
        System.out.println(Math.E);//e
    }

    //StrictMath
    @Test
    public void test4() {
        System.out.println(StrictMath.PI);
        System.out.println(StrictMath.E);
    }
}
