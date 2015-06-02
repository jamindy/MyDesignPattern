package com.jamindy;

/**
 * Created by admin on 15-6-2.
 */
public enum Event {
    STARK_SIGHTED("stark sighted"),

    WARSHIP_APPROACHING("warship approaching"),

    TRAITOR_DETECTED("traitor detected");


    private String description;

    Event(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
