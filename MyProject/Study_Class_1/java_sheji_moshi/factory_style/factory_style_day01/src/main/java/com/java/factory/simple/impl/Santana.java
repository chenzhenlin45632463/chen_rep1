package com.java.factory.simple.impl;

import com.java.factory.simple.Car;

public class Santana implements Car {
    public void run() {
        System.out.println("桑塔纳正常行驶");
    }

    public void stop() {
        System.out.println("桑塔纳停止运行");
    }
}
