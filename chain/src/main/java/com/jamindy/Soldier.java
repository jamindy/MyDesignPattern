package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public class Soldier extends RequestHandler{

    public Soldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.DEFEND_CASTLE){
            printHandling(request);
        }else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Soldier";
    }
}
