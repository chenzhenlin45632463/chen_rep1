package com.java.proto;

import com.java.proto.shape.Shape;

public class PrototypeShapeDemo {
    public static void main(String[] args) {
        PrototypeManager manager = new PrototypeManager();
        Shape circle = manager.getShape("Circle");
        circle.countArea();
        Shape square = manager.getShape("Square");
        square.countArea();
    }
}
