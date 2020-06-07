package com.zj3;

import org.junit.jupiter.api.Test;

/**
 * 长整型的初始化:多种方式
 */
public class ChangZhengXingChuShiHua {

    @Test
    public void test(){
        long a = 10;
        Long i = 10l;
//        Long i = 10;错误方式
        Long b = 20l;
        Long c = 20L;
        long d = 15l;
        long f = 15L;
        //几种方式都是正确的
        System.out.println(a+":"+":"+i+b+":"+c+":"+d+":"+f);
    }
}
