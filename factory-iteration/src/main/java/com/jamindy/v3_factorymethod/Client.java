package com.jamindy.v3_factorymethod;

import com.jamindy.cars.Car;

/**
 * Created by admin on 15-6-9.
 */
public class Client {

    public static void main(String[] args) throws Exception{
        CarFactory carFactory = null;
        Car car = null;

        carFactory = new BenzCarFactory();
        car = carFactory.createCar();
        car.drive();

        carFactory = new VolvoCarFactory();
        car = carFactory.createCar();
        car.drive();
    }
}
