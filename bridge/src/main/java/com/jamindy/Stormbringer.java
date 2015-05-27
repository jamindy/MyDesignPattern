package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class Stormbringer implements ISoulEatingMagicWeapon {

    @Override
    public void eatSoulImpl() {
        System.out.println("Stormbringer devours the enemy's soul");
    }

    @Override
    public void wieldImpl() {
        System.out.println("wielding Stormbringer");
    }

    @Override
    public void swingImpl() {
        System.out.println("swinging Stormbringer");
    }

    @Override
    public void unWieldImpl() {
        System.out.println("unWielding Stormbringer");
    }
}
