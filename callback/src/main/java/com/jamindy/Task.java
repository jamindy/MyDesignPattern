package com.jamindy;


/**
 * Created by admin on 15-5-27.
 */
public abstract class Task {

    //like a template method
    public final void executeWith(CallBack callback){
        execute();
        if(callback != null){
            callback.call();
        }
    }

    public abstract void execute();
}
