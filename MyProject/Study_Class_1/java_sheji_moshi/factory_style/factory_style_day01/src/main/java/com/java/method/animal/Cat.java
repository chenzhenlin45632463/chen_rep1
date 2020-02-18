package com.java.method.animal;

import com.java.method.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void run() {
        System.out.println("cat is running");
    }

    @Override
    public void sleep() {
        System.out.println("cat like '喵喵喵喵'");
    }
}
