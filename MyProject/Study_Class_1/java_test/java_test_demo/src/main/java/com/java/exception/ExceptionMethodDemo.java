package com.java.exception;

public class ExceptionMethodDemo {
    public static void main(String[] args) {
        try {
            int i = 1/0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.toString());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getCause());
            System.out.println(e.getStackTrace());
        }

    }
}
