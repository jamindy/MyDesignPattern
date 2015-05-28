package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public abstract class Target {

    private Size size;
    private Visibility visibility;

    public void printStatus(){
        System.out.println(this+" size is "+size+",and is "+visibility);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public abstract String toString();
}
