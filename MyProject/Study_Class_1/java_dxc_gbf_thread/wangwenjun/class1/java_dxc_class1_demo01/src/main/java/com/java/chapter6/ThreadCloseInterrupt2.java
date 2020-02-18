package com.java.chapter6;

public class ThreadCloseInterrupt2 {
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                        System.out.println("while 内部");
                    } catch (InterruptedException e) {
                        System.out.println("已中断");
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };

        t1.start();
        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(t1.isInterrupted());
        t1.interrupt();
        System.out.println(t1.isInterrupted());
    }
}
