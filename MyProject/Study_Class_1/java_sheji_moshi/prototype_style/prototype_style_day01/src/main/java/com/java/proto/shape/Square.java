package com.java.proto.shape;

import lombok.ToString;

@ToString
public class Square implements Shape {
    private int a=4;
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制正方形失败");
        }
        return square;
    }

    public void countArea() {

        System.out.println("该正方形的面积="+a*a+"\n");
    }
}
