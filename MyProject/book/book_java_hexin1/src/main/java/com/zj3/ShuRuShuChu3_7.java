package com.zj3;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * java输入输出
 */
public class ShuRuShuChu3_7 {

    /**
     * 测试Scanner输入输出方法
     */


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input your name");
        String name = in.next();
        System.out.println("your name is :" + name);
    }
}
