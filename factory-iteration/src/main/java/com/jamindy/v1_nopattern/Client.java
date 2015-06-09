package com.jamindy.v1_nopattern;

import com.jamindy.cars.BenzCar;
import com.jamindy.cars.BmwCar;
import com.jamindy.cars.Car;

/**
 * Created by admin on 15-6-9.
 */
public class Client {

    public static void main(String[] args){
        Car car;
        car = new BenzCar();
        car.drive();

        car = new BmwCar();
        car.drive();
    }
}
