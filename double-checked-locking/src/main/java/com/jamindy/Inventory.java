package com.jamindy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by admin on 15-5-31.
 */
public class Inventory {

    private int inventorySize;
    private List<Item> itemList;
    private Lock lock = new ReentrantLock();

    public Inventory(int inventorySize) {
        this.inventorySize = inventorySize;
        this.itemList = new ArrayList<Item>(inventorySize);
    }

    public boolean addItem(Item item){
        if(itemList.size() < inventorySize){
            lock.lock();
            try{
                if(itemList.size() < inventorySize){
                    itemList.add(item);
                    System.out.println(Thread.currentThread()+" add item success!");
                    return true;
                }
            }finally {
                lock.unlock();
            }
        }

        return false;
    }


}
