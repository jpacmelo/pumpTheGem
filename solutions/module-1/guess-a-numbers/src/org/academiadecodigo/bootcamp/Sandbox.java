package org.academiadecodigo.bootcamp;

public class Sandbox {

    /*
      Game > choose a number (randomly), ask players to pick a number and determine a winner
      Players > pick a number (randomly), has a name
      Randomizer > generates random numbers from 1 to a maximum...
     */

    public static void main(String[] args) {
        Player p1 = new Player("Raquel");
        Player p2 = new Player("Mia");
        Player p3 = new Player("Carla");
        Player p4 = new Player("Joana");

        Player[] players = { p1, p2, p3, p4 };


        Game game = new Game(10, players);
        game.start();

    }

}
