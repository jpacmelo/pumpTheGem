package org.academiadecodigo.bootcamp;

public class Parrot extends Animal {


    public Parrot(String name){
        super(name);
    }

    public void fly(){
        System.out.println("flap flap flap");
    }

    @Override
    public void eat() {
        System.out.println("Squawk! Polly wants a cracker");
    }
}
