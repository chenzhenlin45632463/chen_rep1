package com.java.chapter4;

public class DeamonThread {

    public static void main(String[] args) {

        Thread thread = new Thread("t0"){
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+":running");
                    Thread.sleep(10000);
                    System.out.println(Thread.currentThread().getName()+":done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        thread.setDaemon(true);


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+":main");
    }
}
