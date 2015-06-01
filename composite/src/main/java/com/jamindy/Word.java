package com.jamindy;

import java.util.List;

/**
 * Created by admin on 15-5-28.
 */
public class Word extends LetterComosite {

    public Word(List<Letter> letters) {
        for(Letter letter : letters){
            this.add(letter);
        }
    }

    @Override
    public void printThisAfter() {

    }

    @Override
    public void printThisBefore() {
        System.out.print(" ");
    }
}
