package com.jamindy;

/**
 * Created by admin on 15-6-2.
 */
public class LordJerry extends EventEmitter {

    public LordJerry() {
    }

    public LordJerry(EventObserver observer) {
        super(observer);
    }

    @Override
    public void timePass(WeekDay day) {
        if(day.equals(WeekDay.SATUDAY)){
            notifyObservers(Event.TRAITOR_DETECTED);
        }
    }
}
