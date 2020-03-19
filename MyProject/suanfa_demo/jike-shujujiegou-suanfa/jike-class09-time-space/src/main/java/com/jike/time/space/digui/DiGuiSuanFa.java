package com.jike.time.space.digui;

import org.junit.jupiter.api.Test;

/**
 * 递归算法基础代码
 */
public class DiGuiSuanFa {


    /**
     * 计算斐波拉契数字
     */
    @Test
    public void test1() {
        int i = 6;

        //求出斐波拉契数列中对应位置的数字
        int count = fib(i);
        System.out.println(count);
    }

    /**
     * 斐波拉契数列简单算法
     * 但是注意，这个函数的时间复杂度很高，相当于2的n次方，具体原因看09课
     * 所以工作中尽量不要这么写
     */
    private int fib(int i) {
        if (i <= 2) return i;
        return fib(i - 1) + fib(i - 2);
    }

}
