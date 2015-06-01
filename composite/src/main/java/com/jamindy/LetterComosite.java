package com.jamindy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 15-5-28.
 */
public abstract class LetterComosite {
    private List<LetterComosite> children = new ArrayList<LetterComosite>();

    public void add(LetterComosite letter){
        children.add(letter);
    }

    public int count(){
        return children.size();
    }

    public abstract void printThisBefore();

    public abstract void printThisAfter();

    public void print(){
        printThisBefore();
        for(LetterComosite letter: children){
            letter.print();
        }
        printThisAfter();
    }
}
