package com.jamindy;

/**
 * Created by admin on 15-5-31.
 */
public class Client {

    public static void main(String[] args){

        final Inventory inventory = new Inventory(100);

        Thread thread1 = new Thread(new AddItemThread(inventory));
        Thread thread2 = new Thread(new AddItemThread(inventory));
        Thread thread3 = new Thread(new AddItemThread(inventory));

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
