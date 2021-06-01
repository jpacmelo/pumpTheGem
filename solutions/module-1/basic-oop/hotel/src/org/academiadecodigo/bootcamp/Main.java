package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Hotel budapest = new Hotel("Budapest Hotel", 100);
        Hotel overlook = new Hotel("The Overlook Hotel", 350);

        Person jack = new Person("Jack");
        Person madame = new Person("Madame D.");

        jack.goToHotel(budapest);
        madame.goToHotel(budapest);

        if (!madame.checkIn()) {
            System.out.println("Could not get a room for " + madame.getName());
        }

        if (!jack.checkIn()) {
            System.out.println("Could not get a room for " + jack.getName());
        }

        madame.checkOut();
        jack.checkOut();

        if (!jack.checkOut()) {
            System.out.println("Unable to checkOut twice in a row!");
        }

        if (jack.checkIn() && !jack.checkIn()) {
            System.out.println("Could not checkIn twice!");
        }

        if (jack.checkOut() && jack.checkIn()) {
            System.out.println("CheckIn after check out works fine!!!");
        }

        System.out.println(budapest);
        System.out.println(overlook);
        System.out.println(jack);
        System.out.println(madame);


    }
}
