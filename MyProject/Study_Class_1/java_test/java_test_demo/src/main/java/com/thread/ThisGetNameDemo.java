package com.thread;

public class ThisGetNameDemo extends Thread{

    public ThisGetNameDemo() {
        System.out.print("cons current:"+Thread.currentThread().getName());
        System.out.println("    cons this:"+this.getName());
    }

    @Override
    public void run() {
        System.out.print("run current:"+Thread.currentThread().getName());
        System.out.println("    run this:"+this.getName());
    }
    public static void main(String[] args) {
        Thread thread = new ThisGetNameDemo();
        Thread t1 = new Thread(thread,"t-one");
//        thread.run();
        t1.start();
    }
}
