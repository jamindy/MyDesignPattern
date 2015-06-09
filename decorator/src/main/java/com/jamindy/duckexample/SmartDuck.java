package com.jamindy.duckexample;

/**
 * Created by admin on 15-6-8.
 */
public class SmartDuck implements Duck {

    private Duck duck;

    public SmartDuck(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        System.out.println("become Smarter");
        duck.quack();
        System.out.println("louder and sweet!");
    }
}
