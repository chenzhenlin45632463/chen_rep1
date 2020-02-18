package com.java.factory.simple.impl;

import com.java.factory.simple.Car;

public class Booma implements Car {
    public void run() {
        System.out.println("宝马正常行驶");
    }

    public void stop() {
        System.out.println("宝马停止运行");
    }
}
