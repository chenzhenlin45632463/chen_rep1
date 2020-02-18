package com.java.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedSuDuTest {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        ArrayList array = new ArrayList();

        for (int i = 0; i < 1000; i++) {
            link.add(i + 1);
        }
        for (int i = 0; i < 1000; i++) {
            array.add(i + 1);
        }
        System.out.println(link.size() + " ：" + array.size());

        long l_start = System.currentTimeMillis();
        link.add("l");
        long l_end = System.currentTimeMillis();
        System.out.println(l_end - l_start);

        long a_start = System.currentTimeMillis();
        array.add("a");
        long a_end = System.currentTimeMillis();

        System.out.println(a_end - a_start);
    }
}
