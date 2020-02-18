package com.java.factory.simple;

import com.java.factory.simple.impl.Benze;
import com.java.factory.simple.impl.Booma;
import com.java.factory.simple.impl.Santana;


public class SimpleFactory {

    Car getCar(String name) {
        Car car = null;
        switch (name) {
            case "santana":
                car = new Santana();
                break;
            case "booma":
                car = new Booma();
            break;
            case "benze":
                car = new Benze();
                break;
            default:
                break;
        }
        return car;
    }
}
