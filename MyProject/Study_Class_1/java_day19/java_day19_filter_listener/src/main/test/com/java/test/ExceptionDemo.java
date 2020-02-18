package com.java.test;

import java.nio.file.FileAlreadyExistsException;

public class ExceptionDemo {
    public static void main(String[] args) throws FileAlreadyExistsException {
        test("张扬");
//        test(null);
    }

    public static void test(String word) throws FileAlreadyExistsException {
        System.out.println(word);
        if (word==null){

            throw new FileAlreadyExistsException("名字根本不是张扬，你个大猪蹄子！！");
        }

        System.out.println(2);
    }
}
