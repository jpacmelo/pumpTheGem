package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.CollisionDetector;
import org.academiadecodigo.carcrash.field.Direction;
import org.academiadecodigo.carcrash.field.Position;


public abstract class Car {

    private Position pos;
    private CarType carType;
    private int speed;
    private Direction currentDirection;
    private boolean crashed = false;
    private CollisionDetector collisionDetector;

    public Car(Position pos, CarType carType, int speed) {

        this.pos = pos;
        this.carType = carType;
        this.speed = speed;

        currentDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];

    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void crash() {
        this.crashed = true;
    }

    public void move() {
        // accelerate to a random direction
        if(isCrashed()){
            return;
        }

        accelerate();

    }

    private void accelerate(){


        // if we have hit the limit... lets move in the opposite direction!!
        if(pos.onEdge(currentDirection)) {
            // choose a different direction!
           currentDirection = currentDirection.oppositeDirection();
        }


        currentDirection = chooseDirection();

        for(int moves = 0; moves < speed; moves++){
            pos.moveInDirection(currentDirection);
            collisionDetector.checkCollisions(this);

            if(isCrashed()){
                break;
            }
        }



    }

    private Direction chooseDirection(){

        // almost always chooses the same direction, just sometimes it changes...
        double probability = 0.8;
        Direction newDirection = currentDirection;

        if(Math.random() > probability){
            newDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];

            if(newDirection == currentDirection.oppositeDirection()){
                return chooseDirection();
            }


        }

        return newDirection;

    }





    @Override
    public String toString() {
        return isCrashed() ? "C" : Character.toString(carType.getSymbol());
    }


}
