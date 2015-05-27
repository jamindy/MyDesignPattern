package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class EuropeKingdomFactory implements KingdomFactory {

    @Override
    public Army createArmy() {
        return new EuropeArmy();
    }

    @Override
    public Castle createCastle() {
        return new EuropeCastle();
    }

    @Override
    public King createKing() {
        return new EuropeKing();
    }
}
