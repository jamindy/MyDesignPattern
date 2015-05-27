package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class BlindingMagicWeapon extends MagicWeapon {

    public BlindingMagicWeapon(IWeapon weapon) {
        super(weapon);
    }

    @Override
    public IBlindingMagicWeapon getWeapon() {
        return (IBlindingMagicWeapon)super.getWeapon();
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

    public void blind(){
         getWeapon().blindImpl();
    }
}
