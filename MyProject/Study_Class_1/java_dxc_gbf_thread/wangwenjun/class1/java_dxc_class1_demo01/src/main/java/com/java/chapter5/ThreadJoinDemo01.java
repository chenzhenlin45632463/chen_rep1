package com.java.chapter5;

public class ThreadJoinDemo01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+":index-"+i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"thread_t1");

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000_0);
                    System.out.println(Thread.currentThread().getName()+":index-"+i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"thread_t2");
        try {
            t1.start();
            t1.join(5000);
            t2.start();
            t2.join(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main start,thread-0 end");
    }
}
