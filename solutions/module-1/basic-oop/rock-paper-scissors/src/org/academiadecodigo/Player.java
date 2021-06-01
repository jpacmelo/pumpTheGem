package org.academiadecodigo;

/**
 * Player class
 */
public class Player {

    private String name;
    private int victories = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVictories() {
        return victories;
    }

    public void win() {
        victories++;
    }

    public GameHand chooseHand() {
        GameHand[] choices = GameHand.values();
        int randomIndex = (int) (Math.random() * choices.length);
        return choices[randomIndex];
        // return GameHand.values()[(int)(Math.random() * Game.values().length];
    }

}
