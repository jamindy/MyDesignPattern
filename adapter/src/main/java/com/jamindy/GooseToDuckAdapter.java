package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class GooseToDuckAdapter implements Duck {
    private Goose goose;

    public GooseToDuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.cackle();
    }
}
