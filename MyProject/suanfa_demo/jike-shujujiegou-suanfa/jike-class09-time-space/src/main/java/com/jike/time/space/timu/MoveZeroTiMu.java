package com.jike.time.space.timu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 移动0
 * 题目：给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroTiMu {
    @Test
    public void test() {

        int[] arr = {0, 0, 4, 9, 0, 4, 0, 7, 0, 0, 9, 9, 9, 24, 453, 765, 0, 0, 0};

        int[] afterArr = moveZero(arr);
        System.out.println(Arrays.toString(afterArr));
    }

    //自己写的使用两个数组的解法，不符合题目规定
    private int[] moveZero(int[] arr) {
        int[] afterArr = new int[arr.length];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            //遍历arr，如果arr数组的数据不是0，则将数据直接放入新数组中
            if (arr[i] != 0) {
                int count = arr[i];
                afterArr[num] = count;
                num++;
            }
        }
        return afterArr;
    }

    //题解较为优秀的解答
    /**
     * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗 :41.8 MB, 在所有 Java 提交中击败了5.01%的用户
     */
    class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            //遍历数组
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    if (i != j) nums[i] = 0;
                    j++;
                }
            }
        }
    }

    //    1.测试数组的length()方法
//    2.查看各种类型的数组初始化的默认值
    @Test
    public void testArrayLength() {
        int[] array = new int[10];
        array[1] = 1;
        array[3] = 3;
        array[4] = 19;
        System.out.println(Arrays.toString(array));
//        [0, 1, 0, 3, 19, 0, 0, 0, 0, 0]

        boolean[] array2 = new boolean[10];
        array2[0] = true;
        array2[1] = false;
        array2[2] = true;
        System.out.println(Arrays.toString(array2));
//        [true, false, true, false, false, false, false, false, false, false]

        byte[] array3 = new byte[10];
        array3[1] = 24;
        array3[3] = 12;
        array3[4] = 100;
        System.out.println(Arrays.toString(array3));
//        [0, 24, 0, 12, 100, 0, 0, 0, 0, 0]
    }
}
