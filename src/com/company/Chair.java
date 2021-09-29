package com.company;

public abstract class Chair {
    private MovementBehavior movement;

    protected Chair(MovementBehavior movement){
        this.movement = movement;
    }

    public void performMovement(){
        this.movement.movement();
    }

    public MovementBehavior getMovementBehavior() {
        return movement;
    }

    public void setMovementBehavior(MovementBehavior movement) {
        this.movement = movement;
    }

    abstract void display();
}
