package org.academiadecodigo.carcrash.cars;

public enum CarType {

    FIAT('F'),
    MUSTANG('M');

    private char symbol;

    CarType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

}
