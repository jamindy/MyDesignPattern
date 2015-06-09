package com.jamindy.duckexample;

/**
 * Created by admin on 15-6-8.
 */
public class Client {

    public static void main(String[] args){
        Duck duck = new GreenDuck();
        duck.quack();

        System.out.println();
        Duck smartDuck = new SmartDuck(duck);
        smartDuck.quack();
    }
}
