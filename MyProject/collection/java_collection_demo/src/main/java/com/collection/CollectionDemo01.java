package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
//        Collection list = new HashSet();
        list.add("纪晓岚");
        list.add("和珅");
        list.add("乾隆");
        list.add("雍正");
        list.add("康熙");
        list.add("顺治");
        list.add(new Object());
        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.println(o);
        }
    }
}
