package com.java.proto.shape;

import com.java.proto.PrototypeManager;

import java.util.Map;
import java.util.Set;

public class PrototypeShapeCloneDemo {
    public static void main(String[] args) {
        PrototypeManager manager = new PrototypeManager();
        Shape circle = manager.getShape("Circle");
        for (int i = 0; i < 10; i++) {
            manager.addShape("circle"+i,(Circle)circle.clone());
        }
        Set<Map.Entry<String, Shape>> entries = manager.hm.entrySet();
        for (Map.Entry<String, Shape> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
