package com.jamindy;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args )
    {
        King king = new King();
        Request request1 = new Request("Collect Tax",RequestType.COLLECT_TAX);
        king.makeRequest(request1);

        Request request2 = new Request("Defend Castle",RequestType.DEFEND_CASTLE);
        king.makeRequest(request2);

        Request request3 = new Request("Toutuor Prisoner",RequestType.TOUTUOR_PRISONER);
        king.makeRequest(request3);

    }
}
