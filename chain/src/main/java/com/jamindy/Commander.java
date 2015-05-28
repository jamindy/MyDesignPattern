package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public class Commander extends RequestHandler {

    public Commander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.TOUTUOR_PRISONER){
            printHandling(request);
        }else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Commander";
    }
}
