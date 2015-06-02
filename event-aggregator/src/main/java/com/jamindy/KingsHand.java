package com.jamindy;

/**
 * Created by admin on 15-6-2.
 */
public class KingsHand extends EventEmitter implements EventObserver {

    public KingsHand(EventObserver observer) {
        super(observer);
    }

    @Override
    public void onEvent(Event e) {
        notifyObservers(e);
    }

    @Override
    public void timePass(WeekDay day) {

    }
}
