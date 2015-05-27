package com.jamindy;

/**
 * Created by admin on 15-5-27.
 */
public enum Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toString();
    }


}
