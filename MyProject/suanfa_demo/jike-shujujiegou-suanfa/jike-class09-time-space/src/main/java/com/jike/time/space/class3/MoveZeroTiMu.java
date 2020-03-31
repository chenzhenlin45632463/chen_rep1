package com.jike.time.space.class3;

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

    //测试自己的解答
    @Test
    public void test() {

        int[] arr = {0, 0, 4, 9, 0, 4, 0, 7, 0, 0, 9, 9, 9, 24, 453, 765, 0, 0, 0};

        int[] afterArr = moveZero(arr);
        System.out.println(Arrays.toString(afterArr));
//        [4, 9, 4, 7, 9, 9, 9, 24, 453, 765, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }

    //测试官方解答
    @Test
    public void test1() {

        int[] arr = {0, 0, 4, 9, 0, 4, 0, 7, 0, 0, 9, 9, 9, 24, 453, 765, 0, 0, 0};
        int[] afterArr = new Solution().moveZero1(arr);
        System.out.println(Arrays.toString(afterArr));
//        [4, 9, 4, 7, 9, 9, 9, 24, 453, 765, 9, 9, 9, 24, 453, 765, 0, 0, 0]
//        [4, 9, 4, 7, 9, 9, 9, 24, 453, 765, 0, 0, 0, 0, 0, 0, 0, 0, 0]
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

        //默写第一次
        public int[] moveZero1(int[] nums) {
            //定义从0开始的索引，后面会逐渐增加
            int j = 0;
            //遍历数组
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    //将不为0的数字直接放在前面索引位置
                    nums[j] = nums[i];
                    //当新索引和当前索引i不重合时，该索引处的数字设置为0，TODO：其实具体操作就是不为0的数据进行了迁移
                    if (i != j) nums[i] = 0;
                    //每次数据迁移后j索引会++
                    j++;
                }
            }
            //返回经过处理的数组
            return nums;
        }


        public int[] moveZero(int[] nums) {
            int j = 0;
            //遍历数组
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    //TODO：当索引i上的数据不为0时，则将该数往前面放，此索引i的值设置为0（在放入的新索引j和i不重合的情况下）
                    if (i != j) nums[i] = 0;
                    j++;
                }
//                if (i != j) nums[i] = 0;
            }
            return nums;
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
