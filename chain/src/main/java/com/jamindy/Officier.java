package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public class Officier extends RequestHandler {

    public Officier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.COLLECT_TAX){
            printHandling(request);
        }else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Officier";
    }
}
