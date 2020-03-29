package com.jike.time.space.timu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO：三数之和为0的双指针算法，不一样的算法
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
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ThreeNumSumTiMu_TwoPoint {

    @Test
    public void test() {
        int[] nums = {1, -1, 3, -4, -7, 6, 9, 811, 43, -21, 34, 54, 29, -30};
        List<List<Integer>> lists = new Solution().threeSum3(nums);
        System.out.println(lists);

    }

    /**
     * 解题思路
     * https://leetcode-cn.com/problems/3sum/solution/hua-jie-suan-fa-15-san-shu-zhi-he-by-guanpengchn/
     */
    class Solution {


        /**
         * 双指针解法默写第三次
         *
         * @param nums
         * @return
         */
        public List<List<Integer>> threeSum3(int[] nums) {
            List<List<Integer>> list = new ArrayList();
            int length = nums.length;
            if (nums == null || length < 3) return list;//基础判断
            Arrays.sort(nums);//升序排序
            for (int i = 0; i < length; i++) {
                if (nums[i] > 0) break;//如果三数最小值大于0，那么和肯定大于0，所以跳出循环
                if (i > 0 && nums[i] == nums[i - 1]) continue;//去重
                int L = i + 1;
                int R = length - 1;
                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R];
                    if (sum == 0) {
                        list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) L++;//去重
                        while (L < R && nums[R] == nums[R - 1]) R--;//去重
                        R--;
                        L++;
                    } else if (sum < 0) L++;
                    else if (sum > 0) R--;
                }
            }
            return list;
        }

        /**
         * 双指针解法默写第二次
         *
         * @param nums
         * @return
         */
        public List<List<Integer>> threeSum2(int[] nums) {
            List<List<Integer>> list = new ArrayList();
            int length = nums.length;
            if (nums == null || length < 3) return list;//基本判断
            Arrays.sort(nums);//排序
            for (int i = 0; i < length; i++) {
                if (nums[i] > 0) break;//三数之和为0，当最左边最小值大于0，直接返回
                if (i > 0 && nums[i] == nums[i - 1]) continue;//去重
                int L = i + 1;
                int R = length - 1;
                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R];
                    if (sum == 0) {
                        list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) L++;//去重
                        while (L < R && nums[R] == nums[R - 1]) R--;//去重
                        L++;
                        R--;
                    } else if (sum < 0) L++;
                    else if (sum > 0) R--;
                }
            }

            return list;
        }

        /**
         * 双指针解法默写第一次
         *
         * @param nums
         * @return
         */
        public List<List<Integer>> threeSum1(int[] nums) {
            List<List<Integer>> list = new ArrayList();
            int len = nums.length;
            if (nums == null || len < 3) return list;//基本判断
            Arrays.sort(nums);//升序排序
            for (int i = 0; i < len; i++) {//TODO：这里为什么采用len而不是len-2？
                if (nums[i] > 0) break;
                if (i > 0 && nums[i] == nums[i - 1]) continue;//去重
                int L = i + 1;
                int R = len - 1;
                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R];
                    if (sum == 0) {
                        list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) L++;
                        while (L < R && nums[R] == nums[R - 1]) R--;
                        R--;
                        L++;
                    } else if (sum < 0) L++;
                    else if (sum > 0) R--;
                }
            }
            return list;
        }

        /**
         * 双指针解法
         * 指针索引顺序（从左到右）：
         * i、L、R
         *
         * @param nums
         * @return
         */
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList();
            int len = nums.length;
            if (nums == null || len < 3) return ans;//基本判断
            Arrays.sort(nums);//排序升序，从左到右
            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) break;//如果当前数字大于0，那么三数和一定大于0
                if (i > 0 && nums[i] == nums[i - 1]) continue;//去重
                int L = i + 1;
                int R = len - 1;
                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R];
                    if (sum == 0) {
                        //三数之和为0
                        ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) L++;//去重
                        while (L < R && nums[R - 1] == nums[R]) R--;//去重
                        L++;
                        R--;
                    } else if (sum > 0) R--;
                    else if (sum < 0) L++;
                }
            }
            return ans;
        }
    }

    //测试Arrays的排序方法sort
    @Test
    public void testSort() {
        int[] arr = {3, 5, 3, 4, 6, 1, 65, 8, 21, 22, 10, 19};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
