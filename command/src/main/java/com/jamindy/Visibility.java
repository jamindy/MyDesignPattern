package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public enum Visibility {
    VISIBLE("visible"),

    UNVISIBLE("unvisible");

    private String visibility;

    Visibility(String visibility) {
        this.visibility = visibility;
    }

    public String getVisibility() {
        return visibility;
    }


    @Override
    public String toString() {
        return visibility;
    }
}
