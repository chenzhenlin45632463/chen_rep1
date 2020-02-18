package com.java.chapter4;

public class ThreadSimpleApi {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {

                System.out.println(Thread.currentThread().getName()+"-index-"+i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 100; i++) {

                System.out.println(Thread.currentThread().getName()+"-index-"+i);
            }
        });

        Thread t3 = new Thread(()->{
            for (int i = 0; i < 100; i++) {

                System.out.println(Thread.currentThread().getName()+"-index-"+i);
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);/*优先级最高*/
        t2.setPriority(Thread.NORM_PRIORITY);/*优先级中等*/
        t3.setPriority(Thread.MIN_PRIORITY);/*优先级最低*/

        t1.start();
        t2.start();
        t3.start();
    }
}
