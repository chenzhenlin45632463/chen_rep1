package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        try{
            int[]arr = {1,2,3};
            System.out.println(arr[4]);


        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            /*System.out.println(e.getMessage());
            System.out.println(e.toString());*/
        }

        try {
            List list = new ArrayList();
            list.add(1);
            list.add(2);
            list.add(3);

            System.out.println(list.get(5));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
           /* System.out.println(e.getMessage());
            System.out.println(e.toString());*/
        }
        System.out.println("后续代码");
    }
}
