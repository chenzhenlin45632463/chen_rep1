package com.java.chapter8_deadlock;

public class OtherService {
    private DeadLock deadLock;
    public void s1(){
        synchronized (deadLock){

            System.out.println("s1===========");
        }
    }
    public void s2(){
        synchronized (deadLock){
            deadLock.m2();
        }
    }

    public void setDeadLock(DeadLock deadLock) {
        this.deadLock = deadLock;
    }
}
