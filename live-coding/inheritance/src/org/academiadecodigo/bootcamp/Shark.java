package org.academiadecodigo.bootcamp;

// inheritance
public class Shark extends Animal{


    private int humansEaten = 0;

    public Shark(String name){
        super(name); // constructor of the super class....
    }

    public void eat(){
        humansEaten++;
        System.out.println("I have eaten: " + humansEaten + " delicious humans");
        // invoke the eat in my super class.....
        super.eat();
    }

    public void swim(){
        System.out.println("daaaaana.....daaaana.....danananananana NANANANAAAAAA!!");
    }
}
