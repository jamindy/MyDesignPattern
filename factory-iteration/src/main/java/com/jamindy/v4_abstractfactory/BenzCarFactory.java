package com.jamindy.v4_abstractfactory;

import com.jamindy.cars.*;

/**
 * Created by admin on 15-6-10.
 */
public class BenzCarFactory implements CarFactory{

    @Override
    public BenzCar createBusinessCar() {
        return new BenzBusinessCar();
    }

    @Override
    public BenzCar createSUVCar() {
        return new BenzSUVCar();
    }

    @Override
    public BenzCar createSportCar() {
        return new BenzSportCar();
    }
}
