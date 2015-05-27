package com.jamindy;

/**
 * Created by admin on 15-5-27.
 */
public enum HairType {
    BALD("bald"),

    SHORT("short"),

    CURLY("curly"),

    LONG_STRAIGHT("long_straight"),

    LONG_CURLY("long_curly");

    private String title;

    HairType(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }
}
