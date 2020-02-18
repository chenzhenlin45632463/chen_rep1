package com.fanxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class FangXingTongPeiFuDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        List<Integer> list2 = new ArrayList();
        List<Number>list3 = new ArrayList<Number>();
        List<Object>list4 = new ArrayList<Object>();
        test(list);
        test(list2);
        test(list3);
        test(list4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collection<String> set = new HashSet();
        set.add("康有为");
        set.add("梁启超");
        set.add("谭嗣同");
        set.add("光绪");
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void test(Collection<?>list){
        list.add(null);
    }
}
