package com.java.chapter6;

public class ThreadCloseGraceful03 {
    private static class Thread01 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println(Thread.interrupted());
                if (Thread.interrupted())
                    break;
            }
        }
        /*代码阻塞状态*/
    }

    public static void main(String[] args) {
        Thread01 t1 = new Thread01();
        t1.start();
        try {
            Thread.sleep(500_0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt();
    }
}
