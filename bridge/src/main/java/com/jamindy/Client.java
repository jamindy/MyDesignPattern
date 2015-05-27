package com.jamindy;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args ) {
        BlindingMagicWeapon blindingMagicWeapon = new BlindingMagicWeapon(new Excalibur());
        blindingMagicWeapon.wield();
        blindingMagicWeapon.swing();
        blindingMagicWeapon.unWield();
        blindingMagicWeapon.blind();

        FlyingMagicWeapon flyingMagicWeapon = new FlyingMagicWeapon(new Mjollnir());
        flyingMagicWeapon.wield();
        flyingMagicWeapon.swing();
        flyingMagicWeapon.unWield();
        flyingMagicWeapon.fly();

        SoulEatingMagicWeapon soulEatingMagicWeapon = new SoulEatingMagicWeapon(new Stormbringer());
        soulEatingMagicWeapon.wield();
        soulEatingMagicWeapon.swing();
        soulEatingMagicWeapon.unWield();
        soulEatingMagicWeapon.eatSoul();
    }
}
