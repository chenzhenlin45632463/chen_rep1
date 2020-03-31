package com.jike.time.space.xiaotimu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 01.01. 判定字符是否唯一
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 * <p>
 * 输入: s = "abc"
 * 输出: true
 * 限制：
 * <p>
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 */
public class StringWeiYiTiMu {
    @Test
    public void test() {

        boolean flag = new Solution().isUnique1("ewd3xvrfm@nhkl@s");
        boolean flag2 = new Solution().isUniqueBySet("ewd3xvrfmnhkl@s");
        System.out.println(flag2);
        System.out.println(flag);
    }


    @Test
    public void testLastIndexOfMethod() {
        int i = "12332455331".lastIndexOf("2");//返回该字符在字符串中最后出现的位置的索引
        System.out.println(i);
        String s = "wqdfasafs";
        int index = s.lastIndexOf("f", 2);
        System.out.println(index);
    }

    @Test
    public void testValueOfMethod(){
        String s = String.valueOf(false);//将其他类型的数据转换为字符串
        System.out.println(s);//false
    }

    class Solution {



        /**
         * set方式默写1
         */
        public boolean isUnique1(String str) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (str.lastIndexOf(chars[i]) != i) {
                    return false;
                }
            }
            return true;
        }

        /**
         * 利用Set集合元素的不可重复性和元素差值来解决问题
         * 0 ms	37.4 MB
         * @param astr
         * @return
         */
        public boolean isUniqueBySet(String astr) {
            Set<Character> set = new HashSet();
            char[] chars = astr.toCharArray();
            for (char aChar : chars) {
                set.add(aChar);
            }
            return set.size() == astr.length();
        }

        /**
         * 利用String的lastIndexOf方法进行判断
         *0 ms	37 MB
         * @param astr
         * @return
         */
        public boolean isUnique(String astr) {
            for (int i = 0; i < astr.length(); i++) {
                if (astr.lastIndexOf(astr.charAt(i)) != i) {
                    return false;
                }
            }
            return true;
        }
    }

}

