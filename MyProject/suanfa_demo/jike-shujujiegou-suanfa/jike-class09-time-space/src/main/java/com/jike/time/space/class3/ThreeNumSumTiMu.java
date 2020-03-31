package com.jike.time.space.class3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 */
public class ThreeNumSumTiMu {

    @Test
    public void test() {
        int[] num = {1, 0, 3, 7, 2, 5, 9, 5, 45, 98};
        int[] result = new Solution().twoSum2(num, 103);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testThreeSum() {
        int[] nums = {1, 0, -3, 7, 2, 5, -9, 5, -45, 98, 10, -9, -1, -4, -7, -10};
        List<List<Integer>> lists = new Solution().threeSum2(nums);
        System.out.println(lists);
    }

    //我的最初想法：求出数组中所有的任意三数的组合，并一一求和，返回和为0的组合，封装成数组

    class Solution {
        /**
         * 一个基础的两数之和为固定target
         * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
         * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
         * <p>
         * 示例:
         * <p>
         * 给定 nums = [2, 7, 11, 15], target = 9
         * <p>
         * 因为 nums[0] + nums[1] = 2 + 7 = 9
         * 所以返回 [0, 1]
         * <p>
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/two-sum
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         *
         * @param nums
         * @param target
         * @return
         */
        //默写第二次
        public int[] twoSum2(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {//j始终在i右边
                    if (nums[j] + nums[i] == target) {
                        //返回封装成数组的该两值
                        return new int[]{nums[i], nums[j]};
                    }
                }
            }
            throw new IllegalArgumentException("no such two number from 2");
        }


        //默写第一次
        public int[] twoSum1(int[] nums, int target) {
            int[] count = new int[2];
            for (int i = 0; i < nums.length; i++) {//第一个加数i索引
                for (int j = i + 1; j < nums.length; j++) {//第二个加数始终在i的右边处循环，索引为j
                    if (nums[i] + nums[j] == target) {
                        //如果和为值target，直接封装成数组返回
                        count[0] = nums[i];
                        count[1] = nums[j];
                        return count;
                    }
                }
            }
            throw new IllegalArgumentException("No such two number from 1!");
        }


        //暴力求解法
        public int[] twoSum(int[] nums, int target) {
            int[] count = new int[2];
            for (int i = 0; i < nums.length; i++) {//第一个加数i可能为数组内循环的所有数
                for (int j = i + 1; j < nums.length; j++) {//第二个加数始终为i右边的数，不计左边的数：TODO：所以这个地方我有些疑惑,这能包含所有的情况吗？
                    if (nums[i] + nums[j] == target) {
                        count[0] = nums[i];
                        count[1] = nums[j];
                        return count;
                    }
                }
            }
            //没有找到的情况下
            throw new IllegalArgumentException("No such two number!");
        }

        //三数求和暴力默写第二次
        public List<List<Integer>> threeSum2(int[] nums) {
            List list = new ArrayList<List<Integer>>();
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] == -nums[k]) {
                            List<Integer> con2 = Arrays.asList(nums[i], nums[j], nums[k]);
                            list.add(con2);
                        }
                    }
                }
            }
            return list;
        }


        //三数求和暴力求解默写第一次
        public List<List<Integer>> threeSum1(int[] nums) {
            List list = new ArrayList<List<Integer>>();
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] == -nums[k]) {
                            List<Integer> con1 = Arrays.asList(nums[i], nums[j], nums[k]);
                            list.add(con1);
                        }
                    }
                }
            }
            return list;
        }


        //三数求和（暴力求解，时间复杂度为n^3）
        public List<List<Integer>> threeSum(int[] nums) {
            List list = new ArrayList<List<Integer>>();
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] == -nums[k]) {
                            List<Integer> con = Arrays.asList(nums[i], nums[j], nums[k]);
                            list.add(con);
                        }
                    }
                }
            }
            return list;
        }
    }

}
