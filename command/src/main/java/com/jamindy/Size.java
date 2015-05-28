package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public enum Size {
    SMALL("small"),

    NORMAL("normal"),

    LARGE("large");

    private String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize(){
        return size;
    }


    @Override
    public String toString() {
        return size;
    }
}
