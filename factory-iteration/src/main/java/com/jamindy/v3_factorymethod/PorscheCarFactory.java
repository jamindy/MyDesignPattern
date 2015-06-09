package com.jamindy.v3_factorymethod;

import com.jamindy.cars.Car;
import com.jamindy.cars.PorscheCar;

/**
 * Created by admin on 15-6-9.
 */
public class PorscheCarFactory implements CarFactory {

    @Override
    public Car createCar() throws Exception {
        return new PorscheCar();
    }
}
