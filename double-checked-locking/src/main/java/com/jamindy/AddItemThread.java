package com.jamindy;

/**
 * Created by admin on 15-5-31.
 */
public class AddItemThread implements Runnable{

    private Inventory inventory;

    public AddItemThread(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public void run() {
        Item item = new Item();
        inventory.addItem(item);
    }
}
