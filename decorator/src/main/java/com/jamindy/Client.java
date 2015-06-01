package com.jamindy;

/**
 * Created by admin on 15-5-31.
 */
public class Client {

    public static void main(String[] args){
        Troll troll = new Troll("Monster jamindy");

        troll.attack();
        troll.fleeBattle();

        SmartTroll smartTroll = new SmartTroll(troll);
        smartTroll.attack();
        smartTroll.fleeBattle();
    }
}
