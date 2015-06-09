package com.jamindy.v2_simplefactory;

import com.jamindy.cars.BenzCar;
import com.jamindy.cars.BmwCar;
import com.jamindy.cars.Car;
import com.jamindy.cars.PorscheCar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 15-6-9.
 */
public class Client {

    public static void main(String[] args){

        Car car = new SimpleCarFactory().createCar("Benz");

        if(car != null){
            car.drive();
        }

    }
}
