package com.java.enumtest.demo;

import com.java.enumtest.Count;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EnumMethodTest {
    public static void main(String[] args) {
        for (Count count : Count.values()) {
//            System.out.println(count.getCode()+":"+count.getDescription());
        }
        Count[] counts = Count.values();
        System.out.println(Arrays.toString(counts));
    }

    @Test
    public void testTrim(){
     String s = "   蒋经国 蒋介石    蒋太保  ";
        System.out.println(s);
        String trim = s.trim();
        System.out.println(trim);
    }

    @Test
    public void testEnumName(){
        System.out.println(Count.BTC.name());
    }
}
