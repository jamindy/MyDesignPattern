package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class AsiaKingdomFactory implements KingdomFactory {

    @Override
    public Army createArmy() {
        return new AsiaArmy();
    }

    @Override
    public Castle createCastle() {
        return new AsiaCastle();
    }

    @Override
    public King createKing() {
        return new AsiaKing();
    }
}
