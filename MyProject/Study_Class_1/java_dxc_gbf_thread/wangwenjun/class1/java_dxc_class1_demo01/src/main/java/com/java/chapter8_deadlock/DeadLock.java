package com.java.chapter8_deadlock;

public class DeadLock {
    private OtherService otherService;
    private final Object lock = new Object();

    public DeadLock(OtherService otherService) {
        this.otherService = otherService;
    }

    public void m1() {
        synchronized (lock) {
            System.out.println("deadLock-m1");
            otherService.s1();
        }
    }

    public void m2() {
        synchronized (lock) {
            System.out.println("deadLock-m2");
        }
    }
}
