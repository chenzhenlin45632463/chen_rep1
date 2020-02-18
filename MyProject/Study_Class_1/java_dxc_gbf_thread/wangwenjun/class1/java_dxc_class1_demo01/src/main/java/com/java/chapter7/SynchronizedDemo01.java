package com.java.chapter7;

public class SynchronizedDemo01 {
    private String lock = "lock";

    public void m1() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void m2() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo01 sd = new SynchronizedDemo01();
        Thread t1 = new Thread(() -> {
            sd.m1();
            ;
        }, "thread1");

        Thread t2 = new Thread(() -> {
            sd.m2();
            ;
        }, "thread2");

        t1.start();
        t2.start();
    }
}
