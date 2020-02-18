package com.thread;

public class RunnableDemo {
    public static void main(String[] args) {
       Thread thread = new Thread(()->{
           System.out.println(Thread.currentThread());
       },"thread-first");

        Thread t1 = Thread.currentThread();
        System.out.println(t1);
       thread.start();
    }
}
