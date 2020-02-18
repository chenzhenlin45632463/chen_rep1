package com.java.chapter6;

public class ThreadCloseGraceful02 {

     static class Thread01 extends Thread{
         @Override
         public void run() {
             while (true){
                 try {
                     Thread.sleep(100);
                     System.out.println(Thread.interrupted());
                 } catch (InterruptedException e) {
                     break;
                 }
             }
         }
     }
    public static void main(String[] args) {
        Thread01 t1 = new Thread01();
        t1.start();
        try {
            Thread.sleep(100_0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt();
    }
}
