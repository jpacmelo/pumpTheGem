package org.academiadecodigo;

/**
 * Application entry point
 */
public class Main {

    public static void main(String[] args) {

        Game g = new Game(3, new Player("Raquel"), new Player("Fred"));
        g.start();


    }
}
