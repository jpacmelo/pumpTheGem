package org.academiadecodigo.carcrash.field;

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;


    public Direction oppositeDirection(){

        Direction newDirection = null;

        switch(this){

            case UP:
                newDirection = Direction.DOWN;
                break;
            case DOWN:
                newDirection = Direction.UP;
                break;
            case LEFT:
                newDirection = Direction.RIGHT;
                break;
            case RIGHT:
                newDirection = Direction.LEFT;
                break;
        }

        return newDirection;
    }
}
