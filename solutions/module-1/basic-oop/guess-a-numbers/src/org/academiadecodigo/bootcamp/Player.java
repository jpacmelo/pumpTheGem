package org.academiadecodigo.bootcamp;

public class Player {

    private String name;

    public Player(String name){
        this.name = name;
    }

    public int pickNumber(int max){
        int result = Randomizer.getRandom(max);
        return result;
    }

    public String getName(){
        return name;
    }

}
