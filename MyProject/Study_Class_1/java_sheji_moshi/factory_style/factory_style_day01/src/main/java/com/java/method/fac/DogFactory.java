package com.java.method.fac;

import com.java.method.Animal;
import com.java.method.BaseFactory;
import com.java.method.animal.Dog;

public class DogFactory extends BaseFactory {
    @Override
    public Animal create() {
        Animal dog = new Dog();
        return dog;
    }
}
