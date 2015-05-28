package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request){
        if(next != null){
            next.handleRequest(request);
        }
    }

    public void printHandling(Request request){
        System.out.println(this + " handling the request: "+request);
    }

    @Override
    public abstract String toString();
}
