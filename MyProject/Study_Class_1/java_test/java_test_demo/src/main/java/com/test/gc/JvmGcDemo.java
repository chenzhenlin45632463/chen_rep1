package com.test.gc;

public class JvmGcDemo {
    public static void main(String[] args) {
        System.out.println("start:"+Runtime.getRuntime().freeMemory()/ (1024 * 1024));
        Object object1 = new Object();
        System.out.println("run_time:"+Runtime.getRuntime().freeMemory()/ (1024 * 1024));
        Object object2 = new Object();
        System.gc();
        System.out.println("end:"+Runtime.getRuntime().freeMemory()/ (1024 * 1024));
    }
}
