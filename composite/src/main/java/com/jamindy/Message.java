package com.jamindy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 15-5-28.
 */
public class Message {

    LetterComosite message1(){
        List<Word> wordList = new ArrayList<Word>();
        wordList.add(new Word(Arrays.asList(new Letter('j'),new Letter('a'),new Letter('m')
                ,new Letter('i'),new Letter('n'),new Letter('y'))));

        wordList.add(new Word(Arrays.asList(new Letter('i'),new Letter('s'))));
        wordList.add(new Word(Arrays.asList(new Letter('a'))));

        wordList.add(new Word(Arrays.asList(new Letter('b'),new Letter('o'),new Letter('y'))));

        return new Sentence(wordList);
    }
}
