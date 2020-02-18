package com.java.method.animal;

import com.java.method.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    @Override
    public void run() {
        System.out.println("dog is running");
    }

    @Override
    public void sleep() {
        System.out.println("dog like '汪汪汪'");
    }
}
