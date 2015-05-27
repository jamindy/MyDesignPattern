package com.jamindy;


/**
 * Created by admin on 15-5-27.
 */
public class Client {

    public static void main(String[] args){

        CallBack callback = new CallBack() {
            @Override
            public void call() {
                System.out.println("after execute do callback things!");
            }
        };

        new SimpleTask().executeWith(callback);
    }
}
