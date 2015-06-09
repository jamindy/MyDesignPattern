package com.jamindy;

/**
 * Created by admin on 15-6-9.
 */
public enum ModelType {
    Car_Model("car model"),

    Robot_Model("robot model"),

    Dog_Model("dog model");

    private String type;

    ModelType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
