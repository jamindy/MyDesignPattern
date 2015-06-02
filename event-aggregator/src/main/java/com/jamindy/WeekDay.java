package com.jamindy;

/**
 * Created by admin on 15-6-2.
 */
public enum WeekDay {
    MONDEY("mondey"),

    TUESDAY("tuesday"),

    WEDSDAY("wedsday"),

    THUESDAY("thuesday"),

    FRIDAY("friday"),

    SATUDAY("satuday"),

    SUNDAY("sunday");


    private String day;

    WeekDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
