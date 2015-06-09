package com.jamindy.v2_simplefactory;

import com.jamindy.cars.BenzCar;
import com.jamindy.cars.BmwCar;
import com.jamindy.cars.Car;
import com.jamindy.cars.PorscheCar;

/**
 * Created by admin on 15-6-9.
 */
public class SimpleCarFactory {

    public Car createCar(String car){
        Car newCar = null;
        if("Benz".equals(car)){
            newCar = new BenzCar();
        }else if("Bmw".equals(car)){
            newCar = new BmwCar();
        }else if("Porsche".equals(car)){
            newCar = new PorscheCar();
        }else {
            throw new RuntimeException("Input Error!");
        }

        return newCar;
    }
}
