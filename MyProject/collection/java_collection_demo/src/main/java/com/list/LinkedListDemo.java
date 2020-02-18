package com.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
//        List list = new LinkedList();
        LinkedList<String> list = new LinkedList();
        list.addFirst("李清照");
        list.addFirst("白居易");
        list.addFirst("张养浩");
        String s1 = list.removeLast();
        System.out.println(s1);
        String s2 = list.get(1);
        System.out.println(s2);
        System.out.println("----------------");
        System.out.println(list);
        list.get(1);
    }
}
