package com.jamindy.v4_abstractfactory;

import com.jamindy.cars.Car;

/**
 * Created by admin on 15-6-10.
 */
public interface CarFactory {

    Car createBusinessCar();

    Car createSUVCar();

    Car createSportCar();
}
