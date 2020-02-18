package com.java.method.fac;

import com.java.method.Animal;
import com.java.method.BaseFactory;
import com.java.method.animal.Cat;

public class CatFactory extends BaseFactory {
    public Animal create() {
        Animal cat = new Cat();
        return cat;
    }
}
