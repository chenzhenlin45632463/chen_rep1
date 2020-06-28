package com.zj3;

import org.junit.jupiter.api.Test;

/**
 * 字符串方法测试
 */
public class ZiFuChuan {

    /**
     * 测试StringBuilder的insert插入方法
     */
    @Test
    public void test() {
        StringBuilder sb = new StringBuilder("abcdefg");
        System.out.println("length="+sb.length());
        sb.insert(1, "陈");
        System.out.println(sb + ":length=" + sb.length());
    }
}
