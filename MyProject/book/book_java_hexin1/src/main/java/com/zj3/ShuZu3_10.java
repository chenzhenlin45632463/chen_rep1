package com.zj3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 数组
 */
public class ShuZu3_10 {

    /**
     * 测试数组的成员变量length
     */
    @Test
    public void test() {
        int[] a1 = {1, 3, 4, 523, 35, 72, 13};
        int[] a2 = new int[6];
        a2[0] = 1;
        a2[1] = 3;
        System.out.println("a1 size:" + a1.length);
        System.out.println("a2 size:" + a2.length);
    }

    /**
     * 测试数组的拷贝（复制）方法
     */
    @Test
    public void test1() {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
        int[] a2 = Arrays.copyOf(a1, a1.length + 4);
        int[] a3 = Arrays.copyOf(a1, a1.length - 2);
        System.out.println(a1 + ":" + a2);
        System.out.println("原数组：" + Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
    }

    /**
     * 二分搜索算法查找v值
     */
    @Test
    public void test3() {
        //初始化数组
        int[]in = {1,2,3,4,5,6,7,8,9};
        int i = Arrays.binarySearch(in, 7);
        System.out.println(i);
        int result = Arrays.binarySearch(in, 2, 5, 2);
        System.out.println(result);
    }

    /**
     * 数组模拟抽彩
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入你抽彩的原数组的数量");
        int n = in.nextInt();
        System.out.println("输入你将抽取数据的个数");
        int k = in.nextInt();
        //初始化原数组
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        //抽取k次
        for (int i = 0; i < k; i++) {
            //每次抽取数据在原数组中的索引值
            //将double转为int类型
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            //将原数组的最后一个元素移动到当前抽取的随机位置
            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("这边是你抽取的数据集合");
        System.out.println(Arrays.toString(result));
        System.out.println("原数组：" + Arrays.toString(numbers));
    }

    //测试Math.random方法
    @Test
    public void test2() {
        double number = Math.random();
        System.out.println(number);
    }
}
