package com.jamindy.v3_factorymethod;


import com.jamindy.cars.BmwCar;
import com.jamindy.cars.Car;

/**
 * Created by admin on 15-6-9.
 */
public class BmwCarFactory implements CarFactory {

    @Override
    public Car createCar() throws Exception {
        return new BmwCar();
    }
}
