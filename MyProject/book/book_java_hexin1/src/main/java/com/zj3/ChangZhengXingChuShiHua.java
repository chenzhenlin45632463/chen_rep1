package com.zj3;

import org.junit.jupiter.api.Test;

/**
 * 长整型的初始化:多种方式
 */
public class ChangZhengXingChuShiHua {

    @Test
    public void test() {
        long a = 10;
        Long i = 10l;
//        Long i = 10;错误方式
        Long b = 20l;
        Long c = 20L;
        long d = 15l;
        long f = 15L;
        //几种方式都是正确的
        System.out.println(a + ":" + ":" + i + b + ":" + c + ":" + d + ":" + f);
    }

    /**
     * 测试浮点数的精确值
     */
    @Test
    public void test2() {
        System.out.println(2.0 - 1.1);
        //打印结果：0.8999999999999999
        //证明浮点类型为二进制，并不能精确表示分数1/10
        System.out.println('a');
//        System.out.println('ad');错误
    }

    /**
     * 判断某个Unicode字符是否是java中的字母
     */
    private int a;
    @Test
    public void test3() {
        //判断Unicode字符是否是java中的字母
        System.out.println(Character.isJavaIdentifierPart('a'));
        System.out.println(Character.isJavaIdentifierStart('a'));
        int b;
        b = 39;
        System.out.println(b);
        System.out.println(a);
    }
}
