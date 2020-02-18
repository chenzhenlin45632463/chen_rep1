package com.java.dxc;

public class DxcDemo01 {
    public static void main(String[] args) {

        Thread thread = new Thread("thread_demo1") {//为线程命名

            @Override
            public void run() {


            }
        };
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("t1"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
