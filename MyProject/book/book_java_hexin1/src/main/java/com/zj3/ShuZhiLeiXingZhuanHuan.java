package com.zj3;

import org.junit.jupiter.api.Test;

/**
 * 数据类型的转换
 */
public class ShuZhiLeiXingZhuanHuan {

    @Test
    public void test(){

        long i = 2;//小转大
        int a = (int) 2l;//强制转换
        byte b = 3;
        char c = 102;//f    正好对应ASCII码表
        System.out.println(c);
    }
}
