package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public class InvisibleSpell implements Command {

    private Target target;

    public InvisibleSpell() {
    }

    @Override
    public void execute(Target target) {
        target.setVisibility(Visibility.UNVISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {
        if(target != null){
            target.setVisibility(Visibility.VISIBLE);
        }
    }

    @Override
    public String toString() {
        return "Invisible Spell";
    }
}
