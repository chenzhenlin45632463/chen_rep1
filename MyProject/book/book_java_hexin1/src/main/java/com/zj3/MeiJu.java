package com.zj3;

import org.junit.jupiter.api.Test;

/**
 * 简单的枚举测试
 */
public class MeiJu {

    @Test
    public void test(){
//        enum Size{SMALL,MEDIUM,LARGE,EXTRA_LARGE};
//        Size s = Size.MEDIUM;
    }

    //查询字符串代码点数量，字符串长度
    @Test
    public void test1(){
        String s = "123456789";
        int count = s.codePointCount(0, s.length());
        System.out.println(count);
    }
}
