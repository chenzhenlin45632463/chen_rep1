package com.test.date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        long time = new Date().getTime();
        System.out.println(time);
        System.out.println(1564100640000l);
        long day = (time - 1564100640000l) / (1000 * 60 * 60 * 24);
        System.out.println("经过了"+day/30+"个多月");
        System.out.println();
    }
}
