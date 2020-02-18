package com.java.chapter;

public class TicketWindowsRunnable implements Runnable {
    private Integer index = 1;
    private Integer MAX = 500;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在打印第"+index+++"张票");
            if (index>=MAX){
                break;
            }
        }
    }
    public static void main(String[] args) {
        TicketWindowsRunnable runnable = new TicketWindowsRunnable();
        Thread t1 = new Thread(runnable,"一号窗口");
        Thread t2 = new Thread(runnable,"二号窗口");
        Thread t3 = new Thread(runnable,"三号窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}
