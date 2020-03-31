package com.jike.time.space.xiaotimu;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 面试题 01.02. 判定是否互为字符重排
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * <p>
 * 示例 1：
 * <p>
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 * <p>
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 * 说明：
 * <p>
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 */
public class StringChongPaiTiMu {

    @Test
    public void test(){
        boolean result = new Solution().CheckPermutation2("ae_cb_f", "c_a_ef");
        System.out.println(result);
    }

    class Solution {

        /**
         * 暴力求解法
         * 0 ms	37 MB
         */
        public boolean CheckPermutation(String s1, String s2) {
            //将字符串转成字符数组，然后排序
            char[] c1 = s1.toCharArray();
            Arrays.sort(c1);
            char[] c2 = s2.toCharArray();
            Arrays.sort(c2);

            //返回排序后的字符串
            return new String(c1).equals(new String(c2));
        }

        /**
         *  与上面解法基本一致，TODO:但是排序后进行比较的细节方面有些不一样
         * 0 ms	37.3 MB
         */
        public boolean CheckPermutation2(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            //将排序后的字符串进行比较
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) {
                    return false;
                }
            }
            return true;
        }
    }


    //测试String的charAt方法，获取对应索引处的字符，并返回字符
    @Test
    public void testCharAt(){
        char c = "sdsdd3232334sasdassa".charAt(13);
        System.out.println(c);
    }
}
