package com.jamindy.v3_factorymethod;

import com.jamindy.cars.BenzCar;
import com.jamindy.cars.Car;

/**
 * Created by admin on 15-6-9.
 */
public class BenzCarFactory implements CarFactory {

    @Override
    public Car createCar() throws Exception {
        return new BenzCar();
    }
}
