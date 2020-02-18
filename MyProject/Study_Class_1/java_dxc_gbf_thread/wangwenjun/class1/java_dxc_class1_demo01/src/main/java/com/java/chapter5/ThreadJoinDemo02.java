package com.java.chapter5;

public class ThreadJoinDemo02 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {

                try {
                    Thread.sleep(1001);
                    System.out.println(Thread.currentThread().getName()+":index--"+i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        try {
            t1.start();
            t1.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {

            try {
                Thread.sleep(1001);
                System.out.println(Thread.currentThread().getName()+":index-"+i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
