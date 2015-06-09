package com.jamindy;

/**
 * Created by admin on 15-6-9.
 */
public class ClientWithNoFacade {

    public static void main(String[] args){
        System.out.println("When I coming home,I do ");

        AirConditioner airConditioner = new AirConditioner();
        Audio audio = new Audio();
        Curtain curtain = new Curtain();
        Light light = new Light();

        airConditioner.turnOn();
        audio.musicOn();
        curtain.openCurtain();
        light.ligntOn();

        System.out.println("When I am out,I need to do ");

        airConditioner.turnOff();
        audio.musicOff();
        curtain.closeCurtain();
        light.ligntOff();
    }
}
