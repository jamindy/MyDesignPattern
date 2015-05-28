package com.jamindy;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args ) {
        Wizard wizard = new Wizard();
        Goblin goblin = new Goblin();

        wizard.printStatus();
        goblin.printStatus();

        Command invisibleSpell = new InvisibleSpell();
        Command shrinkSpell = new ShrinkSpell();

        wizard.castSpell(invisibleSpell,goblin);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.castSpell(shrinkSpell,wizard);
        wizard.printStatus();

        wizard.undoLastSpell();
        wizard.printStatus();

    }
}
