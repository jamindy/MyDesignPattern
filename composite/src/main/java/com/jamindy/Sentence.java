package com.jamindy;

import java.util.List;

/**
 * Created by admin on 15-5-28.
 */
public class Sentence extends LetterComosite {

    public Sentence(List<Word> wordList) {
        for(Word word :wordList){
            this.add(word);
        }
    }

    @Override
    public void printThisAfter() {
        System.out.print(".");
    }

    @Override
    public void printThisBefore() {

    }
}
