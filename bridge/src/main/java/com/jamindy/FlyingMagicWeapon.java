package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class FlyingMagicWeapon extends MagicWeapon {

    public FlyingMagicWeapon(IWeapon weapon) {
        super(weapon);
    }

    @Override
    public IFlyingMagicWeapon getWeapon() {
        return (IFlyingMagicWeapon) super.getWeapon();
    }

    @Override
    public void swing() {
        getWeapon().swingImpl();
    }

    @Override
    public void wield() {
        getWeapon().wieldImpl();
    }

    @Override
    public void unWield() {
        getWeapon().unWieldImpl();
    }

    public void fly() {
        getWeapon().flyImpl();
    }
}
