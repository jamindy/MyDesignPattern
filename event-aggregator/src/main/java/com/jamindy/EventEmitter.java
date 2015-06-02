package com.jamindy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 15-6-2.
 */
public abstract class EventEmitter {
    private List<EventObserver> observerList;

    public EventEmitter() {
        this.observerList = new ArrayList<EventObserver>();
    }

    public EventEmitter(EventObserver observer){
        this();
        addObserver(observer);
    }

    public void addObserver(EventObserver observer){
        observerList.add(observer);
    }

    public void removeObserver(EventObserver observer){
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    public void notifyObservers(Event event){
        for(EventObserver observer : observerList){
            observer.onEvent(event);
        }
    }

    public abstract void timePass(WeekDay day);


}
