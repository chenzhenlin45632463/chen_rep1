package com.java.proto.shape;

import lombok.ToString;

//@ToString
public class Circle implements Shape {
    private int r = 4;
    public Object clone() {
        Circle circle = null;
        try {
            circle=(Circle)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆形失败");
        }
        return circle;
    }

    public void countArea() {

        System.out.println("该圆的面积="+3.1415*r*r+"\n");
    }
}
