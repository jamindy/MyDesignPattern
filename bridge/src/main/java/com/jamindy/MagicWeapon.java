package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public abstract class MagicWeapon {
    protected IWeapon weapon;

    public IWeapon getWeapon(){
        return weapon;
    }

    public MagicWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public abstract void wield();

    public abstract void swing();

    public abstract void unWield();


}
