package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public interface Command {

    void execute(Target target);

    void undo();

}
