package com.java.thread;

public class MyStackSizeDemo {
    private static int counter;

    public static void main(String[] args) {


        Thread t = new Thread(null, new Runnable() {
            @Override
            public void run() {
                try {
                    add(0);
                } catch (Error e) {
                    System.out.println(counter);
                }
            }
            private void add(int i) {
                counter++;
                add(i + 1);
            }
        }, "new_thread",1 << 24) {};/*1 << 23大概是8M*/

        t.start();
    }


}
