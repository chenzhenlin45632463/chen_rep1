package com.collection;

import org.junit.Test;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("纪晓岚");
        list.add("和珅");
        list.add("乾隆");
        list.add("雍正");
        list.add("康熙");
        list.add("顺治");
        list.add(new Object());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(list.size());
        }
    }
    @Test
    public void test(){
        Collection l1 = new ArrayList();
        Collection l2 = new HashSet();
        Collection l3 = new Vector();

        Iterator i1 = l1.iterator();
        Iterator i2 = l2.iterator();
        Iterator i3 = l3.iterator();
    }
}
