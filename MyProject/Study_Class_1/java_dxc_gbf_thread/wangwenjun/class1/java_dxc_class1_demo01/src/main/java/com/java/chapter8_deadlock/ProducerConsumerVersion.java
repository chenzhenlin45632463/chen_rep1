package com.java.chapter8_deadlock;

public class ProducerConsumerVersion {
    private Object lock;

    private int i;

    //生产
    public void producer(){
        System.out.println("p->"+i++);
    }

    //消费
    public void consumer(){
        System.out.println("c->"+i);
    }

    public static void main(String[] args) {
        ProducerConsumerVersion pc = new ProducerConsumerVersion();
        Thread producer = new Thread(() -> {
            while (true) {
                pc.producer();
            }
        });

        Thread consumer = new Thread(()->{
            while (true) {
                pc.consumer();
            }
        });

        producer.start();
        consumer.start();
    }
}
