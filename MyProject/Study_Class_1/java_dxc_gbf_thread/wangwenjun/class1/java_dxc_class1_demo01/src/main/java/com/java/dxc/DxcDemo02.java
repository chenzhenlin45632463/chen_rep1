package com.java.dxc;

public class DxcDemo02 {
    public static void main(String[] args) {

        Thread t = new Thread("comstName01"){
            @Override
            public void run() {

                System.out.println("name is :"+Thread.currentThread().getName());
            }
        };

        t.run();//打印结果：name is :main
        t.start();//打印结果：name is :comstName01

    }
}
