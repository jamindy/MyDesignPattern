package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class SoulEatingMagicWeapon extends MagicWeapon {

    public SoulEatingMagicWeapon(IWeapon weapon) {
        super(weapon);
    }

    @Override
    public ISoulEatingMagicWeapon getWeapon() {
        return (ISoulEatingMagicWeapon) super.getWeapon();
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

    public void eatSoul() {
        getWeapon().eatSoulImpl();
    }
}
