package com.jamindy;

/**
 * Created by admin on 15-6-2.
 */
public class King implements EventObserver {

    @Override
    public void onEvent(Event e) {
        System.out.println("King get the event from Kingshand: "+e.getDescription());
    }
}
