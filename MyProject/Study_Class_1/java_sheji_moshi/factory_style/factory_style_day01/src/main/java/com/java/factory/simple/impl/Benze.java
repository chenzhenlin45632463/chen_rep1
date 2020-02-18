package com.java.factory.simple.impl;

import com.java.factory.simple.Car;

public class Benze implements Car {
    public void run() {
        System.out.println("宾士正常行驶...");
    }

    public void stop() {
        System.out.println("宾士停止行驶...");
    }
}
