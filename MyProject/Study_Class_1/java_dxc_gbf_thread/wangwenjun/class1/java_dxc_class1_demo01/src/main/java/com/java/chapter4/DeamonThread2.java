package com.java.chapter4;

public class DeamonThread2 {

    public static void main(String[] args) {

        Thread t = new Thread(()->{
            Thread innerThread = new Thread(()->{
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(100);
                        System.out.println("innerThread :"+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            innerThread.setDaemon(true);
            innerThread.start();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+":fu");
        },"t");

        t.start();
    }
}
