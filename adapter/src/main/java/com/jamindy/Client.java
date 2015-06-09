package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class Client {

    public static void main(String[] args){
        Goose goose = new WightGoose();
        Duck duck = new GooseToDuckAdapter(goose);
        duck.quack();
    }

}
