package com.java.thread;

public class ThreadConstructorDemo {
    public static void main(String[] args) {

        /*thread重写run方法创建线程名的方式*/
        Thread t = new Thread("threadName"){
            @Override
            public void run() {
                System.out.println("thread :"+Thread.currentThread().getName());
            }
        };



        Thread another = new Thread(()->{
            System.out.println("Runnable :"+Thread.currentThread().getName());
        },"runnableName");

        Thread t1 = new Thread();
        Thread t2 = new Thread("name");

        System.out.println(Thread.currentThread().getName());

        System.out.println(t.getName());

        System.out.println(another.getName());


        t.start();
        another.start();
    }
}
