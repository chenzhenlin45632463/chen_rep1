package com.chenwei.paixu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 冒泡排序算法
 */
public class MaoPaoPaiXu {

    @Test
    public void test() {
        int[] arr = {13, 2, 0, 26, 5, 3, -3, 1, 78, 3, 76, 54, 36};
        new MaoPaoPaiXu().bubbleSort2(arr);
    }

    //冒泡排序算法默写2
    void bubbleSort2(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    //相邻比较的两个数交换位置
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }


    //冒泡排序算法默写1
    void bubbleSort1(int[] nums) {
        int temp;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    //交换两数的位置
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    //冒泡排序算法,从小到大排序方法
    void bubbleSort(int[] a) {
        int temp;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {//将相邻两个数进行比较，较大的数往后冒泡
                    //交换相邻两个数,需要有temp作为交换两个数的容器
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

            System.out.println("这是第" + i + "步排序结果");//输出每步排序的结果

            for (int k = 0; k < a.length; k++) {
                System.out.println("" + a[k]);//输出
            }

            System.out.println("\n");
        }
    }
}
