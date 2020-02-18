package com.java.runnable;

public class TicketWindowRunnable implements Runnable {
    private static final int MAX = 50;
    private static int index = 1;
    @Override
    public void run() {

        while (index<=MAX){

            System.out.println("柜台"+Thread.currentThread().getName()+"当前号码是"+index++);
        }
    }
    public static void main(String[] args) {
        TicketWindowRunnable runnable = new TicketWindowRunnable();

        Thread t1 = new Thread(runnable,"一号桌");
        t1.start();
        Thread t2 = new Thread(runnable,"二号桌");
        t2.start();
        Thread t3 = new Thread(runnable,"三号桌");
        t3.start();
    }
}
