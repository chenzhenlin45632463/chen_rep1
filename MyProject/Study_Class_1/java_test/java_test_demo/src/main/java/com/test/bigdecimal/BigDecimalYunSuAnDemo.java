package com.test.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalYunSuAnDemo {
    public static void main(String[] args) {
        int point =  -14;
        BigDecimal floatRate = new BigDecimal(0.01).multiply(new BigDecimal(point), MathContext.DECIMAL32);
        BigDecimal rate = new BigDecimal(1) .add(floatRate);
        BigDecimal price = new BigDecimal(0.0174435000).multiply(rate, MathContext.DECIMAL64);
        System.out.println(rate);
        System.out.println(price);
        System.out.println(floatRate);
    }
}
