package com.jamindy;

/**
 * Created by admin on 15-5-26.
 */
public class Client {
    public static void main(String[] args){
         createKingdomFactory(new AsiaKingdomFactory());
         createKingdomFactory(new EuropeKingdomFactory());
    }

    private static void createKingdomFactory(KingdomFactory kingdomFactory){
        King king = kingdomFactory.createKing();
        Castle castle = kingdomFactory.createCastle();
        Army army = kingdomFactory.createArmy();

        System.out.println("The Kinddom was created!");
        System.out.println(king);
        System.out.println(castle);
        System.out.println(army);
    }
}
