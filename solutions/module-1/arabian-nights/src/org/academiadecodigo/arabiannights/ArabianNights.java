package org.academiadecodigo.arabiannights;

import org.academiadecodigo.arabiannights.genie.Genie;
import org.academiadecodigo.arabiannights.genie.RecyclableDemon;

/**
 * Arabian Nights Test Class
 */
public class ArabianNights {


    /** Entry point */
    public static void main(String[] args) {

        // Instantiate a new magic lamp with capacity for 4 genies
        MagicLamp lamp = new MagicLamp(4);

        // Rub the lamp 5 times and store all genies
        Genie[] genies = new Genie[] {
                lamp.rub(2),
                lamp.rub(3),
                lamp.rub(4),
                lamp.rub(5),
                lamp.rub(1)
        };

        // Print status of all genies
        geniesStatus(genies);

        // Ask for wishes
        askForWishes(genies);
        askForWishes(genies);
        askForWishes(genies);
        askForWishes(genies);

        // Feed the lamp with a recyclable genie
        System.out.println(">>>> Will try to feed a demon to the lamp!!!");
        lamp.recharge(genies[4]);

        // Rub the lamp one more time to get a new genie
        Genie extraGenie = lamp.rub(7);

        // Ask for wish and print genie status
        extraGenie.grantWish();
        System.out.println(extraGenie);

        // Instantiate a new lamp and compare it with the existing one
        System.out.println(">>>> Will create a new lamp and compare with existing one");
        MagicLamp newLamp = new MagicLamp(4);

        System.out.println("The lamps are" + (lamp.equals(newLamp) ? " " : " not ") + "equal");

    }

    /**
     * Ask each genie in the container to grant a wish
     */
    public static void askForWishes(Genie[] genies) {

        System.out.println("======================");

        for (Genie g : genies) {
            g.grantWish();
        }

        geniesStatus(genies);
    }

    /**
     * Ask each genie in the container to print its status
     */
    public static void geniesStatus(Genie[] genies) {
        for (Genie g : genies) {
            System.out.println(g);
        }
    }

}
