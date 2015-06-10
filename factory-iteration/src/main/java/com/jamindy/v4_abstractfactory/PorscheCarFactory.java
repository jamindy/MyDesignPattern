package com.jamindy.v4_abstractfactory;

import com.jamindy.cars.*;

/**
 * Created by admin on 15-6-10.
 */
public class PorscheCarFactory implements CarFactory {

    @Override
    public PorscheCar createBusinessCar() {
        return new PorscheBusinessCar();
    }

    @Override
    public PorscheCar createSUVCar() {
        return new PorscheSUVCar();
    }

    @Override
    public PorscheCar createSportCar() {
        return new PorscheSportCar();
    }
}
