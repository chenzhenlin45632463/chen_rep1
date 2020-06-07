package com.chenwei.paixu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 插入排序算法
 */
public class ChaRuPaiXu {

    @Test
    public void test() {
        int[]nums = {45,2,5,1,34,14,87,32,11,15,21};
        new ChaRuPaiXu().insertionSort(nums);
    }


    /**
     *      在上述代码中，输入参数a一般为一个数组的首地址，待排序的原数据便保存在数组a中。
     *      在程序中，首先将需要插入的元素保存到变量t中。
     *      变量j表示需要插入的位置，一般就是插入数组元素的序号。
     *      设置变量j的值为i-1,表示准备将当前位置(序号为i)的数插入序号为i-1 (即前一个元素)的位置。
     *
     *      接着，算法程序通过while循环来进行判断，如果序号为j元素的数据大于变量t (需要插入的数据)，则将序号为j的元素向后移，同时变量j减1,以判断前一个数据是否还需要向后移。
     * 通过该while循环找到一个元素的值比1小，该元素的序号为j。然后，将在序号为j的下一个元素进行数据插入操作。
     * @param a
     */
    //插入排序算法函数
    void insertionSort(int[] a) {
        int i, j, t;

//        45,2,5,1,34,14,87,32,11,15,21
        for (i = 1; i < a.length; i++) {//整个排序算法需要执行n-1次
            t = a[i];//需要进行插入的元素t
            j = i - 1;
            while (j >= 0 && t < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = t;

            System.out.println("这是第" + i + "次插入排序的结果");
            System.out.println(Arrays.toString(a));
        }
    }
}
