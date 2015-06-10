package com.jamindy.v4_abstractfactory;

import com.jamindy.cars.*;

/**
 * Created by admin on 15-6-10.
 */
public class BmwCarFactory implements CarFactory {

    @Override
    public BmwCar createBusinessCar() {
        return new BmwBusinessCar();
    }

    @Override
    public BmwCar createSUVCar() {
        return new BmwSUVCar();
    }

    @Override
    public BmwCar createSportCar() {
        return new BmwSportCar();
    }
}
