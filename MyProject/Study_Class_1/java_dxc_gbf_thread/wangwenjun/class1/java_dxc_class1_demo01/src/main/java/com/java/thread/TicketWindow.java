package com.java.thread;

public class TicketWindow extends Thread{
    private final String name;
    private static final int MAX = 50;
    private static int index = 1;

    public TicketWindow(String name) {
        this.name = name;
    }
    @Override
    public void run() {

        while (index<=MAX){

            System.out.println("柜台"+name+"当前号码是"+index++);
        }
    }
    public static void main(String[] args) {
        TicketWindow t1 = new TicketWindow("一号柜台");
        t1.start();
        TicketWindow t2 = new TicketWindow("二号柜台");
        t2.start();
        TicketWindow t3 = new TicketWindow("三号柜台");
        t3.start();
    }
}
