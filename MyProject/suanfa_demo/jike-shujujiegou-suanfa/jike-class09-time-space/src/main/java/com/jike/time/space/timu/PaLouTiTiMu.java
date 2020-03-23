package com.jike.time.space.timu;

import org.junit.jupiter.api.Test;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 *
 * 示例 2：
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 */
public class PaLouTiTiMu {
    @Test
    public void test() {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(10));
    }
}

class Solution {
    // 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户内存消耗 :
    // 33.2 MB, 在所有 Java 提交中击败了70.25%的用户

    /**
     * @param n 目标阶数
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = i1 + i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }

    //自己写第一遍
    public int climbStairs1(int n) {
        if (n <= 2) return n;

        int i1 = 1;
        int i2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = i1 + i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }

    //自己默写第二遍
    public int climbStairs2(int n) {
        if (n <= 2) return n;
        int i1 = 1;
        int i2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = i1 + i2;
            i1 = i2;//i1的值成了i2
            i2 = temp;//i2的值成了temp（i1+i2）
        }

        return i2;
    }


    //自己默写第三遍
    public int climbStairs3(int n) {
        if (n <= 2) return n;
        int i1 = 1;//阶数1的次数
        int i2 = 2;//阶数2的次数
        for (int i = 3; i <= n; i++) {//从3到n进行循环
            int temp = i1 + i2;
            i1 = i2;//i1的值成为了i2
            i2 = temp;//i2的值成了之前i1与i2的和
        }
        return i2;
    }


}
