package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo1 {
    public static void main(String[] args) {
        try{
            int[]arr = {1,2,3};
            List list = new ArrayList();
            list.add(1);
            list.add(2);
            list.add(4);
            System.out.println(list.get(5));
            System.out.println("try中测试代码");
            System.out.println(arr[4]);

        }catch (ArrayIndexOutOfBoundsException e){//数组
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }catch (IndexOutOfBoundsException e){//集合
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("后续代码");
    }
}
