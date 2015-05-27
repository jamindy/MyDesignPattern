package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class Mjollnir implements IFlyingMagicWeapon {

    @Override
    public void flyImpl() {
        System.out.println("Mjollnir hits the enemy in the air and returns back to the owner's hand");
    }

    @Override
    public void wieldImpl() {
        System.out.println("wielding Mjollnir");
    }

    @Override
    public void swingImpl() {
        System.out.println("swinging Mjollnir");
    }

    @Override
    public void unWieldImpl() {
        System.out.println("unWielding Mjollnir");
    }
}
