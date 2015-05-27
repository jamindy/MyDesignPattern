package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class Excalibur implements IBlindingMagicWeapon {

    @Override
    public void blindImpl() {
        System.out.println("bright light streams from Excalibur blinding the enemy");
    }

    @Override
    public void wieldImpl() {
        System.out.println("wielding Excalibur");
    }

    @Override
    public void swingImpl() {
        System.out.println("swinging Excalibur");
    }

    @Override
    public void unWieldImpl() {
        System.out.println("unWielding Excalibur");
    }
}
