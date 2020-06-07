package com.day04;

import org.junit.jupiter.api.Test;

/**
 * day04方法定义
 */
public class MethodDingYi {

    @Test
    public void test(){
        new MethodDingYi().print();
    }

    /**
     * 打印矩形函数，但结果应该不对，结果打印出来是一条“ * ”线
     */
    public void print(){
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 8; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
