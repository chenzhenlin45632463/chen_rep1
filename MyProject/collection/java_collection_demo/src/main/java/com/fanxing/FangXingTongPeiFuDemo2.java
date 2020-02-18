package com.fanxing;

import com.model.Animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FangXingTongPeiFuDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("西江月");
        list.add("难听继续");
        Object s = list.get(0);
//        System.out.println(s);
        //test(list);
        Object animal = new Animal("恐龙-蛇颈龙");
        System.out.println(animal);
    }

    public static void test(List<?> list){
        Object o = list.get(1);
        System.out.println(o);
        System.out.println(new Object());
    }
}
