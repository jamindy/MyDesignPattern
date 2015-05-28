package com.jamindy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by admin on 15-5-28.
 */
public class Wizard extends Target {

    private Deque<Command> undoStack = new LinkedList<Command>();

    public Wizard() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    public void castSpell(Command command, Target target) {
        System.out.println(this + " casts " + command + " at " + target);
        command.execute(target);
        undoStack.offerLast(command);

    }

    public void undoLastSpell() {
        if(!undoStack.isEmpty()){
            Command preCommand = undoStack.pollLast();
            System.out.println(this+" undos "+preCommand);
            preCommand.undo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
