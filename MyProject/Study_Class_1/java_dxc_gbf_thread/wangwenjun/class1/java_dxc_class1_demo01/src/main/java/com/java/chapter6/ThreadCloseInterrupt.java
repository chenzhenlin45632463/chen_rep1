package com.java.chapter6;

public class ThreadCloseInterrupt {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {

                try {
                    Thread.sleep(500);
                    System.out.println(i);
                } catch (Exception e) {
                    System.out.println("打断成功");
//                    break;
                }

            }

            System.out.println("后续代码");
        });
        t1.start();
        try {
            Thread.sleep(3000);
            t1.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
