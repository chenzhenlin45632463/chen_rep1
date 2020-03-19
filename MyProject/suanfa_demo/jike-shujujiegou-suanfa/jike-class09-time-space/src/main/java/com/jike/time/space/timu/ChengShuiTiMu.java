package com.jike.time.space.timu;

import org.junit.jupiter.api.Test;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * 示例：
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class ChengShuiTiMu {

    //将所有可能的面积计算出来，查找最小的面积；讲解人的解法，但是时间复杂度较高
    class Solution {
        public int maxArea(int[] a) {
            int max = 0;
            for (int i = 0; i < a.length; i++) {
                //i为左边x坐标，j为右边坐标；这里是把所有可能的i和j匹配了一遍，从中寻求面积的最大值
                for (int j = i + 1; j < a.length; j++) {
                    int area = (j - i) * Math.min(a[i], a[j]);
                    max = Math.max(max, area);
                }
            }
            return max;
        }
    }


    //    自己默写
    public int maxArea(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //计算任意两个坐标间的盛水面积
                int area = (j - i) * Math.min(arr[i], arr[j]);
                //选择盛水面积的最大值
                max = Math.max(area, max);
            }
        }
        return max;
    }

    //    方法2.左边坐标i从0开始，右边坐标j从数组最大值开始，i、j分别向中间靠拢，从其中选取最大值时间复杂度较小
    public int maxArea2(int[] a) {
        int max = 0;
        for (int i = 0, j = a.length - 1; i < j; ) {
            //因为是盛水面积所以得选择左右纵坐标高度小的那一边
            int heightMin = a[j] > a[i] ? a[i ++] : a[j--];
            int area = (j - i + 1) * heightMin;
            max = Math.max(area, max);
        }
        return max;
    }


    //用于上面测试Math类的方法
    @Test
    public void testMathClassMethod() {
        int min = Math.min(32, 56);
        System.out.println(min);//32
        //选取最小值方法
        System.out.println(Math.min(24, 23));//23
        //选取最小值方法
        System.out.println(Math.max(32, 56));//56
    }
}

