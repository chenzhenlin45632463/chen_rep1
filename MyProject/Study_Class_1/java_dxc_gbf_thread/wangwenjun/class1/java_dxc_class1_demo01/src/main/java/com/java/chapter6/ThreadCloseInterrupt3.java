package com.java.chapter6;

public class ThreadCloseInterrupt3 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                /*业务代码*/
                System.out.println("执行2代码");

                Thread.sleep(5000);
                System.out.println("执行5秒代码");
            } catch (InterruptedException e) {
                System.out.println("打断成功");
                e.printStackTrace();
//                    break;
            }

        });
        t1.start();
        try {
            Thread.sleep(6002);
            t1.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
