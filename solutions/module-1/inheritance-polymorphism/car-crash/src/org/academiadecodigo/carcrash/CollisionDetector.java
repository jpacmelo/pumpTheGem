package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;

public class CollisionDetector {

    private Car[] cars;


    public CollisionDetector(Car[] cars) {
        this.cars = cars;
    }

    public void checkCollisions(Car car){

        for(Car current: cars) {

            if(current == car){
                continue;
            }

            if(current.getPos().equals(car.getPos())){
                car.crash();
                current.crash();
            }
        }
    }
}
