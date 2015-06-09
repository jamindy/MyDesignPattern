package com.jamindy;

/**
 * Created by admin on 15-5-31.
 */
public class SmartTroll implements Hostile{

    private Troll troll;

    public SmartTroll(Troll troll) {
        this.troll = troll;
    }

    @Override
    public void attack() {
        System.out.println("do something before attack");
        troll.attack();
        System.out.println("do something after attack");
    }

    @Override
    public void fleeBattle() {
        System.out.println("do something before fleeBattle");
        troll.fleeBattle();
        System.out.println("do something after fleeBattle");
    }
}
