package org.academiadecodigo.bootcamp;

public class Gorilla extends Animal {

    private int numOfBananas;

    public Gorilla(String name, int numOfBananas){
        super(name);
        this.numOfBananas = numOfBananas;
    }


    public void climbTrees(){
        System.out.println("wow, such a nice view from up here");
    }
}
