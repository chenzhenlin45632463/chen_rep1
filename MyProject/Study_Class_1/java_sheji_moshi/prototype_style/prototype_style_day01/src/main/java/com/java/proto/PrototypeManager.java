package com.java.proto;

import com.java.proto.shape.Circle;
import com.java.proto.shape.Shape;
import com.java.proto.shape.Square;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    public Map<String, Shape> hm = new HashMap<String, Shape>();

    public PrototypeManager() {
        hm.put("Circle", new Circle());
        hm.put("Square", new Square());
    }

    public void addShape(String key, Shape shape) {
        hm.put(key, shape);
    }

    public Shape getShape(String key) {
        return hm.get(key);
    }
}
