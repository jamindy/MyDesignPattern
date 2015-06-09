package com.jamindy;

/**
 * Created by admin on 15-6-9.
 */
public class ClientWithFacade {

    public static void main(String[] args){
        HomeFacade homeFacade = new HomeFacade();
        System.out.println("when I coming home");
        homeFacade.turnOn();

        System.out.println();
        System.out.println("When I leaving");
        homeFacade.turnOff();
    }
}
