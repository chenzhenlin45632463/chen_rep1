package com.zj3;

import org.junit.jupiter.api.Test;

/**
 * 控制流程，条件语句，循环语句
 */
public class KongZhiLiuCheng3_8 {

    /**
     * switch语句
     */
    @Test
    public void test() {
        String key = "1";
        int i = 5;
        switch (i) {
            case 1:
                System.out.println("c1");
                break;
            case 2:
                System.out.println("c2");
                break;
            case 3:
                System.out.println("c4");
                break;
            default:
                System.out.println("other choose");
        }
    }
}
