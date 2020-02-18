package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo3 {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(arr[4]);
        System.out.println("====================");
        System.out.println(list.get(5));

        System.out.println("后续代码");
    }
}
