package com.chenwei.paixu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 选择排序法
 */
public class XuanZePaiXu {

    @Test
    public void test() {
        int[] arr = {34, 4, 5, 2, 78, 9, 30, 8, 13, 54, -9, 0, 62};
        new XuanZePaiXu().selectSort3(arr);
    }

    //选择排序算法默写3
    void selectSort3(int[] nums) {
        int temp;
        int index;
        for (int i = 0; i < nums.length - 1; i++) {

            //从数组剩余部分选取最小值
            index = i;
            for (int j = index + 1; j < nums.length; j++) {
                if (nums[index] > nums[j]) {
                    index = j;
                }
            }

            //根据最小值来决定是否进行重排序(数据交换)
            if (index != i) {
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
            System.out.println("默写3第"+i+"次选择排序");
            System.out.println(Arrays.toString(nums));
        }
    }


    //选择排序算法默写2
    void selectSort2(int[] nums) {
        int index;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            //从剩余数组中选取最小值
            index = i;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[index] > nums[j]) {
                    index = j;
                }
            }

            //将最小值与排序索引进行比较，不一致则互换
            if (index != i) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            System.out.println("默写2第" + i + "次选择排序结果");
            System.out.println(Arrays.toString(nums));
        }
    }


    //选择排序默写1
    void selectSort1(int[] nums) {
        int index;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            index = i;
            //获得每次数组中剩余数据的最小值
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[index] > nums[j]) {
                    index = j;
                }
            }

            if (index != i) {
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }

            System.out.println("这是第" + i + "次进行排序");
            System.out.println(Arrays.toString(nums));
        }
    }


    //选择排序函数
    void selectSort(int[] a) {
        int index;
        int temp;//交换临时变量
        for (int i = 0; i < a.length - 1; i++) {
            index = i;
            //选出数组中最小值
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }

            //交换两个数
            if (index != i) {
                temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
            System.out.println("第" + i + "步排序结果");
            System.out.println(Arrays.toString(a));
        }
    }
}
