package com.thread;

public class FatherThread extends Thread{

    @Override
    public void run() {
        Thread sonThread=new SonThread();
        sonThread.start();
    }

    public static void main(String[] args) throws InterruptedException{
        Thread fatherThread = new FatherThread();
        fatherThread.start();
//        Thread.sleep(3000);
//        fatherThread is stop
//        fatherThread.interrupt();
//        Thread.sleep(2000);
        while (true){
            Thread.sleep(500);
            if (fatherThread.isAlive()){
                System.out.println("fatherThread is still alive");
            }else {
                System.out.println("fatherThread is dead");
            }
        }

    }

    class SonThread extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("son is alive");
            }
        }
    }
}
