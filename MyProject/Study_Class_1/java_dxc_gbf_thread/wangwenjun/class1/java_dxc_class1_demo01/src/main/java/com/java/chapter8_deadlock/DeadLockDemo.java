package com.java.chapter8_deadlock;

public class DeadLockDemo {
    public static void main(String[] args) {
        OtherService otherService = new OtherService();
        DeadLock deadLock = new DeadLock(otherService);
        otherService.setDeadLock(deadLock);

        Thread t1 = new Thread(()->{
            while (true) {
                deadLock.m1();
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            while (true) {
                otherService.s2();
            }
        });
        t2.start();
    }
}
