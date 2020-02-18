package com.test.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal(0.020);
        BigDecimal rate = new BigDecimal(1.03);
        BigDecimal result = num.multiply(rate, MathContext.DECIMAL32);
        BigDecimal abs = num.abs();
        System.out.println(abs);
//        System.out.println(result);
    }


}
