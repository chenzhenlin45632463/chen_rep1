package com.java.method;

import com.java.method.fac.CatFactory;
import com.java.method.fac.DogFactory;
import org.junit.Test;

public class MethodFactoryDemo {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Animal animal = catFactory.create();
        animal.eat();
        animal.run();
        animal.sleep();
    }

    @Test
    public void dogFactory(){
        DogFactory factory = new DogFactory();
        Animal animal = factory.create();
        animal.eat();
        animal.run();
        animal.sleep();
    }
}
