package com.jamindy;

/**
 * Created by admin on 15-6-9.
 */
public class DogModelFactory implements ModelFactory {

    @Override
    public ShapModel factoryMethod() {
        return new DogModel();
    }
}
