package com.jamindy;

/**
 * Created by admin on 15-5-31.
 */
public class Troll implements Hostile{

    private String name;

    public Troll(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(name+" begin attack!");
    }

    @Override
    public void fleeBattle() {
        System.out.println(name+" flee the battle!");
    }
}
