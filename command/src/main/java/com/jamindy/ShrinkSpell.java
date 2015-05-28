package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public class ShrinkSpell implements Command {

    private Target target;

    @Override
    public void execute(Target target) {
        if(target.getSize() == Size.LARGE){
            target.setSize(Size.NORMAL);
        }else if(target.getSize() == Size.NORMAL){
            target.setSize(Size.SMALL);
        }else if(target.getSize() == Size.SMALL){

        }

        this.target = target;
    }

    @Override
    public void undo() {
        if(target.getSize() == Size.LARGE){

        }else if(target.getSize() == Size.NORMAL){
            target.setSize(Size.LARGE);
        }else if(target.getSize() == Size.SMALL){
            target.setSize(Size.NORMAL);
        }
    }

    @Override
    public String toString() {
        return "Shrink Spell";
    }
}
