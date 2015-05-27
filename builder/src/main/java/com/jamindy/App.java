package com.jamindy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Hero mage = new Hero.HeroBuilder(Profession.MAGE,"Riobard").withHairType(HairType.LONG_CURLY)
                .withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER).build();

        System.out.println(mage);

        Hero warrior = new Hero.HeroBuilder(Profession.WARRIOR,"jamindy").withHairColor(HairColor.BROWN)
                .withHairType(HairType.BALD).withWeapon(Weapon.SWORD).build();
        System.out.println(warrior);

        Hero thief = new Hero.HeroBuilder(Profession.THIEF,"jerry").withHairColor(HairColor.RED)
                .withHairType(HairType.BALD).withWeapon(Weapon.AXE).build();
        System.out.println(thief);

    }
}
