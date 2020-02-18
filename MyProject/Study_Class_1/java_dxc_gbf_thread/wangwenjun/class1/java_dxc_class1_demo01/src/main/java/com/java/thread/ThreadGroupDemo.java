package com.java.thread;

import java.util.Arrays;
import java.util.List;

public class ThreadGroupDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread("testOne") {
            @Override
            public void run() {
                System.out.println("run 方法执行" );
            }
        };

        t1.start();
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        Thread[]threads = new Thread[group.activeCount()];
        group.enumerate(threads);
        for (Thread thread : threads) {

            System.out.println("thread :"+thread);
        }

    }
}
