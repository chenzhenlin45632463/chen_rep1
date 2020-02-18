package com.thread;

import org.junit.Test;

public class ThreadJoinSetTime {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":" + i);
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":" + i);
            }
        }, "t2");

        t1.start();
        t2.start();
        t1.join(100);
        t2.join(50);

        System.out.println("main has end");
    }

    @Test
    public void getNameMethod(){
        System.out.println();
    }
}
