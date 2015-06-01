package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public class Letter extends LetterComosite {
    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    public void printThisAfter() {
        System.out.print(c);
    }

    @Override
    public void printThisBefore() {

    }
}
