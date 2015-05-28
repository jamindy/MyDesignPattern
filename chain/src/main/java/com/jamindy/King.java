package com.jamindy;

/**
 * Created by admin on 15-5-28.
 */
public class King {

    private RequestHandler handlerChain;

    public King() {
        buildDutyChain();
    }

    public void buildDutyChain(){
        handlerChain = new Commander(new Officier(new Soldier(null)));
    }

    public void makeRequest(Request request){
        handlerChain.handleRequest(request);
    }
}
