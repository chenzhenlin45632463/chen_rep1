package com.collection;

import com.model.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于测试单列集合常用方法的demo
 */
public class CollectionMethodsDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        Animal a = new Animal("长劲鹿");
        list.add(a);
        list.add("其他动物");
        list.add(1245);
        System.out.println(list);
        boolean f = list.remove(a);
        System.out.println(f);
        System.out.println(list);
    }
}
