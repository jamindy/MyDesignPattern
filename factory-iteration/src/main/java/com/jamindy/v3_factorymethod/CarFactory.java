package com.jamindy.v3_factorymethod;

import com.jamindy.cars.Car;

/**
 * Created by admin on 15-6-9.
 */
public interface CarFactory {

    public Car createCar() throws Exception;

}
