package com.jamindy;

/**
 * Created by admin on 15-6-9.
 */
public class HomeFacade {
    private AirConditioner airConditioner;
    private Audio audio;
    private Curtain curtain;
    private Light light;

    public HomeFacade() {
        airConditioner = new AirConditioner();
        audio = new Audio();
        curtain = new Curtain();
        light = new Light();
    }

    public void turnOn(){
        System.out.println("HomeFacade do");
        airConditioner.turnOn();
        audio.musicOn();
        curtain.openCurtain();
        light.ligntOn();
    }

    public void turnOff(){
        System.out.println("HomeFacade do");
        airConditioner.turnOff();
        audio.musicOff();
        curtain.closeCurtain();
        light.ligntOff();
    }
}
