package com.company;

public class Moveable implements MovementBehavior{
    @Override
    public void movement() {
        System.out.println("I can move with wheels");
    }
}
