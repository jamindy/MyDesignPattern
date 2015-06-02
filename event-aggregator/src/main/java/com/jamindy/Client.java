package com.jamindy;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args )
    {
        King king = new King();
        KingsHand kingsHand = new KingsHand(king);//the key to aggregate the event

        List<EventEmitter> emitterList = new ArrayList<EventEmitter>();
        emitterList.add(kingsHand);
        emitterList.add(new LordBaelish(kingsHand));
        emitterList.add(new LordJerry(kingsHand));
        emitterList.add(new Soldier(kingsHand));

        for (WeekDay day :WeekDay.values()){
            for(EventEmitter emitter : emitterList){
                emitter.timePass(day);
            }
        }


    }
}
