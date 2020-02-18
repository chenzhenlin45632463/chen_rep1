package com.collection;

import com.model.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class FanXingEDemo {
    @Test
    public void test(){
        Collection<String>list = new ArrayList<String>();
        list.add("2");
        System.out.println(list);
    }

    @Test
    public void myE(){
        Person person = new Person();

        person.setName("杨万里");

        System.out.println(person.getName());

        Person<Integer> p1 = new Person<Integer>();
        p1.setName(12333);
        System.out.println(p1.getName());
    }
}
