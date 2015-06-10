package com.jamindy.v4_abstractfactory;

import com.jamindy.cars.Car;

/**
 * Created by admin on 15-6-10.
 */
public class Client {

    public static void main(String[] args){
        createCarAndDrive(new BenzCarFactory());
        createCarAndDrive(new PorscheCarFactory());
    }

    public static void createCarAndDrive(CarFactory carFactory){
        Car businessCar = carFactory.createBusinessCar();
        businessCar.drive();

        Car sportCar = carFactory.createSportCar();
        sportCar.drive();

        Car suvCar = carFactory.createSUVCar();
        suvCar.drive();
    }
}
