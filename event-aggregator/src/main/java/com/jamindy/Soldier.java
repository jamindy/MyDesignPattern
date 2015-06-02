package com.jamindy;

/**
 * Created by admin on 15-6-2.
 */
public class Soldier extends EventEmitter {

    public Soldier(EventObserver observer) {
        super(observer);
    }

    @Override
    public void timePass(WeekDay day) {
        if(day.equals(WeekDay.TUESDAY)){
            notifyObservers(Event.WARSHIP_APPROACHING);
        }
    }
}
