package com.jamindy.v3_factorymethod;

import com.jamindy.cars.Car;
import com.jamindy.cars.VolvoCar;

/**
 * Created by admin on 15-6-9.
 */
public class VolvoCarFactory implements CarFactory{

    @Override
    public Car createCar() throws Exception {
        return new VolvoCar();
    }
}
