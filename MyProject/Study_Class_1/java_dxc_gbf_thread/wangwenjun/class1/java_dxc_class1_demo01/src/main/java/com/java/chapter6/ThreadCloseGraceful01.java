package com.java.chapter6;

public class ThreadCloseGraceful01 {
    static class Thread01 extends Thread {
        private boolean flag = true;
        @Override
        public void run() {
            while (flag) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ": while");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void shutDown() {
            flag = false;
        }
    }

    public static void main(String[] args) {
        Thread01 t1 = new Thread01();
        t1.start();
        try {
            Thread.sleep(1500_0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.shutDown();
    }
}
