package teksystems.com;

import teksystems.com.models.FyreMonster;
import teksystems.com.models.Monster;
import teksystems.com.models.StoneMonster;
import teksystems.com.models.WaterMonster;

public class Main {
    public static void main (String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FyreMonster("r2u2"); //Declaring a FireMonster
        Monster m2 = new WaterMonster("u2r2"); //Declaring a WaterMonster
        Monster m3 = new StoneMonster("r2r2"); //Declaring a StoneMonster
        // Invoke the actual implementation
        System.out.println(m1.attack()); //Invoking the m1, FireMonster method.
        System.out.println(m2.attack()); //Invoking the m1, WaterMonster method.
        System.out.println(m3.attack());//Invoking the m1, StoneMonster method.

        //m1 is dead, so we're reassigning a new StoneMonster to m1
        m1 = new StoneMonster("u2u2"); //New StoneMonster created.
        System.out.println(m1.attack()); //Running the new StoneMonster's attack.

        //Now, creating a m4 monster with a "garbage" attack.
        Monster m4 = new Monster("u2u2") {
            @Override
            public String attack() {
            return "!^_&amp;^$@+%$* I don&#39;t know how to attack!";
            }//attack()
        };//m4 Monster

        System.out.println(m4.attack());

    }//main
}//Min
