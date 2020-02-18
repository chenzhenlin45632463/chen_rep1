package com.java.factory.simple;

import org.junit.Test;

public class SimpieFactoryDemo {
    private static final SimpleFactory factory = new SimpleFactory();
    public static void main(String[] args) {
        Car santana = factory.getCar("santana");
        System.out.println(santana);
        santana.run();
        santana.stop();
    }

    @Test
    public void booma() {
        Car booma = factory.getCar("booma");
        booma.run();
        booma.stop();
    }

    @Test
    public void benze() {
        Car car = factory.getCar("benze");
        car.run();
        car.stop();
    }
}

