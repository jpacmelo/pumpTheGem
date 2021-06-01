package org.academiadecodigo.bootcamp;

/**
 * Application Entry Point
 */
public class Main {

    public static void main(String[] args) {

        Wallet w1 = new Wallet();
        Wallet w2 = new Wallet();
        PiggyBank pb = new PiggyBank();

        Person p1 = new Person("Catarina", pb, w1, 500);
        System.out.println(p1.getInfo());

        Person p2 = new Person("Joana", pb, w2, 0);
        System.out.println(p2.getInfo());

        p1.saveMoney(200);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());

        p1.spend(100);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());

    }
}
