package com.java.demo01;

import com.java.model.MyException;
import com.java.model.ZiException;

public class TestMyException1 {

    public static void main(String[] args) {

        test(null,0);
    }


    public static void test(String s,Integer i) {
        try{
            if (s == null&& i == 0){

                throw new MyException("大兄弟，参数有错");
            }else {
                System.out.println(s+"这人"+"有"+i+"岁");
            }
        }catch (Exception e){
            System.out.println("进入了catch处理");
            e.printStackTrace();
        }

        System.out.println("后续操作");
    }
}
