package com.java.proto.shape;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestCloneDemo {
    @Test
    public void testClone(){
        Circle c1 = new Circle();
        Circle c2 = (Circle)c1.clone();
        Circle c3 = (Circle)c2.clone();
        Circle c4 = (Circle)c3.clone();
        Circle c5 = (Circle)c4.clone();
        Circle c6 = (Circle)c5.clone();

        List<Circle> list = Arrays.asList(c1, c2, c3, c4, c5, c6);
        for (Circle circle : list) {
            System.out.println(circle);
        }
    }

    private void test2(){

    }
}
