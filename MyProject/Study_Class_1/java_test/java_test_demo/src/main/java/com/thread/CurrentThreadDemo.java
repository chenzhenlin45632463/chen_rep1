package com.thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread("thread1"){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
//        t1.start();
        System.out.println(t1);
    }
}
