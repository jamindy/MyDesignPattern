package com.jamindy;

/**
 * Created by admin on 15-5-27.
 */
public enum Armor {
    CLOTHES("clothes"),

    LEATHER("leather"),

    CHAINMAIL("chainmail"),

    PLATEMAIL("platemail");

    private String title;

    Armor(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }
}
