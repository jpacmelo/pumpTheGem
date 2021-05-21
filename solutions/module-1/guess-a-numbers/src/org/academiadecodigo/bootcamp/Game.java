package org.academiadecodigo.bootcamp;

public class Game {

    private int max;
    private Player[] players;

   // constructor -> upon creation you must give these values
    public Game(int max, Player[] gamePlayers){
        this.max = max;
        players = gamePlayers;
    }


    public void start(){

        int systemGuess = Randomizer.getRandom(max);
        System.out.println("Game chooses: " + systemGuess);

        boolean gameWon = false;

        while(!gameWon) {

            for (Player currentPlayer : players) {

                int playerGuess = currentPlayer.pickNumber(max);
                System.out.println(currentPlayer.getName() + " chooses " + playerGuess);

                if (playerGuess == systemGuess) {
                    System.out.println(currentPlayer.getName() + " won the game!!");
                    gameWon = true;
                    break;
                }
            }
        }


    }



}
