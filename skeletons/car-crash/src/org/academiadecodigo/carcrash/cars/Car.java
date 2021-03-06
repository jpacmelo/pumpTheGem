package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public abstract class Car {

    /** The position of the car on the grid */
    private Position pos;

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }
}
