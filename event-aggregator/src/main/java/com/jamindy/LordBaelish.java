package com.jamindy;

/**
 * Created by admin on 15-6-2.
 */
public class LordBaelish extends EventEmitter {

    public LordBaelish() {
    }

    public LordBaelish(EventObserver observer) {
        super(observer);
    }

    @Override
    public void timePass(WeekDay day) {
        if(day.equals(WeekDay.FRIDAY)){
            notifyObservers(Event.STARK_SIGHTED);
        }
    }
}
