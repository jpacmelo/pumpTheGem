package org.academiadecodigo.bootcamp;

/**
 * Piggy bank class
 */
public class PiggyBank {

    private int money;

    // returns the amount of money withdraw
    public int withdraw(int money) {

        // exception case handling
        if (money > this.money) {
            int removedMoney = this.money;
            this.money = 0;
            return removedMoney;
        }

        // normal case
        this.money -= money;
        return money;
    }

    public void deposit(int money) {
       this.money += money;
    }

    public String getInfo(){
        return "Piggybank has " + money + " money.";
    }

}

