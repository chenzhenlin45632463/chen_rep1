package com.test.http;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("k1","v1");
        map.put("k2","v2");
        map.put("k3","v3");
        map.put("k4","v4");
        map.put("k5","v5");

        System.out.println(map);
    }
}
